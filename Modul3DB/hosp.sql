DROP DATABASE IF EXISTS hospital;
CREATE DATABASE hospital;

USE hospital;

CREATE TABLE patient (
	idPatient INT NOT NULL AUTO_INCREMENT,
    FIO VARCHAR(45) NOT NULL,
    diagnosis VARCHAR(45) NOT NULL,
    PRIMARY KEY(idPatient)
);

CREATE TABLE personnel (
	idPersonnel INT NOT NULL AUTO_INCREMENT,
    FIO VARCHAR(45) NOT NULL,
	post VARCHAR(15) NOT NULL,
    login VARCHAR(45) NOT NULL,
    pass VARCHAR(16) NOT NULL,
    PRIMARY KEY(idPersonnel)
);

CREATE TABLE appointmentType (
	idAppointment INT NOT NULL AUTO_INCREMENT,
    appointment VARCHAR(45) NOT NULL,
    appointmentType VARCHAR(45) NOT NULL,
    PRIMARY KEY (idAppointment)
);

CREATE TABLE appointment (
	id INT NOT NULL AUTO_INCREMENT,
	idAppointment INT NOT NULL,
    idPersAppoint INT NOT NULL,
    idPersExec INT NOT NULL,
    CONSTRAINT idPersAppoint FOREIGN KEY (idPersAppoint) REFERENCES personnel (idPersonnel) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT idPersExec FOREIGN KEY (idPersExec) REFERENCES personnel (idPersonnel) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT idAppointment FOREIGN KEY (idAppointment) REFERENCES appointmentType (idAppointment) ON UPDATE CASCADE ON DELETE CASCADE,
    PRIMARY KEY (id)
);

CREATE TABLE discharge (
	idPatient INT NOT NULL AUTO_INCREMENT,
    idPersonnel INT NOT NULL,
    dat DATETIME NOT NULL,
    finalDiagnosis VARCHAR(45) NOT NULL,
    CONSTRAINT idPersonnel FOREIGN KEY (idPersonnel) REFERENCES personnel (idPersonnel) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT idPatient FOREIGN KEY (idPatient) REFERENCES patient (idPatient) ON UPDATE CASCADE ON DELETE CASCADE,
    PRIMARY KEY (idPatient) 
);

	
    

