package activitytracker;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.*;
import java.time.LocalDateTime;

public class ActivityTrackerMain {


    /* public void insertActivity(Activity activity, Datasource dataSource){

        try (Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO activities(start_time, activity_desc, activity_type) VALUES (?,?,?)")){
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();

        } catch (SQLException se) {
            throw new IllegalArgumentException("Cannot insert!", se);
        }
    }

    public Activity findById(DataSource dataSource, long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?")) {
             stmt.setLong(1, id);
             List<Activity> result = selectActivityByPreparedStatement(stmt);
             if (result.size() == 1){
                 return result.get(0);
             }
             throw new IllegalArgumentException("Not found!");
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot read!", se);
        }
    }

        public List<Activity> selectActivityByPreparedStatement(PreparedStatement stmt){
             List<Activity> result = new ArrayList<>();

             try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                     Activity activity = new Activity(rs.getInt("id"), rs.getTimestamp(2).toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString(4)));
                     result.add(activity);
                 }
                 return result;
             }
             catch (SQLException se) {
             throw new IllegalArgumentException("Execution failed!", se);
        }
    }

    public List<Activity> selectAllActivities(DataSource dataSource) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities")){
             return selectActivityByPreparedStatement(stmt);
        } catch (SQLException se){
            throw new IllegalArgumentException("Cannot connect!", se);
        }
    }

     */

  public static void main(String[] args) {

      MariaDbDataSource dataSource;

      try {
          dataSource = new MariaDbDataSource();
          dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
          dataSource.setUser("activitytracker");
          dataSource.setPassword("activitytracker");
      }   catch (SQLException se) {
          throw new IllegalStateException("Cannot connect!", se);
      }

       Flyway flyway = Flyway.configure().dataSource(dataSource).load();

            flyway.clean();
            flyway.migrate();

       ActivityDao activityDao = new ActivityDao(dataSource);

  Activity activity_1 = new Activity(LocalDateTime.of(2021,02,22,15,15),"Biking in Bakony",ActivityType.BIKING);
  Activity activity_2 = new Activity(LocalDateTime.of(2021,01,15,14,20),"Running in Ravazd",ActivityType.RUNNING);
  Activity activity_3 = new Activity(LocalDateTime.of(2021,02,18,13,30),"Biking in Budapest",ActivityType.BIKING);
  Activity activity_4 = new Activity(LocalDateTime.of(2021,01,25,12,20),"Hiking in Pilis",ActivityType.HIKING);



    activityDao.saveActivity(activity_1);
    activityDao.saveActivity(activity_2);
    activityDao.saveActivity(activity_3);
    activityDao.saveActivity(activity_4);

      System.out.println(activityDao.selectByType(ActivityType.BIKING));

  }
}
