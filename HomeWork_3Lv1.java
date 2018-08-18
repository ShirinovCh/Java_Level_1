/*
* Homework. Java 1. Lesson 1.
*
*@author Chingiz Shirinov 
*@version Aug 12 2018
*/

import java.util.Scanner; 

class HomeWork_3Lv1 {
	public static void main (String[] args){
		// 1st task
		System.out.println("You have 3 attempts to find the hidden number!");
		inputNumber();
		//compareNumber();
	}
	/* 1st task. Написать программу, которая загадывает случайное число от 0 до 
		9, и пользователю дается 3 попытки угадать это число. При каждой попытке
		компьютер должен сообщить больше ли указанное пользователем число,
		чем загаданное, или меньше. После победы или проигрыша выводится запрос
		– «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
	public static void inputNumber(){ // input number
		System.out.println("Please input number from 0 to 9!");
		Scanner sc = new Scanner(System.in);
		int inputnum = sc.nextInt();
		System.out.println("You inputed " + inputnum + ". Chek...");
		int range = 9;
		int hidenum = (int)(Math.random()*range);	
		int attempt;
		for (attempt = 0; attempt < 3; attempt ++){
			while (true) {
			if (inputnum == hidenum) {
				System.out.println("Congratulation! You guess!!!");
				break;
			}
			else if (inputnum > hidenum){
				System.out.println("Hidden number is smaller");
				break;
			}
			else {
				System.out.println("Hidden number is bigger");
				break;
				}
			}
		}
	}
}