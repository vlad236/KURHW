package by.hospital.kurganovich.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.hospital.kurganovich.connectionpool.ConnectionPool;
import by.hospital.kurganovich.model.Patient;
import by.hospital.kurganovich.model.Personnel;
import by.hospital.kurganovich.resource.SQLQueries;

public class PatientDAO extends AbstractDAO<Integer, Patient> {
	private static PatientDAO instance;
	private static final String COLUMN_ID = "idPatient";
	private static final String COLUMN_FIO = "FIO";
	private static final String COLUMN_DIAGNOSIS = "diagnosis";
	
	private PatientDAO() {
		super();
	}

	public static PatientDAO getInstance() {
		if (instance == null) {
			instance = new PatientDAO();
		}
		return instance;
	}

	@Override
	public List<Patient> selectAll() throws SQLException {
		List<Patient> patients = new ArrayList<>();
		Connection connection = ConnectionPool.getConnection();

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(SQLQueries.SQL_GET_ALL_PATIENTS);
		while (resultSet.next()) {

			Patient patient = new Patient(resultSet.getInt(COLUMN_ID), 
					resultSet.getString(COLUMN_FIO), 
					resultSet.getString(COLUMN_DIAGNOSIS));

			patients.add(patient);
		}

		close(statement);
		close(connection);
		return patients;
	}
	
	public Patient getPatient(int id) throws SQLException {

		Patient patient = null;
		Connection connection = ConnectionPool.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.SQL_GET_PATIENT);
		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			patient = new Patient(resultSet.getInt(COLUMN_ID), 
					resultSet.getString(COLUMN_FIO), 
					resultSet.getString(COLUMN_DIAGNOSIS));
		}

		if (preparedStatement != null) {
			preparedStatement.close();
		}
		close(connection);
		return patient;
	}
	
	public void addPatient(Patient patient) throws SQLException {

		Connection connection = ConnectionPool.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.SQL_ADD_PATIENT);	
		preparedStatement.setString(1, patient.getFIO());
		preparedStatement.setString(2, patient.getDiagnosis());
		preparedStatement.executeUpdate();
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		close(connection);
	}
	
	public void updatePatient(Patient patient) throws SQLException {

		Connection connection = ConnectionPool.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.SQL_UPDATE_PATIENT);	
		preparedStatement.setString(1, patient.getFIO());
		preparedStatement.setString(2, patient.getDiagnosis());
		preparedStatement.setInt(3, patient.getIdPatient());
		preparedStatement.executeUpdate();
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		close(connection);
	}

	public void deletePatient(int idPatient) throws SQLException {

		Connection connection = ConnectionPool.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.SQL_DELETE_PATIENT);
		preparedStatement.setInt(1, idPatient);

		preparedStatement.executeUpdate();
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		close(connection);
	}


}
