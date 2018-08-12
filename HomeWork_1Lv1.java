/*
* Homework. Java 1. Lesson 1.
*
*@author Chingiz Shirinov 
*@version Aug 12 2018
*/

import java.util.Scanner; 

class HomeWork_1Lv1 {
public static void main (String[] args){
		byte a;// create new variables
		short b;
		int c;
		long d;
		float e;
		double f;
		boolean g;
		char h;
		long i;
		a = 5; // appoint variables 
		b = 7;
		c = 22;
		d = 1;
		i = a * (b + (c / d));
		System.out.println(" a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);// show variables
		System.out.println(" i = " + i);
		System.out.println(calculate(5,7,22,1));
		System.out.println(limit10to20());
		System.out.println(positive_or_negative());
		System.out.println(negative_true());
		System.out.println(helloName());
	} 
	public static long calculate(int a, int b, int c, int d){// method return calculate
		return a * (b + (c / d));
	}
	public static boolean limit10to20 (){ // calculate  2 number and compare limit
		/*System.out.println("Enter number 1");*/
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter first number");
        int a = scanner.nextInt();
		System.out.println("Enter second number");
		int b = scanner.nextInt();
		if ((a + b) >= 10 && (a + b) <= 20)
			return true;
		else
			return false;
	}
	public static String positive_or_negative (){ // compare positive or negative number
		/*String p = "positive";
		String n = "negative";*/
		System.out.println("Enter negative or positive number");
		Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
		String numberString = String.valueOf(a);
		if (a >= 0)
			return "Positive " + numberString;
		else
			return "Negative " + numberString;
	}
	public static boolean negative_true (){ // compare negative number with true or false
		System.out.println("Enter negative number");
		Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
		if (a < 0)
			return true;
		else
			return false;
	}
	public static String helloName (){ // output greeting
		System.out.println("Enter your name");
		Scanner scanner =  new Scanner(System.in);
        String name = scanner.next();
		return "Hello " + name + "!";
	}
		
}
