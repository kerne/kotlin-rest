CREATE TABLE IF NOT EXISTS MESSAGE
(
    ID VARCHAR DEFAULT RANDOM_UUID() PRIMARY KEY,
    TEXT VARCHAR NOT NULL
);