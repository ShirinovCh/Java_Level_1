/**
/*
* Homework. Java 1. Lesson 6.
*
*@author Chingiz Shirinov 
*@version Sept 03 2018
*/

class HomeWork_6Lv1 {
    public static void main(String[] args) {
        IAnimal[] animals = {new Cat(200,  2),
                new Dog(500, 10, 10)};
        for (IAnimal animal : animals)
            System.out.println(
                animal.getClass().getName() +
                "\nrun: " + animal.run(200) +
                "\njump: " + animal.jump(1.5f) +
                "\nswim: " + animal.swim(5));
    }
}

class Cat extends Animal {
    Cat(int run, int jump, int swim) {
        super(run, jump, swim);
    }
    Cat(int run_limit, float jump_limit) {
        super(run_limit, jump_limit, -1);
    }
	    @Override
    public boolean swim(int distance) {
        return false; // cats cannot swim (by the condition of task)
    }
}

class Dog extends Animal {
    Dog(int run, int jump, int swim) {
        super(run, jump, swim);
    }

}

interface IAnimal {
    boolean run(int distance);
    boolean jump(float height);
    boolean swim(int distance);
}

abstract class Animal implements IAnimal {
    protected int run_limit;
    protected float jump_limit;
    protected int swim_limit;

    Animal(int run_limit, float jump_limit, int swim_limit) {
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
        this.swim_limit = swim_limit;
    }
	    public boolean run(int distance) {
        return distance <= run_limit;
    }
    public boolean jump(float height)  {
        return height <= jump_limit;
    }
    public boolean swim(int distance) {
        return distance <= swim_limit;
    }
    
}