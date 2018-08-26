/**
/*
* Homework. Java 1. Lesson 5.
*
*@author Chingiz Shirinov 
*@version Aug 26 2018
*/


class HomeWork_5Lv1{
	public static void main (String [] args){		
		Employee[] employee = new Employee[5];
		employee[0] = new Employee("Ivanov Ivan", "Support engeneer", 
		"ivanov@mail.ru", "9123456789", 88000, 31);
		employee[1] = new Employee("Petrov Peter", "Manager", 
		"petrov@mail.ru", "9112345678", 59000, 25);
		employee[2] = new Employee("Sidorov Sidor", "Manager", 
		"sidorov@mail.ru", "9111234567", 67000, 50);
		employee[3] = new Employee("Alexandrov Alexandr", "QA", 
		"alexandrov@mail.ru", "9111123456", 92000, 35);
		employee[4] = new Employee("Alexeev Alexey", "Developer", 
		"alexeev@mail.ru", "9111112345", 98000, 42);
		// output all employers
		for (int i = 0; i < 5; i++){
			if(employee[i].getAge() > 40)
			System.out.println("Fullname: " + employee[i].name + ". Position: "
		+ employee[i].position + ". Email: " + employee[i].email + ". Phone number: "
		+ employee[i].phoneNumber + ". Pay: " + employee[i].getPay() + ". Age: "
		+ employee[i].getAge());
		}
		
	}
}

class Employee{
	
	String name;
	String position;
	String email;
	String phoneNumber;
	private int pay;
	private int age;
	
	Employee (String name, String position, String email, 
	String phoneNumber, int pay, int age){
		this.name = name;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.pay = pay;
		this.age = age;
	}	
	
	void setPay(int pay){
		if(pay > 0)
		this.pay = pay;
	}		
	int getPay() {
		return pay;
	}	
	
	void setAge(int age){
		if(age > 0)
		this.age = age;
	}
	int getAge() {
		return age;
	}
	
	public void outputInfo(){
	System.out.println("Fullname: " + name + ". Position: "
		+ position + ". Email: " + email + ". Phone number: "
		+ phoneNumber + ". Pay: " + pay + ". Age: "
		+ age);
	}		
}