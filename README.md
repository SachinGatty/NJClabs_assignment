# NJClabs_assignment
Contains assignment details about Database table, Java REST APIs.


installation and configuration of MySqL database.

--Local database table,SQL to insert retrieve record from the database table--
Downloaded MySQL from https://dev.mysql.com/downloads/installer/
Downloaded--MySQL Server
            MySQL Workbench
            MySQL Shell
            (All Latest Versions)
              

By using MySQL Worknench login credentials we can create a Database.

Created a database

CREATE DATABASE DATABASE: NAME -CREATE DATABASE SCHHOL:;, to use the dabase table USE SCHOOL;

To create table-

CREATE TABLE STUDENT(COLUMN NAME DATATYPE(SIZE OF THE DATA);


--Java code to insert and retreive from the Database table,REST APIs--

To write Java code i have used Spring Tool Suite 3.
serialNo,name,marks are column headers.
serialNo is in the from of long/int,name-string,marks-int.
Tool suite imports the neccesary files.
Devided Java code into 4 small packages.

Packages are 1)student.java
             2) studentRepo.java
             3)studentservice.java
             4)methodController.java
             
GET method= http://localhost:8080/studentRecord/studentData 
OUTPUT=  {
"serialNO": 101,
"name": "RAM",
"marks": 99
},
  {
"serialNO": 111,
"name": "Sam",
"marks": 89
}

POST method=http://localhost:8080/studentRecord/addStudent
ex={"serialNO":111,"name":"Sam","marks":89}
             


                   
                   
              

               
               
             
