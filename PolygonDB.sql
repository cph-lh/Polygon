DROP DATABASE IF EXISTS PolygonDB;
Create DATABASE PolygonDB;
use PolygonDB;
DROP TABLE IF EXISTS buildings;
DROP TABLE IF EXISTS customers;


CREATE TABLE buildings	(
	bName VARCHAR(20) NOT NULL,
    	Address VARCHAR(25) NOT NULL,
    	bParcel INT NOT NULL,
    	bFloors INT NOT NULL,
    	bSize INT NOT NULL,
    	bStatus INT NOT NULL,
Primary KEY (bParcel));

CREATE TABLE customers (
		cID INT NOT NULL,
		cName VARCHAR(20) NOT NULL,
    	cAddress VARCHAR(25) NOT NULL,
        cPhone INT(8),
		bParcel INT NOT NULL,
        cPass VARCHAR (15),
primary key (cID),
foreign key (bParcel) references buildings(bParcel));

insert into buildings values ('
insert into customers VALUES ('1111','TestPerson1','Nowherestreet 323','22334455','98756','1234');