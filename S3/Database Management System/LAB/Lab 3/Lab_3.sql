DROP TABLE CUST CASCADE;

CREATE TABLE CUST (
	CUSTID VARCHAR (30),
	LNAME VARCHAR(15),
	FNAME VARCHAR(15),
	AREA VARCHAR (2),
	PHONENO NUMERIC(8,0),
    PRIMARY KEY(CUSTID));

INSERT INTO CUST (CUSTID, LNAME, FNAME, AREA, PHONENO) 
VALUES ('A01', 'Bayross', 'Ivan', 'sa', 6125467),
	   ('A02', 'Saitwal', 'Vandana', 'mu', 5560379), 
	   ('A03', 'Jaguste', 'Pramada', 'da', 4563891), 
	   ('A04', 'Navindgi', 'Basu', 'ba', 6125401), 
	   ('A05', 'Sreedhar', 'Ravi', 'va', NULL), 
	   ('A06', NULL , 'Rukmini', 'gh', 5125274); 
	
DROP TABLE MOVIE CASCADE;

CREATE TABLE MOVIE (
	MVNO NUMERIC (2,0),
	TITLE VARCHAR(25),
	TYPE VARCHAR(10),
	STAR VARCHAR (25),
	PRICE NUMERIC(8,2),
    PRIMARY KEY(MVNO));

INSERT INTO MOVIE (MVNO, TITLE, TYPE, STAR, PRICE)
VALUES (1, 'Bloody Vengeance', 'Action','Jackie Chan', 100),
	   (2, 'The Firm', 'Thriller','Tom Cruise', 200), 
	   (3, 'Pretty Woman', 'Romance','Richard Gere', 150), 
	   (4, 'Home Alone', 'Comedy','Macaulay Culkin', 150), 
	   (5, 'The Fugitive', 'Thriller','Harrison Ford', 200), 
	   (6, 'Coma', 'Suspense','Michael Douglas', 100), 
	   (7, 'Dracula', 'Horror','Gary Oldman', 150.25), 
	   (8, 'Quick change', 'Comedy','Bill Murray', 100), 
	   (9, 'Gone with the wind', 'Drama','Clarke Gable', 200), 
	   (10, 'Carry on Doctor', 'Comedy','Leslie Phillips', 100);
	   
DROP TABLE INVOICE CASCADE;

CREATE TABLE INVOICE (
	INVNO VARCHAR(3),
	MVNO NUMERIC(2,0),
	CUSTID VARCHAR(3),
	ISSUEDATE DATE,
	RETDATE DATE,
    PRIMARY KEY(INVNO),
	FOREIGN KEY(MVNO) REFERENCES MOVIE,
	FOREIGN KEY(CUSTID) REFERENCES CUST); 

INSERT INTO INVOICE (INVNO, MVNO, CUSTID, ISSUEDATE, RETDATE)
VALUES ('i01', 4, 'A01','23-jul-2012', '25-jul-2012'),
	   ('i02', 3, 'A02','12-aug-2012 ', '15-aug-2012'), 
	   ('i03', 1, 'A02','15-aug-2012', '18-aug-2012'), 
	   ('i04', 6, 'A03','10-sep-2012', '13-sep-2012'), 
	   ('i05', 7, 'A04','05-aug-2012 ', '08-aug-2012'), 
	   ('i06', 2, 'A06','18-sep-2012', '20-sep-2012'), 
	   ('i07', 9, 'A05','07-jul-2012', '10-jul-2012'), 
	   ('i08', 9, 'A01','11-aug-2012 ', '14-aug-2012'), 
	   ('i09', 5, 'A03','06-jul-2012 ', '09-jul-2012'), 
	   ('i10', 8, 'A06','03-sep-2012 ', '06-sep-2012');

--  Find out the names of all customers.
SELECT LNAME, FNAME FROM CUST;

-- Print the entire customer table.
SELECT * FROM CUST;

-- Retrieve the list of FNAME and the AREA of all the customers.
SELECT FNAME, AREA FROM CUST;

-- List the various movie types available from the movie title.
SELECT TYPE FROM MOVIE;

-- Find the names of all customers having 'a' in the second letter in their FNAME
SELECT LNAME,FNAME FROM CUST WHERE FNAME LIKE '_a%';    

-- Find the LNAME of all customers that begin with ‘S’ or ‘J’
SELECT LNAME FROM CUST WHERE LNAME LIKE 'S%' OR LNAME LIKE 'J%';

--  Find the LNAME of all customers that is between ‘B’ and ‘S’
SELECT LNAME FROM CUST WHERE LNAME BETWEEN 'B%' AND 'S%';

-- Find out the customers who stay in an area whose second letter is ‘a'.
SELECT FNAME,LNAME FROM CUST WHERE AREA LIKE '_a%';

-- Find the list of all customers who stay in area 'ba’ or area ‘mu' or area 'gh’.
SELECT * FROM CUST WHERE AREA = 'ba' OR AREA = 'mu' OR AREA = 'gh' ;

-- Print the list of customers whose phone numbers are greater than the value 5550000. 
SELECT * FROM CUST WHERE PHONENO < 5550000;

-- Print all the information from invoice table of customers who have been issued movies in the month of September
SELECT * FROM INVOICE WHERE ISSUEDATE BETWEEN '01-sep-2012' AND '30-sep-2012';

-- Display the invoice table information for custid 'A01' and 'A02'.
SELECT * FROM INVOICE WHERE CUSTID IN('A01','A02');

