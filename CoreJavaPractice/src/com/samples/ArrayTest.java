package com.samples;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		System.out.println("Size of months array: " + months.length);
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}
		System.out.println("-----------------------");
		for (String month : months) {
			System.out.println(month);
		}
	}

}
