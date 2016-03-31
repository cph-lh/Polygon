DROP DATABASE IF EXISTS PolygonDB;
Create DATABASE PolygonDB;
use PolygonDB;
DROP TABLE IF EXISTS buildings;
DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
        cID INT NOT NULL,
        cName VARCHAR(20) NOT NULL,
        cPhone INT(8),
        cAddress VARCHAR(25),
        cPassword VARCHAR (15),
primary key (cID));

CREATE TABLE buildings	(
	bName VARCHAR(20) NOT NULL,
    	bAddress VARCHAR(25) NOT NULL,
    	bParcel INT NOT NULL,
    	bFloors INT default null,
        cID INT NOT NULL,
    	bSize INT NOT NULL,
    	bStatus INT default NULL,
foreign key (cID) references customers(cID));

insert into customers VALUES ('1111','TestPerson1','22334455','1234');
select * from customers; 