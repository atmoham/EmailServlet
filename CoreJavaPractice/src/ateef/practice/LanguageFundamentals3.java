package ateef.practice;

import java.util.Random;

public class LanguageFundamentals3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int x = rand.nextInt(100);

		if (x >= 90)
			System.out.println("Grade A for :" + x);
		else if (x >= 75)
			System.out.println("Grade B for :" + x);
		else if (x >= 60)
			System.out.println("Grade C for :" + x);
		else
			System.out.println("Grade D for :" + x);
	}

}
