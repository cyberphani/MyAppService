create table Department (
Id INT AUTO_INCREMENT PRIMARY KEY,
Name varchar(50),
Phone varchar(20),
Address varchar(200)
)


create table employee (
Id INT AUTO_INCREMENT PRIMARY KEY,
FName varchar(20),
LName varchar(20),
Email varchar(20),
DeptId INT,
Salary decimal(10,5),
Gender varchar(1),
FOREIGN KEY (DeptId) REFERENCES Department(Id)
);