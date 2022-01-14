--  create database

CREATE TABLE jaegersInfo (
 id		SERIAL PRIMARY KEY,
 modelName      TEXT,
 mark           CHAR(6),
 height		     INTEGER,
 weight		     REAL,
 status		     TEXT,
 origin		     TEXT,
 launch		     DATE,
 kaijuki	     INTEGER
);
