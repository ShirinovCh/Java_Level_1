/**
/*
* Homework. Java 1. Lesson 7.
*
*@author Chingiz Shirinov 
*@version Sept 03 2018
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class J1Lesson7 {
    public static void main(String[] args) {
		
		Cat[] arrCats = {new Cat("Barsik", 20), new Cat("Murzik", 25),
		new Cat("Kit", 30), new Cat("Kesha", 35), new Cat("Tigra", 40)};
		
        Plate plate = new Plate(100);
				
        for (Cat cat : arrCats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
        plate.addFood(100);
        plate.info();

	}
}

class Cat {
    private String name;
    private int appetite;
	private boolean gorged;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
		this.gorged = true;
    }
	
	void info(){
		System.out.println(name + " have appetite " + appetite + " and start to eat ");
		String isHungry = !gorged ? " gorged " : " hungry";
		System.out.println(name + isHungry);
	}

    void eat(Plate plate) {
		if(gorged == true && plate.dicreaseFood(appetite) == true){
			gorged = false;
		}		
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }
		
    boolean dicreaseFood(int n) {
		int difference = food - n;
		if(difference < 0) return false;
        food -= n;
		return true;
    }
	
	void info(){
		System.out.println("Plate: " + food);
	}
	
	void addFood(int food){
		System.out.println("Add food " + food);
		this.food += food;
	}
}
