package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveActivity(Activity activity){

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

    public Activity findActivityById(long id){
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

    public List<Activity> selectAllActivities() {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities")){
            return selectActivityByPreparedStatement(stmt);
        } catch (SQLException se){
            throw new IllegalArgumentException("Cannot connect!", se);
        }
    }

    public List<Activity> selectByType(ActivityType type){

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type = ?")){
             stmt.setString(1,type.toString());
            return selectActivityByPreparedStatement(stmt);
        } catch (SQLException se){
            throw new IllegalArgumentException("Cannot connect!", se);
        }
    }
}


