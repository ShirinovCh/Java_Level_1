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
		System.out.println( calculate(5,7,22,1) );
		System.out.println( limit10to20(3,16) );
	} 
	public static long calculate(int a, int b, int c, int d){// method return
		return a * (b + (c / d));
	}
	public static boolean limit10to20 (int a, int b){ // range limit
		System.out.println("number ranging from 10 to 20?");
		if ((a + b) >= 10 && (a + b) <= 20)
			return true;
		else
			return false;
	}
}