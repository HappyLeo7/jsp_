select * from product;

create table board (
num int(5) primary key  not null auto_increment,
pass varchar(30),
name varchar(30),
email varchar(30),
title varchar(50),
content varchar(1000),
readcount int(4) default 0,
writedate datetime default current_timestamp on update current_timestamp
);