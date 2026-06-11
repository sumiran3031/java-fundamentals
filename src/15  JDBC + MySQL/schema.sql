CREATE DATABASE IF NOT EXISTS javadb;
USE javadb;

CREATE TABLE IF NOT EXISTS students (
    id     INT PRIMARY KEY AUTO_INCREMENT,
    name   VARCHAR(100),
    age    INT,
    course VARCHAR(100)
);
