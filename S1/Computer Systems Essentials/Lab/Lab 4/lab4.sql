/*1*/
create table VaccinationDetails(VID int primary key,
							    Parent_Name varchar(20),
							    Child_Name varchar(20),
							    C_Age_Months int,
							    Vacc_Name varchar(20),
							    Amount int,
							    FirstORBooster varchar(10));
								
								
/*2*/
copy VaccinationDetails 
from 'D:\19CSE101\lab\lab 4\vaccination1.csv'
csv header;

select * 
from VaccinationDetails;


/*3.a*/
select Parent_Name, c_age_months 
from VaccinationDetails;


/*3.b*/
select max(c_age_months)
from VaccinationDetails
where Vacc_Name='Rotavirus 3' and FirstORBooster='First';


/*3.c*/
select count(distinct vacc_name)
from VaccinationDetails;


/*3.d*/
select sum(amount)
from VaccinationDetails
where Parent_Name='Damodaran P';


/*3.e*/
select count(*)
from VaccinationDetails
where Child_Name = 'Ajith A' and FirstORBooster='BOOSTER';


/*3.f*/
select avg(amount)
from VaccinationDetails
where Vacc_Name='Rotavirus 3' and FirstORBooster='BOOSTER';


/*3.g*/
select count(*)
from VaccinationDetails
where c_age_months>7;


/*3.h*/
select distinct Vacc_name
from VaccinationDetails;


/*3.i*/
select Child_Name, c_age_months, Vacc_name
from VaccinationDetails
order by c_age_months;


/*3.j*/
select Distinct Vacc_name
from VaccinationDetails
where c_age_months=6;


/*3.k*/
select c_age_months,vacc_name,firstorbooster
from VaccinationDetails
where child_name='Ajith A' and Parent_name='Achuthan C V';


/*3.l*/
select distinct vacc_name,amount
from VaccinationDetails
order by amount desc;


/*3.m*/
select vacc_name
from VaccinationDetails
where child_name='Neethu D' and firstorbooster='First';


/*4*/
insert into VaccinationDetails
values (13, 'Francis', 'Feby', 3, 'Rotavirus 1', 1000, 'First'),
	   (14, 'Damodaran P', 'Neethu D', 2, 'OPV 1', 500,NULL),
	   (15, 'Francis', 'Freddy', 18, 'DPT', 1500, 'BOOSTER');
	   
select *
from VaccinationDetails;


/*5.a*/
update VaccinationDetails
set firstorbooster='BOOSTER'
where vacc_name='Hib 1';

select * 
from VaccinationDetails;


/*5.b*/
update VaccinationDetails
set firstorbooster='First'
where child_name='Neethu D' and vacc_name='OPV 1';

select * 
from VaccinationDetails;


/*5.c*/
update VaccinationDetails
set amount=amount+300
where vacc_name='Hib 1';

select * 
from VaccinationDetails;


/*6.a*/
delete from VaccinationDetails
where child_name='Ajith A' and parent_name='Bhaskaran H';

select *
from VaccinationDetails;


/*6.b*/
delete from VaccinationDetails
where c_age_months<5 
  and vacc_name='Rotavirus 1' 
  and firstorbooster='First';
  
select * 
from VaccinationDetails;


/*6.c*/
delete from VaccinationDetails
where c_age_months>10
  and vacc_name='DPT'
  and firstorbooster='First';
  
Select *
from VaccinationDetails;


/*7*/
copy VaccinationDetails 
to 'D:\19CSE101\lab\lab 4\updatedvaccine.csv'
csv header;
