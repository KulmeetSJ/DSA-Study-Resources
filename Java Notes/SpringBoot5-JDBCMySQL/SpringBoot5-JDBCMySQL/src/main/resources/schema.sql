/* schema.sql */
drop table if exists server;

create table server (
    serverid INT PRIMARY KEY AUTO_INCREMENT,
    serverName varchar(15),
    ipAddr varchar(15),
    location varchar(15)
);