package by.hospital.kurganovich.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.hospital.kurganovich.connectionpool.ConnectionPool;
import by.hospital.kurganovich.model.Personnel;
import by.hospital.kurganovich.resource.SQLQueries;

public class PersonnelDAO extends AbstractDAO<Integer, Personnel> {
	private static PersonnelDAO instance;
	private static final String COLUMN_ID = "idPersonnel";
	private static final String COLUMN_FIO = "FIO";
	private static final String COLUMN_POST = "post";
	private static final String COLUMN_LOGIN = "login";
	private static final String COLUMN_PASS = "pass";

	private PersonnelDAO() {
		super();
	}

	public static PersonnelDAO getInstance() {
		if (instance == null) {
			instance = new PersonnelDAO();
		}
		return instance;
	}

	@Override
	public List<Personnel> selectAll() throws SQLException {
		List<Personnel> products = new ArrayList<>();
		Connection connection = ConnectionPool.getConnection();

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(SQLQueries.SQL_GET_ALL_PERSONNEL);
		while (resultSet.next()) {

			Personnel product = new Personnel(resultSet.getInt(COLUMN_ID), 
					resultSet.getString(COLUMN_FIO), 
					resultSet.getString(COLUMN_POST), 
					resultSet.getString(COLUMN_LOGIN), 
					resultSet.getString(COLUMN_PASS));

			products.add(product);
		}

		close(statement);
		close(connection);
		return products;
	}
}