CREATE DATABASE jaegers;

CREATE TABLE robots
(
    id        SERIAL PRIMARY KEY NOT NULL,
    modelName TEXT               NOT NULL,
    mark      CHAR(6)            NOT NULL,
    height    FLOAT8             NOT NULL,
    weight    FLOAT8             NOT NULL,
    status    TEXT               NOT NULL,
    origin    TEXT               NOT NULL,
    launch    DATE               NOT NULL,
    kaijuKill INTEGER            NOT NULL
);