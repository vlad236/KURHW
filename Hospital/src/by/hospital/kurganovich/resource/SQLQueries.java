package by.hospital.kurganovich.resource;

public abstract class SQLQueries {
	// PersonnelDAO
	public static final String SQL_GET_ALL_PERSONNEL= "SELECT personnel.idPersonnel, personnel.FIO, personnel.post, personnel.login, personnel.pass FROM personnel";
	// PatientDAO
	public static final String SQL_GET_ALL_PATIENTS= "SELECT patient.idPatient, patient.FIO, patient.diagnosis FROM patient";
	public static final String SQL_GET_PATIENT= "SELECT patient.idPatient, patient.FIO, patient.diagnosis FROM patient WHERE patient.idPatient = ?";
	public static final String SQL_ADD_PATIENT = "INSERT INTO patient (patient.FIO, patient.diagnosis) VALUES (?, ?)";
	public static final String SQL_DELETE_PATIENT = "DELETE FROM patient WHERE patient.idPatient = ?";
	public static final String SQL_UPDATE_PATIENT = "UPDATE patient SET FIO = ?, diagnosis = ? WHERE patient.idPatient = ?";
}
