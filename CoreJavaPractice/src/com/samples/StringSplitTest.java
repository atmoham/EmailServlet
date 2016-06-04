package com.samples;


public class StringSplitTest {

	public static void main(String[] args) {
		
		String s = new String("Amzad Basha Shaik, Ateef, Raj, Sravan");
		String[] a = s.split(",");
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].trim());
		}
	}

}
