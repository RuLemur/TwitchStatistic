insert into users (name, age, email) values('jorje',23, 'alex@ag.as');

select * from users;

delete from users where id = 3;

update users set name='igor', age = 15 where id =4;

CREATE TABLE `channels` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `FOLLOW_COUNT` int(11) NOT NULL,
  `LANGUAGE` varchar(45) DEFAULT NULL,
  `CREATE_DATE` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
