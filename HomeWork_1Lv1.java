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
		System.out.println( add(5,7,10,2) );
	} 
	static long add(int a, int b, int c, int d){// method return
		return a * (b + (c / d));
	}
}