package com.samples;

public class BooleanUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			if (stringToBoolean(args[0]))
				System.out.println(args[0] + " is TRUE");
			else
				System.out.println(args[0] + " is FALSE");
		} else {
			System.out.println("Run the program with a bool to test");
		}
	}

	private static boolean stringToBoolean(String str) {

		if (str.equals("0"))
			return false;

		str = str.toLowerCase();
		if (str.equals("false"))
			return false;
		if (str.equals("no"))
			return false;

		// if it's non false, it's true by definition
		return true;

	}

}
