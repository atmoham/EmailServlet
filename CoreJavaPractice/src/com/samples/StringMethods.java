package com.samples;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf = new StringBuffer("Java");
		// Append 
		buf.append(" Tiger v1/"); // Java Tiger v1/ 
		buf.append(5); // Java Tiger v1/5 
		System.out.println(buf);
		// Set 
		int index = 13; 
		buf.setCharAt(index, '.'); // Java Tiger v1.5 
		System.out.println(buf);
		// Insert 
		index = 5; 
		buf.insert(index, "Developers "); // Java Developers Tiger v1.5 
		System.out.println(buf);
		// Replace 
		int start = 25; 
		int end = 26; 
		buf.replace(start, end, "6"); // Java Developers Tiger v1.6
		System.out.println(buf);
		// Delete 
		start = 22; 
		end = 23; 
		buf.delete(start, end); // Java Developers Tiger 1.6 
		System.out.println(buf);
		// Convert to string 
		String s = buf.toString(); 
		System.out.println(s);
	}

}
