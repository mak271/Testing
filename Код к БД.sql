
CREATE DATABASE office;

DROP TABLE IF EXISTS devices;
CREATE TABLE devices(
	id_device INT PRIMARY KEY AUTO_INCREMENT,
	deviceName VARCHAR(100) NOT NULL
);

INSERT INTO devices (deviceName) VALUES
	('Принтер'),('Сканер'),('Комбайн');
	
DROP TABLE IF EXISTS cabinets;
CREATE TABLE cabinets(
	id_cabinet INT PRIMARY KEY AUTO_INCREMENT,
	cabinetNumber VARCHAR(100),
	device_id INT, 
	INDEX dev_ind (device_id),
	FOREIGN KEY (device_id)
		REFERENCES devices(id_device)
		ON DELETE CASCADE
);

INSERT INTO cabinets(cabinetNumber,device_id) 
VALUES('Кабинет 1',2),('Кабинет 2',3),('Кабинет 3',1);
	
SELECT cabinetNumber, deviceName
FROM devices INNER JOIN cabinets
ON device_id = id_device
ORDER BY id_cabinet;

DROP TABLE IF EXISTS employers;
CREATE TABLE employers (
	id_employer INT PRIMARY KEY AUTO_INCREMENT,
	employerName VARCHAR(100)
);

INSERT INTO employers (employerName) 
VALUES ('Василий Петрович'),('Алексей Веселов'),('Максим Власов');

DROP TABLE IF EXISTS employers_cab;
CREATE TABLE employers_cab (
	id INT PRIMARY KEY AUTO_INCREMENT,
	employer_id INT,
	cabinet_id INT,
	INDEX emp_ind (employer_id),
	INDEX cab_ind (cabinet_id),
	FOREIGN KEY (employer_id)
		REFERENCES employers(id_employer)
		ON DELETE CASCADE,
	FOREIGN KEY (cabinet_id)
		REFERENCES cabinets(id_cabinet)
		ON DELETE CASCADE
);

INSERT INTO employers_cab(employer_id, cabinet_id)
VALUES (1,1), (1,3), (2,2), (2,3), (3,1), (3,2);

SELECT cabinetNumber, GROUP_CONCAT(employerName) as Employers
FROM employers_cab INNER JOIN (cabinets, employers)
ON cabinet_id = id_cabinet AND employer_id = id_employer
WHERE cabinet_id = 2;


















