DROP TABLE countries;
DROP TABLE continents;

CREATE TABLE IF NOT EXISTS countries (
	id serial PRIMARY KEY,
	name VARCHAR(256) NOT NULL,
	code INT NOT NULL,
	continent VARCHAR(256)
);

CREATE TABLE IF NOT EXISTS continents (
	id serial PRIMARY KEY,
	name VARCHAR(256) NOT NULL
);

SELECT * FROM continents;
SELECT * FROM countries;


