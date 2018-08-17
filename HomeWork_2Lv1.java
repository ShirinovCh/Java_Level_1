/*
*Homework. Java 1. Lesson 2.
*
*@author Chingiz Shirinov 
*@version Aug 17 2018
*/
import java.util.Arrays;

class HomeWork_2Lv1 {
	public static void main (String[] args){
		//System.out.println(Arrays.toString(array));
	}
	/*public static void reversNumbers(String[] args){// task1
		int [] arr = {0, 0, 0, 1, 1, 1, 0, 0, 0};
			for (int a = 0; a < arr.length; a++){
			if (int a == 1)
				System.out.println ("1, 1, 1, 0, 0, 0, 1, 1, 1");
										
		}
	}*/
	public static void filArray(){// task2
		int[] arr = new int[8];
		for (int i=0; i < arr.length; i++){
			arr [i] = i * 3;
			System.out.println(arr[i]);
		}
	}
	
	public static void changeArray(){// task3
		int[] q = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		for (int i=0; i < q.length; i++){
			if (q[i] < 6){
				q[i] = q[i] * 2;
			//System.out.println("Change array" + q);
			}
			System.out.println(Arrays.toString(q));	
		}
	}
	
}