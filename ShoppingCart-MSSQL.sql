USE master

DROP DATABASE ShopMates

CREATE DATABASE ShopMates
GO

USE ShopMates
GO

CREATE SEQUENCE AccountSeq START WITH 1 INCREMENT BY 1;

CREATE TABLE Accounts (
  account_id VARCHAR(50) PRIMARY KEY,
  email VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  status bit NOT NULL
);

CREATE SEQUENCE CustomerSeq START WITH 1 INCREMENT BY 1;
CREATE TABLE Customer (
	customer_id VARCHAR(50) PRIMARY KEY,
	firstname NVARCHAR(100),
	lastname NVARCHAR(100),
	phone NVARCHAR(20)
)
CREATE TABLE AccCus (
	customer_id VARCHAR(50) FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
	account_id VARCHAR(50) FOREIGN KEY (account_id) REFERENCES Accounts(account_id)
)

CREATE TABLE Role (
	rolecode VARCHAR(50) NOT NULL PRIMARY KEY,
	RoleName VARCHAR(50) NOT NULL,
	Permission VARCHAR(50) NOT NULL
);

CREATE TABLE AccRole (
	account_id VARCHAR(50) NOT NULL,
	rolecode VARCHAR(50) NOT NULL,
	FOREIGN KEY (account_id) REFERENCES Accounts(account_id),
	FOREIGN KEY (rolecode) REFERENCES Role(RoleCode)
);






INSERT INTO Accounts (account_id,email,password,status) VALUES ('acc_admin','admin','123','1')
INSERT INTO Customer (customer_id,firstname,lastname,phone) VALUES ('cus_admin','Power','User','111222333')
INSERT INTO AccCus (customer_id,account_id) VALUES ('cus_admin','acc_admin')
INSERT INTO Role (rolecode,RoleName,Permission) VALUES ('AD','Administrator','Full Power')
INSERT INTO AccRole (account_id,rolecode) VALUES ('acc_admin','AD')
