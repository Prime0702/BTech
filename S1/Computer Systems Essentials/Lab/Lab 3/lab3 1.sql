/*1.a*/
create table Events(Event_id int primary key,
				    Event_name varchar(20),
				    Event_type varchar(10),
				    Allowed_participants int,
				    Venue varchar(10));
create table Registration(Chess_no varchar(5) primary key,
						  Event_id int,
						  Student_dept varchar(3),
						  score int);						  
/*1.b*/
insert into Events 
values (1,'Group Song','Group',10,'Stage1'),
	   (2,'Group dance','Group',10,'Stage2'),
	   (3,'Elocution','Individual',25,'Stage1'),
	   (4,'Classical Dance','Individual',20,'Stage3'),
	   (5,'Mine','Group',10,'Stage2'),
	   (6,'Fancy Dress','Individual',50,'Stage1');
/*1.c*/
insert into Registration
values ('GS1',1,'CSE',10),('GS2',1,'ECE',8),('GS3',1,'CSE',7),
	   ('GD1',2,'EEE',9),('GD2',2,'CSE',8),
	   ('E1',3,'ME',10),('E2',3,'EEE',8),
	   ('CD1',4,'CSE',10),('CD2',4,'EEE',8),('CD3',4,'CSE',8),
	   ('M1',5,'CSE',9),('M2',5,'ME',7),('M3',5,'ECE',8),
	   ('FD1',6,'ME',9),('FD2',6,'CSE',8),('FD3',6,'EEE',7),('FD4',6,'CSE',8);
/*1.d.i*/
select sum(score)
from Registration
where Student_dept='CSE';
/*1.d.ii*/
select avg(score)
from Registration
where Student_dept='CSE' and Event_id=6;
/*1.d.iii*/
select count(*)
from Registration
where Event_id=5;
/*1.d.iv*/
select max(score)
from Registration
where Student_dept='CSE';
/*1.d.v*/
select * from events
where event_type='Individual' and venue='Stage1';
/*1.e.i*/
update Events
set Allowed_Participants=30
where Event_name='Fancy Dress';
/*1.e.ii*/
Update Events
set Venue='Stage1'
where Event_name='Classical Dance';
/*1.e.iii*/
update Registration
set score=5
where Chess_no='GS3' and event_id=1;
/*1.e.iv*/
update Registration
set score=9
where event_id=6 and student_dept='CSE';
/*1.e.v*/
update events
set venue='Stage3'
where venue='Stage2';
/*1.f*/
delete from events
where allowed_participants<26 and venue='Stage1' and event_type='Individual';
select * from events;
/*1.g*/
copy events to 'D:\19CSE101\lab\lab 3\events.csv' csv header;
copy registration to 'D:\19CSE101\lab\lab 3\registration.csv' csv header;
drop table events;
drop table registration;