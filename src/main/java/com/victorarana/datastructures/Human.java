package com.victorarana.datastructures;

public class Human {

	public int age;			// The Human's age
	public String name;		// The Human's name
	
	public Human(String givenName) {
		age = 12;
		name = givenName;
	}
	
	public Human(){
		age = 0;
		name = "Untitled";
	}
	
	public void introduce(){
		System.out.println("I'm " + name + " and I'm " + age + " years old.");
	}
	
	public void copy(Human original){
		age = original.age;
		name = original.name;
	}	
	
}