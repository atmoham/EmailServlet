package com.samples;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {

		String s = new String("Amzad Basha Shaik, Ateef, Raj, Sravan");
		StringTokenizer st = new StringTokenizer(s, ",");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
