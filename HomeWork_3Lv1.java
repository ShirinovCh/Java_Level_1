/*
* Homework. Java 1. Lesson 1.
*
*@author Chingiz Shirinov 
*@version Aug 12 2018
*/

import java.util.Scanner; 

class HomeWork_3Lv1 {
	public static void main (String[] args){
		System.out.println("You have 3 attempts to find the hidden number!");
		//System.out.println("Please input number from 0 to 9!");
		inputNumber();
		chekNumber();
	}
	static void inputNumber(){ // input number
		System.out.println("Please input number from 0 to 9!");
		Scanner sc = new Scanner(System.in);
		int inputnum = sc.nextInt();
		System.out.println("You inputed " + inputnum + ". Chek...");
	}
	static void chekNumber(){ //chek number
		
	}
}
        
