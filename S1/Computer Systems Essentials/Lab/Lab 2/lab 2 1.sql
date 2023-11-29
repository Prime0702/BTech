create table StudentDetails
(
	RollNo varchar(6) primary key,
	Name varchar(50),
	Gender varchar(6),
	Branch varchar(3),
	District varchar(20),
	State varchar(30),
	HorD varchar(10), 
	AdmissionYear int,
	CGPA float,
	Batch char);
select * from StudentDetails;

copy StudentDetails from 'D:\19CSE101\lab\week 6\studentdata.csv' csv header;
select * from StudentDetails;

select name from StudentDetails where rollno='A14062';

select count(*) 
from StudentDetails 
where district='Thiruvanathapuram';

select count(*) 
from StudentDetails 
where state='ANDHRA PRADESH';

select count(*) 
from StudentDetails 
where branch='ME' and admissionyear=2014;

select count(*) 
from StudentDetails 
where branch='CSE' and batch='A' and admissionyear=2014;

select  AdmissionYear,count(branch) 
from studentdetails 
where AdmissionYear in (2008,2010,2012,2005) and branch ='CSE' 
group by  AdmissionYear;

select  AdmissionYear,count(branch) 
from studentdetails 
where AdmissionYear in (2008,2010,2012,2005) and branch ='ME' 
group by  AdmissionYear;

select  AdmissionYear,count(branch) 
from studentdetails 
where AdmissionYear in (2008,2010,2012,2005) and branch ='EEE' 
group by  AdmissionYear;

select  AdmissionYear,count(branch) 
from studentdetails 
where AdmissionYear in (2008,2010,2012,2005) and branch ='ECE' 
group by  AdmissionYear;

select count(Gender)
from studentdetails
where gender='Male' and branch='CSE';

select count(Gender)
from studentdetails
where gender='Male' and branch='ME';

select count(Gender)
from studentdetails
where gender='Female' and branch='ME';

select count(Gender)
from studentdetails
where gender='Female' and branch='CSE';

select branch,hord,count(hord)
from studentdetails
where branch in ('CSE','ME')
group by hord,branch;

select branch,hord,count(hord)
from studentdetails
where branch in ('CSE','ME')
group by hord,branch;

select branch,count(cgpa)
from studentdetails
where cgpa>9 and admissionyear=2014
group by branch;

select branch,count(cgpa)
from studentdetails
where cgpa<6 and hord='Hostelite'
group by branch;

select branch,count(cgpa)
from studentdetails
where cgpa>8 and hord='Dayscholar'
group by branch;

select branch,count(cgpa)
from studentdetails
where cgpa between 5 and 7 and gender='Female'
group by branch;

select branch,avg(cgpa)
from studentdetails
where admissionyear=2014
group by branch;

select branch,avg(cgpa)
from studentdetails
where admissionyear=2014 and gender='Female'
group by branch;

select branch,avg(cgpa)
from studentdetails
where admissionyear=2014 and gender='Male'
group by branch;

select branch,avg(cgpa)
from studentdetails
where admissionyear=2014 and hord='Hostelite'
group by branch;

select branch,avg(cgpa)
from studentdetails
where admissionyear=2014 and hord='Dayscholar'
group by branch;

select branch,max(cgpa),min(cgpa)
from studentdetails
where admissionyear=2014
group by branch;

select branch,MAX(cgpa)
from studentdetails
where admissionyear=2014 and hord='Hostelite'
group by branch;

select branch,min(cgpa)
from studentdetails
where admissionyear=2014 and hord='Dayscholar' and district='Kollam'
group by branch;

select branch,MAX(cgpa)
from studentdetails
where admissionyear=2014 and hord='Hostelite' and gender='Female'
group by branch;

select branch,MAX(cgpa)
from studentdetails
where admissionyear=2014 and hord='Hostelite' and state='BIHAR'
group by branch;

select branch,min(cgpa)
from studentdetails
where admissionyear=2014 and district='Trivandrum' and state='KERALA'
group by branch;