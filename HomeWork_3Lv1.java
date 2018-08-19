/*
* Homework. Java 1. Lesson 3.
*
*@author Chingiz Shirinov 
*@version Aug 19 2018
*/

import java.util.Scanner; 

class HomeWork_3Lv1 {
	/* 1st task. Написать программу, которая загадывает случайное число от 0 до 
		9, и пользователю дается 3 попытки угадать это число. При каждой попытке
		компьютер должен сообщить больше ли указанное пользователем число,
		чем загаданное, или меньше. После победы или проигрыша выводится запрос
		– «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
	public static void main (String[] args){
		//Scanner sc = new Scanner(System.in);
		//int inputnum = sc.nextInt();
		System.out.println("You have 3 attempts to find the hidden number!");
		inputNumber();		
		/*System.out.println("Do you want play again? 1 - yes, 2 - no.");// repeat programm again
		Scanner sc = new Scanner(System.in);
		int inputnum = sc.nextInt();*/
		while (true) {
			System.out.println("Do you want play again? 1 - yes, 2 - no.");// repeat programm again
			Scanner sc = new Scanner(System.in);
			int inputnum = sc.nextInt();
			if (inputnum == 1){
				inputNumber();
			} 
			else {
				System.out.println("Goodbye! Thank a lot to your join!");
				break;
			}
		}
	}
	public static void inputNumber(){ // input number
		System.out.println("Please input number from 0 to 9!");
		System.out.println("Attempt # 1" );
		Scanner sc = new Scanner(System.in);
		int range = 9; 
		int hidenum = (int)(Math.random()*range);
		int attempt = 1;
		while (true) {
			int inputnum = sc.nextInt();
			System.out.println("You inputed " + inputnum + ". Chek...");
			if (inputnum == hidenum && attempt < 3){
				System.out.println("Congratulation! You guessed!!!");
				System.out.println("from the " + attempt + " attempt");
			break;
			}
			else if (inputnum > hidenum && attempt < 3){
				System.out.println("Hidden number is smaller");
				attempt++;
				System.out.println("Attempt # " + attempt);
			}
			else if (inputnum < hidenum && attempt < 3){
				System.out.println("Hidden number is bigger");
				attempt++;
				System.out.println("Attempt # " + attempt);
			}
			else /*if (attempt == 3)*/{
				System.out.println("You didn't guess! Your attempt is finished! Game over!");
			break;
			}			
		}
	}
}