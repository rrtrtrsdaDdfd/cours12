CREATE TABLE student (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(255),
                         surname VARCHAR(255),
                         group_id INT,
                         CONSTRAINT fk_group
                             FOREIGN KEY (group_id)
                                 REFERENCES un_groups (id)
                                 ON DELETE CASCADE
);