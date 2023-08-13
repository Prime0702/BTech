CREATE TABLE student
(
    id VARCHAR(5),
    name VARCHAR(15),
    cgpa numeric(3,1)
);
CREATE TABLE department
(
    dept_name VARCHAR(20),
    building VARCHAR(15),
    budget numeric(12,2)
    PRIMARY KEY (dept_name)
);
CREATE TABLE course
(
    course_id VARCHAR(7),
    title VARCHAR(50),
    dept_name VARCHAR(20),
    credits numeric(2,0)
    PRIMARY KEY (course_id),
    FOREIGN KEY (dept_name) REFERENCES department
);
CREATE TABLE instructor
(
    id VARCHAR(5),
    name VARCHAR(20) not NULL,
    dept_name VARCHAR(20),
    salary numeric(2,0)
    PRIMARY KEY (id),
    FOREIGN KEY (dept_name) REFERENCES department
);
INSERT INTO department
VALUES
    ('Comp. Sci.', 'Taylor', 100000.00),
    ('Biology', 'Watson', 90000.00),
    ('Elec. Eng.', 'Taylor', 85000.00),
    ('Music', 'Packard', 80000.00),
    ('Finance', 'Painter', 120000.00),
    ('History', 'Painter', 50000.00),
    ('Physics', 'Watson', 70000.00);
INSERT INTO instructor
VALUES
    ('22222','Einstein','Physics',95000.00),
    ('12121','Wu','Finance',90000.00),
    ('32343','El Said','History',60000.00),
    ('45565','Katz','Comp. Sci.',75000.00),
    ('98345','Kim','Elec. Eng.',80000.00),
    ('76766','Crick','Biology',72000.00),
    ('10101','Srinivasan','Comp. Sci.',65000.00),
    ('58583','Califieri','History',62000.00),
    ('83821','Brandt','Comp. Sci.',92000.00),
    ('15151','Mozart','Music',40000.00),
    ('33456','Gold','Physics',87000.00),
    ('76543','Singh','Finance',80000.00);
INSERT INTO course
VALUES
    ('BIO-101','Intro. to Biology','Biology',4),
    ('BIO-301','Genetics','Biology',4),
    ('BIO-399','Computational Biology','Biology',3),
    ('CS-101','Intro. to Computer Science','Comp. Sci.',4),
    ('CS-190','Game Design','Comp. Sci.',4),
    ('CS-315','Robotics','Comp. Sci.',3),
    ('CS-319','Image Processing','Comp. Sci.',3),
    ('CS-347','Database System Concepts','Comp. Sci.',3),
    ('EE-181','Intro. to Digital Systems','Elec. Eng.',3),
    ('FIN-201','Investment Banking','Finance',3),
    ('HIS-351','World History','History',3),
    ('MU-199','Music Video Production','Music',3),
    ('PHY-101','Physical Principles','Physics',4);
SELECT * 
FROM department;
SELECT *
FROM course
WHERE dept_name = 'Comp. Sci.';
SELECT *
FROM course
WHERE dept_name = 'Comp. Sci.' AND credits = 3;
UPDATE course 
set credits = 4
WHERE dept_name = 'Comp. Sci.';
DELETE FROM course
WHERE credits < 3;
CREATE TABLE student 
(
    rollnumber varchar(10), 
    name varchar(25), 
    state varchar(10)
);
INSERT INTO student
VALUES
    ('1','A','UP'),
    ('2','B','MP'),
    ('3','C','UP'),
    ('4','D','MP'),
    ('5','E','UP'),
    ('6','F','MP'),
    ('7','G','UP'),
    ('8','H','MP'),
    ('9','I','UP'),
    ('10','J','MP');
SELECT *
FROM student;
ALTER TABLE student
ADD COLUMN cgpa numeric(2,2);
