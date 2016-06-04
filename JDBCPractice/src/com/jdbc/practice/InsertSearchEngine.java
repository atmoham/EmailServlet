package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertSearchEngine {

	public static Connection dbconn;
	public static Statement stmt;

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

			// Step3: Defining a statement object
			stmt = dbconn.createStatement();
			// System.out.println("Statement Object is defined successfully");

			// Step4: Read the data to insert
			Scanner in = new Scanner(System.in);
			int id = 6;
			System.out.println("Enter Search Engine Name: ");
			String name = in.nextLine();

			System.out.println("Enter Search Engine Url: ");
			String url = in.nextLine();

			StringBuilder query = new StringBuilder("Insert into SEARCH_ENGINE (id, name, url) values ");
			query.append("(" + id + ", '" + name.trim() + "', '" + url.trim() + "')");
			System.out.println(query);

			in.close();

			// Step5: Run the above query to insert the data
			int i = stmt.executeUpdate(query.toString());
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
