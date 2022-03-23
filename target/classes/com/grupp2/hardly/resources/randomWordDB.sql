CREATE DATABASE randomWordDB;

use randomWordDB;

CREATE TABLE fiveletter(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
word VARCHAR(5)
);

CREATE TABLE sixletter(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
word VARCHAR(6)
);

CREATE TABLE sevenletter(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
word VARCHAR(7)
);

CREATE TABLE highscore(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(45) NOT NULL,
score INT,
totalTime TIMESTAMP
);

INSERT INTO fiveletter (word)
VALUES ("testa"),
("album"),
("betyg"),
("kliar"),
("genom");

INSERT INTO sixletter (word)
VALUES ("hektar"),
("boxare"),
("mojnar"),
("andlig"),
("fryser");


INSERT INTO sevenletter (word)
VALUES ("slarvig"),
("fyrkant"),
("svordom"),
("negativ"),
("bedrift");