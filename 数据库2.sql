create database DB;
use DB;

CREATE TABLE `users` (
  `name` varchar(20) DEFAULT NULL,
  `usertype` enum('administrator','teacher','student') NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `realname` varchar(20) DEFAULT NULL,
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `studetail` (
  `SID` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) NOT NULL,
  `realname` varchar(20) DEFAULT NULL,
  `password` varchar(20) NOT NULL,
  `student_number` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `ID_card` varchar(20) DEFAULT NULL,
  `major` varchar(30) DEFAULT NULL,
  `academy` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`SID`),
  UNIQUE KEY `sname` (`sname`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


CREATE TABLE `teacherdetail` (
  `TID` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(20) NOT NULL,
  `realname` varchar(20) DEFAULT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`TID`),
  UNIQUE KEY `tname` (`tname`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


CREATE TABLE `admin` (
  `AID` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(20) NOT NULL,
  `realname` varchar(20) DEFAULT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`AID`),
  UNIQUE KEY `aname` (`aname`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


CREATE TABLE `coursebase` (
  `cname` varchar(36) NOT NULL,
  `iscompulsory` tinyint(1) NOT NULL,
  PRIMARY KEY (`cname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `course` (
  `CID` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(36) NOT NULL,
  `classroom` varchar(10) DEFAULT NULL,
  `classtime` varchar(8) NOT NULL,
  `tnumber` int(11) DEFAULT '100',
  `rnumber` int(11) DEFAULT '100',
  `iscompulsory` tinyint(1) NOT NULL,
  `tname` varchar(20) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`CID`),
  KEY `fk3` (`tname`),
  KEY `fk10` (`cname`),
  CONSTRAINT `fk10` FOREIGN KEY (`cname`) REFERENCES `coursebase` (`cname`),
  CONSTRAINT `fk3` FOREIGN KEY (`tname`) REFERENCES `teacherdetail` (`tname`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;



CREATE TABLE `stu_course` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SID` int(11) NOT NULL,
  `CID` int(11) NOT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk4` (`SID`),
  KEY `fk5` (`CID`),
  CONSTRAINT `fk4` FOREIGN KEY (`SID`) REFERENCES `studetail` (`SID`),
  CONSTRAINT `fk5` FOREIGN KEY (`CID`) REFERENCES `course` (`CID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

CREATE TABLE `loginhistory` (
  `name` varchar(20) NOT NULL,
  `intime` datetime DEFAULT NULL,
  `outtime` datetime DEFAULT NULL,
  PRIMARY KEY (`name`),
  CONSTRAINT `fk6` FOREIGN KEY (`name`) REFERENCES `users` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `adda`(name varchar(20),passwd varchar(20),sex varchar(10),city varchar(10),rname varchar(20))
begin
insert into users values
(name,('administrator'),passwd,null,sex,city,rname);
insert into admin values
(null,name,rname,passwd);

end$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `adds`(name varchar(20),passwd varchar(20),sex varchar(10),city varchar(10),rname varchar(20))
begin
insert into users values
(name,('student'),passwd,null,sex,city,rname);
insert into studetail values
(null,name,rname,passwd,null,null,null,null,null);

end$$
DELIMITER ;


DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `addt`(name varchar(20),passwd varchar(20),sex varchar(10),city varchar(10),rname varchar(20))
begin
insert into users values
(name,('teacher'),passwd,null,sex,city,rname);
insert into teacherdetail values
(null,name,rname,passwd);

end$$
DELIMITER ;

call adda('root','admin',null,null,'root');
call addt('teacher','666666','null',null,'TEACHER');
call adds('zedd','777777','null','null','Zedd');


