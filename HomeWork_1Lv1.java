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
		/*System.out.println(positive_or_negative());*/
		System.out.println(negative_true());
	} 
	public static long calculate(int a, int b, int c, int d){// method return calculate
		return a * (b + (c / d));
	}
	public static boolean limit10to20 (){ // calculate  2 number and compare limit
		System.out.println("Enter two number limit from 10 to 20?");
		Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
		int b = scanner.nextInt();
		if ((a + b) >= 10 && (a + b) <= 20)
			return true;
		else
			return false;
	}
	/*public static int positive_or_negative (String (a)){ // compare positive or negative number
		String p = "positive";
		String n = "negative";
		System.out.println("Enter positive or negative number");
		Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
		if (a >= 0)
			return p;
		else
			return n;
	}*/
	public static boolean negative_true (){ // compare negative number with true or false
		System.out.println("Enter negative number");
		Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
		if (a < 0)
			return true;
		else
			return false;
	}
}
