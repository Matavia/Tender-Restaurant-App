DROP DATABASE IF EXISTS project_organizer;
CREATE DATABASE project_organizer;
DROP TABLE IF EXISTS employee CASCADE;
DROP TABLE IF EXISTS department CASCADE;
DROP TABLE IF EXISTS project CASCADE;
DROP TABLE IF EXISTS project_employee CASCADE;


CREATE TABLE employee
(
        id              serial         PRIMARY KEY,
        first_name      varchar(64),
        last_name       varchar(64),
        job_title       varchar(64),
        department_id   int,             
        hire_date       DATE            NOT NULL,
        gender          varchar(16),
        date_of_birth   DATE            NOT NULL
        
        
        
);

CREATE TABLE department
(

        id              serial          PRIMARY KEY,
        dept_number     int,
        dept_name       varchar(64),
        num_of_emp      int
);

CREATE TABLE project_employee
(
        project_emp_id  varchar(64)    PRIMARY KEY,
        project_id      int,             
        employee_id     int,             
        department_id   int
                  
        
);

CREATE TABLE project
(
        id              int          PRIMARY KEY,
        project_name    varchar(64),    
        start_date      DATE            NOT NULL,
        num_of_emp      int
                 
);


       
 
 INSERT INTO employee (first_name, last_name, job_title,department_id, hire_date, gender, date_of_birth)
 VALUES ( 'Bob', 'Bill', 'Writer',001, '01-19-2021','Female','08-27-1990'),
        ('Okey', 'Dokey', 'Designer',001, '07-12-2021', 'Non-Binary','09-23-21'),
        ('Wishing', 'Well', 'Crap Checker',002, '07-12-2021', 'Non-Binary','09-23-21'),
        ('Ted', 'Bundy', 'Paper Shredder',002, '07-12-2021', 'Male','09-23-21'),
        ('Jelly', 'Fish', 'Bad New Bearer',002, '07-12-2021', 'Non-Binary','09-23-21'),
        ('SpongeBob', 'SquarePants', 'Bubble - Blower',003, '07-12-2021', 'Non-Binary','09-23-21'),
        ('Patrick', 'Star', 'Comic Relief',003, '07-12-2021', 'non-binary','09-23-21'),
        ('Steve', 'McQueen', 'Entertainer',003, '07-12-2021', 'non-binary','09-23-21');
        
 INSERT INTO department (dept_number, dept_name, num_of_emp)
 VALUES ( '100', 'Art', 2),
        ('200', 'Quality Assurance',3),
        ('300', 'Fun',3);
        
 INSERT INTO project ( id,project_name, num_of_emp,start_date)
 VALUES (77, 'The Give N Go', 2, '05-05-2005'),
        (78,'No Dont Touch That ',1,'07-07-2007'),
        (79,'Is This Really Life',2,'03-03-2003'),
        (80,'Bird The Word',3, '08-08-2008');
        
 INSERT INTO project_employee (project_emp_id,employee_id,department_id,project_id)
 VALUES ('77-01',1,001,77),
        ('77-02',2,001,77),
        ('78-01',3,002,78),
        ('79-01',4,002,79),
        ('79-02',5,002,79),
        ('80-01',6,003,80),
        ('80-02',7,003,80),
        ('80-03',8,003,80);
   

       
 ALTER TABLE employee

        ADD CONSTRAINT fk_department_id_id      FOREIGN KEY             (department_id) REFERENCES          department(id); 
        
ALTER TABLE project_employee
       
       
       ADD CONSTRAINT fk_proj_emp_department_id     FOREIGN KEY         (department_id) REFERENCES        department(id),
       ADD CONSTRAINT fk_employee__id_id         FOREIGN KEY             (employee_id) REFERENCES           employee(id),
       ADD CONSTRAINT fk_proj_emp_project_id        FOREIGN KEY             (project_id) REFERENCES           project(id);
       


     

        