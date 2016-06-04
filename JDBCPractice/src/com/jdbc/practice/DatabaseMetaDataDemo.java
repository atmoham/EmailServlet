package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetaDataDemo {

	public static Connection dbconn;
	public static DatabaseMetaData dbmd;

	public static void main(String[] args) {

		try {
			// Step1: Loading the PostgreSQL driver
			Class.forName("org.postgresql.Driver");
			// System.out.println("PostgreSQL driver is loaded successfully");

			// Step2: Establish the Database Connection
			String dbURL = "jdbc:postgresql://localhost/MyDB";
			String user = "postgres";
			String pass = "postgres";
			dbconn = DriverManager.getConnection(dbURL, user, pass);
			// System.out.println("DB connection is established successfully");

			// Step3: Defining the DatabaseMetaDataobject
			dbmd = dbconn.getMetaData();
			
			System.out.println("Database Product: " + dbmd.getDatabaseProductName());
			System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
			System.out.println("Username: " + dbmd.getUserName());
			System.out.println("URL: " + dbmd.getURL());
			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("SP Support: " + dbmd.supportsStoredProcedures());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Step6: Close all the objects
			try {
				dbconn.close();
				// System.out.println("Connection is closed successfully");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
