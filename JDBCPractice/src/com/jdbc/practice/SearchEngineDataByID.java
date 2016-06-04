package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchEngineDataByID {

	public static Connection dbconn;
	public static PreparedStatement stmt;
	public static ResultSet rset;

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

			// Step3: Defining a PreparedStatementobject
			String query = "Select * from SEARCH_ENGINE where id=?";
			stmt = dbconn.prepareStatement(query);

			// Step4: Execute the select query to retrieve the data
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Search Engine id: ");
			int id = in.nextInt();

			stmt.setInt(1, id);
			rset = stmt.executeQuery();

			// Step5: Read the data from the resultset
			if (rset.next()) {
				System.out.println("Id: " + rset.getString("ID") + "\t Name: " + rset.getString("Name") + "\t Url: "
						+ rset.getString("URL"));

			} else {
				System.out.println("No Row Exist for ID=" + id);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Step6: Close all the objects
			try {
				rset.close();
				stmt.close();
				dbconn.close();
				// System.out.println("Connection is closed successfully");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
