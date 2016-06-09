package com.ateef;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Validate
{
    public static boolean checkUser(String email,String pass) 
    {
     boolean st =false;
     try{

	 //loading drivers for mysql
        Class.forName("org.postgresql.Driver");

	 //creating connection with the database 
        Connection con=DriverManager.getConnection
                       ("jdbc:postgresql://localhost/MyDB","postgres","postgres");
        PreparedStatement ps =con.prepareStatement
                            ("select * from REGISTER where email=? and pass=?");
        ps.setString(1, email);
        ps.setString(2, pass);
        ResultSet rs =ps.executeQuery();
        st = rs.next();
       
     }catch(Exception e)
     {
         e.printStackTrace();
     }
        return st;                 
 }   
}