-- Find the movies of type “action” and “Comedy”
SELECT TITLE FROM MOVIE WHERE TYPE IN('Action','Comedy') ;

-- Find the movies whose price is greater than 150 and less than or equal to 200.
SELECT TITLE FROM MOVIE WHERE PRICE > 150 AND PRICE <= 200;

-- Find the movies that cost more than 159 and also find the new cost as original cost* 15
SELECT TITLE, PRICE FROM MOVIE WHERE PRICE > 159;
ALTER TABLE MOVIE ADD NEW_COST NUMERIC(8,2);
UPDATE MOVIE SET NEW_COST = PRICE * 15;
SELECT * FROM MOVIE;

-- Rename the new column in the above query as new price
ALTER TABLE MOVIE RENAME COLUMN NEW_COST TO NEW_PRICE;
SELECT * FROM MOVIE;

-- List the movies in sorted order of their titles.
SELECT * FROM MOVIE ORDER BY TITLE ASC;

--  List the movies in the sorted order of type, title
SELECT * FROM MOVIE ORDER BY TITLE, TYPE ASC;

-- Print the names and types of all the movie except horror movies.
SELECT TITLE, TYPE FROM MOVIE EXCEPT SELECT TITLE, TYPE FROM MOVIE WHERE TYPE = 'Horror';

-- Calculate the square root of price of each movie.
SELECT PRICE, SQRT(PRICE) AS SQUARE_ROOT FROM MOVIE;

-- Display the type and the average price of each movie type.
SELECT TYPE, AVG(PRICE) FROM MOVIE GROUP BY TYPE;

-- Try out: select * from movie group by(type);
SELECT * FROM MOVIE GROUP BY(TYPE);

-- Try out: select count(MVNO) from movie where count(MVNO)>2;
SELECT COUNT(MVNO) FROM MOVIE WHERE COUNT(MVNO)>2;

-- Find the name and movie of the customer who have issued a movie.
SELECT CUST.LNAME, CUST.FNAME, MOVIE.TITLE FROM MOVIE, CUST
INNER JOIN INVOICE ON CUST.CUSTID = INVOICE.CUSTID;

-- List the names, areas and customer - id of customers without phone numbers.
SELECT FNAME, LNAME, AREA, CUSTID FROM CUST WHERE PHONENO IS NULL;

-- Delete all the records having return date before 10th July'93
DELETE FROM INVOICE WHERE RETDATE < '10-jul-1993';
SELECT * FROM INVOICE;

-- Change the area of customer – id 'a05' to 'vs'
UPDATE CUST SET AREA = 'vs' WHERE CUSTID = 'A05';
SELECT * FROM CUST;

-- Select the TITLE, CUSTID, MVNO for all the movies that are issued.
SELECT TITLE, CUSTID, MOVIE.MVNO FROM INVOICE ,MOVIE WHERE INVOICE.MVNO = MOVIE.MVNO;

-- Display the month (in alphabets) in which customer are supposed to return the movies
SELECT TO_CHAR(RETDATE, 'Month') AS MONTH FROM INVOICE;

-- Find out if the movie starring Amir is issued to any customer and list the CUSTID to whom it is issued.
SELECT CUSTID FROM INVOICE WHERE MVNO IN (SELECT MVNO FROM MOVIE WHERE STAR = 'Jackie Chan');

-- Find out the title of the movie that have been issued to the customer whose FNAME is vandana.
SELECT TITLE FROM MOVIE WHERE MVNO IN (SELECT MVNO FROM INVOICE WHERE CUSTID IN (SELECT CUSTID FROM CUST WHERE FNAME = 'Vandana'));

-- Add a column remark of type varchar and size 25 to the invoice table.
ALTER TABLE INVOICE ADD COLUMN REMARK VARCHAR(25);

-- Find out the movie number which has been issued to customer whose first name is ‘pramada’
SELECT  MVNO FROM INVOICE WHERE CUSTID = (SELECT CUSTID FROM CUST WHERE FNAME = 'Pramada');

-- Change the telephone number of pramada to 466389.
UPDATE CUST SET PHONENO = 466389 WHERE FNAME = 'Pramada';
SELECT * FROM CUST;

-- Change the issuedate of custid 'a01' to 24/07/93.
UPDATE INVOICE SET ISSUEDATE = '24-jul-1993' WHERE CUSTID = 'A01';
SELECT * FROM INVOICE;

-- Change the price of 'Gone with the wind' to Rs. 250.00.
UPDATE MOVIE SET PRICE = 250.00 WHERE TITLE = 'Gone with the wind';
SELECT * FROM MOVIE;

-- Delete the record with invoice number 'i05' from the invoice table
DELETE FROM INVOICE WHERE INVNO = 'i05';
SELECT * FROM INVOICE;

-- Delete all the records having return date before 10th July '93
DELETE FROM INVOICE WHERE RETDATE < '10-jul-1993';
SELECT * FROM INVOICE;

-- Change the area of custid a05 to ‘vs’
UPDATE CUST SET AREA = 'vs' WHERE CUSTID = 'A05';
SELECT * FROM CUST;

-- Insert fname for customer with lname Rukmini 
UPDATE CUST SET FNAME = 'Sita' WHERE LNAME = 'Rukmini';
SELECT * FROM  CUST;

-- Increase the price of all movies by 100.00
UPDATE MOVIE SET PRICE = PRICE + 100.00;
SELECT * FROM MOVIE;

-- Change the area of customers name with 2nd letter r to LA
UPDATE CUST SET AREA = 'la' WHERE FNAME LIKE '_r%';
SELECT * FROM CUST;











