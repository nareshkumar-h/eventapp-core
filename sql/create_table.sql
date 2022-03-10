DROP TABLE naresh_eventapp_users;
CREATE TABLE naresh_eventapp_users(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL,
PASSWORD VARCHAR(100) NOT NULL,
college_name VARCHAR(100) NOT NULL,
UNIQUE(email),
CHECK ( LENGTH(PASSWORD ) >= 8 )
);

INSERT INTO naresh_eventapp_users( NAME,email,PASSWORD,college_name)
VALUES ( 'Naresh','n@gmail.com','pass1234','LVEC'); 


SELECT * FROM naresh_eventapp_users;