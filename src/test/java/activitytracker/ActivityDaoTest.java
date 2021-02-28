package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init(){

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

            activityDao = new ActivityDao(dataSource);
    }

    @Test
    public void selectByIdTest(){
        String actual = activityDao.findActivityById(1L).toString();
        String expected = ("2021-02-15T15:00, Biking in Bécs, BIKING").toString();

        assertEquals(expected, actual);
    }

    @Test
    public void selectByIdTest_2(){
        Activity activity = activityDao.findActivityById(1L);

        assertEquals(ActivityType.BIKING, activity.getType());
    }
}