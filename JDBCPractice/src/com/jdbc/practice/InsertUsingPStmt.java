package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPStmt {

	public static Connection dbconn;
	public static PreparedStatement stmt;

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
			String query = "Insert into SEARCH_ENGINE(id, name, url) values (?, ?, ?)";
			stmt = dbconn.prepareStatement(query);

			// Step4: Read the data to insert
			Scanner in = new Scanner(System.in);
			int id = 7;
			System.out.println("Enter Search Engine Name: ");
			String name = in.nextLine();

			System.out.println("Enter Search Engine Url: ");
			String url = in.nextLine();

			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, url);

			in.close();

			// Step5: Run the above query to insert the data
			int i = stmt.executeUpdate();
			System.out.println(i + " record is inserted into 'Search_Engine' successfully..");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Step6: Close all the objects
			try {
				stmt.close();
				dbconn.close();
				// System.out.println("Connection is closed successfully");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
