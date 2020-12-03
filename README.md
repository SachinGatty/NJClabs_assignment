# NJClabs_assignment
Contains assignment details about Database table, Java REST APIs.


installation and configuration of MySql database.
--Local database table,SQl to insert retrieve record from the database table--


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
1)student.java=Where i described @Entity as a class which represents a table in a related database and maps values into the database.
               =@Id which represents unique value or unique identifier here in this java code serial number,name,marks are identified as unique identifier.
               =By using Getter and Setter we can fetch and set the value.

2)studentRepo.java=Here i performed insert and save.
              Used crud respository intead of SELECT *  , crud repository is inbuilt .
              
3)studentservice.java=Describing all the services to be performed like get,findAll,save.
              In every package need to specity class,here @Service so that it can acts as a service provider and @Autowired will use studentRepo. 
             
4)methodController=Used to retrieve and post data in database table.
                   @GetMApping will retrieve the data from database table.
                   @PostMapping will posts data into the database table.
                   @RestController is used to perfrom all the ops.
                    we can use http console url to perfrom the test using any restbased cleints like postman,ARC.
                   Endpoint = /studentData
                   for example if the port number 8080.
                   http://localhost:8080/student/studentData
                   If posting a data we should use POST method.
                   If Retrieving/getting a data we should use GET method.
                   
                   
              

               
               
             
