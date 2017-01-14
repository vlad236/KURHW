/**
 * 
 */
package by.hospital.kurganovich.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.log4j.Logger;

import by.hospital.kurganovich.model.interfaces.Entity; 

/**
 * The Class AbstractDAO.
 */
public abstract class AbstractDAO<K, T extends Entity> {
	public abstract List<T> selectAll() throws SQLException;

	public void close(Statement st) {
		try {
			if (st != null) {
				st.close();
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	public void close(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
