package com.victorarana.datastructures;

public class Human {

	public int age;			// The Human's age
	public String name;		// The Human's name
	public static int numberOfHumans;
	
	public Human(String givenName) {
		numberOfHumans++;
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
		this.age = original.age;
		this.name = original.name;
	}
	
	public void change(int age){
		String name = "Tom";
		
		this.age = age;
		this.name = name;		
	}
	
	public static void printHumans(){
		System.out.println(numberOfHumans);
	}
	
}