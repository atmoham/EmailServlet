package com.samples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2 {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
		  Date date = new Date();

		  System.out.println("Default Date Value: " + date);
		  System.out.println("Formatted Date Value: " + dateFormat.format(date));


	}

}
