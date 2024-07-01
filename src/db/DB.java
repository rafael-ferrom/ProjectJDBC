package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			}//try
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}//catch
		}//if
		return conn;
	}//getConnection
	
	public static void closeConnection() {
		if(conn != null){
			try {
				conn.close();
			}//try
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}//catch
		}//if
	}//closeConnection
	
	private static Properties loadProperties() {
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		}//try
		catch(IOException e) {
			throw new DbException(e.getMessage());
		}//catch
				
	}//loadProperties
	
	public static void closeStatement(Statement st) {
		
		if(st != null) {
			try {
				st.close();
			}//try
			catch (SQLException e) {
				throw new DbException(e.getMessage()); 
			}//catch
		}//if
		
	}//closeStatement
	
	public static void closeResultSet(ResultSet rs) {
		
		if(rs != null) {
			try {
				rs.close();
			}//try
			catch (SQLException e) {
				throw new DbException(e.getMessage()); 
			}//catch
		}//if
		
	}//closeResultSet
	
}//DB
