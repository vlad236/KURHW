package by.hospital.kurganovich.model;

import by.hospital.kurganovich.model.interfaces.Entity;

public class Patient implements Entity{
	private int idPatient;
	private String FIO;
	private String diagnosis;
	
	public Patient(){}
	
	public Patient(int idPatient, String FIO, String diagnosis) {
		this.idPatient = idPatient;
		this.FIO = FIO;
		this.diagnosis = diagnosis;
	}
	
	public int getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getFIO() {
		return FIO;
	}
	public void setFIO(String fIO) {
		FIO = fIO;
	}
}
