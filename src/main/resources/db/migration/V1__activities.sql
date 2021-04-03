CREATE TABLE activities(id BIGINT AUTO_INCREMENT,
                        start_time TIMESTAMP,
                        activity_desc VARCHAR(255),
                        activity_type VARCHAR(255),
                        PRIMARY KEY (id));

insert into activities(start_time, activity_desc, activity_type) values ('2021-02-12 15:00:10', 'Biking in Börzsöny', 'BIKING');
insert into activities(start_time, activity_desc, activity_type) values ('2021-02-12 15:00:10', 'Running in Ravazd', 'RUNNING');
insert into activities(start_time, activity_desc, activity_type) values ('2021-02-12 15:00:10', 'Hiking in Heves', 'HIKING');
insert into activities(start_time, activity_desc, activity_type) values ('2021-02-12 15:00:10', 'Biking in Budapest', 'BIKING');