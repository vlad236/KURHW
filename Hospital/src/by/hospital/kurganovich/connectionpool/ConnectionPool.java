package by.hospital.kurganovich.connectionpool;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

 

public class ConnectionPool {
	private static final String DATASOURCE_NAME = "jdbc/hospital";
	private static DataSource dataSource;
	static {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			dataSource = (DataSource) envContext.lookup(DATASOURCE_NAME);
		} catch (NamingException e) {
			System.err.println(e.getMessage());
		}
	}

	private ConnectionPool() {
	}

	public static Connection getConnection() throws SQLException {
		Connection connection = dataSource.getConnection();
		return connection;
	}
}