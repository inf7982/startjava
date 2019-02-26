CREATE DATABASE jaegers;

CREATE TABLE robots (
	id SERIAL PRIMARY KEY
	,modelName TEXT
	,mark CHAR(6)
	,height FLOAT8
	,weight FLOAT8
	,status TEXT
	,origin TEXT
	,launch DATE
	,kaijuKill INT
	);