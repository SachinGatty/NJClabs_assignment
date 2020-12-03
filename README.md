# NJClabs_assignment
Contains assignment details about Database table, Java REST APIs.


# Installation and configuration of MySqL database

1. Details of MySql database
--Local database table,SQL to insert retrieve record from the database table--
Downloaded MySQL from https://dev.mysql.com/downloads/installer/
Downloaded--MySQL Server
            MySQL Workbench
            MySQL Shell
            (All Latest Versions)
              

2. By using MySQL Worknench login credentials we can create a Database.

Create a database
```bash
CREATE DATABASE DATABASE: NAME -CREATE DATABASE SCHHOL:;, to use the dabase table USE SCHOOL;
```
Create table
```bash
CREATE TABLE STUDENT(COLUMN NAME DATATYPE(SIZE OF THE DATA);
```

# Java and REST APIs code to insert and retreive data to/from the Database

I have used Spring Tool Suite 4 for Java

serialNo is in the from of long/int,name-string,marks-int.
Tool suite imports the neccesary files.
Devided Java code into 4 small packages.

Packages are 1)student.java
             2)studentRepo.java
             3)studentservice.java
             4)methodController.java
            
## REST API to insert the data

POST method=http://localhost:8080/studentRecord/addStudent
```bash
ex={"serialNO":111,"name":"Sam","marks":89}
```

## REST API to retrieve the data

GET method= http://localhost:8080/studentRecord/studentData 
```bash
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
```
             


                   
                   
              

               
               
             
