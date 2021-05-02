package com.homework.task1;

import java.util.Scanner;

public class Deputy implements PersonNew {
	
	private String surname ;
	private String name ;
	private int age;
	private boolean bribe;
	private int sizeOfBribe;
	
	@Override
	public int weight(int weight) {
		return  weight;
	}
	@Override
	public int heigh(int heigh) {
		return heigh;
	}

	public Deputy(int weight, int heigh, String surname, String name, int age, boolean bribe) {
		super();
		this.heigh(heigh);
		this.weight(weight);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribe = bribe;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isBribe() {
		return bribe;
	}
	public void setBribe(boolean bribe) {
		this.bribe = bribe;
	}
	public int getSizeOfBribe() {
		return sizeOfBribe;
	}
	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}
	
	public void giveBribe(Scanner scanner) {
		System.out.println("give bribe deputy");
		sizeOfBribe = scanner.nextInt();
		if(bribe = false) {
			System.out.println("good");
		}else{
			if(sizeOfBribe > 5000) {
				System.out.println("call the police");
			}else if(sizeOfBribe< 5000){
				System.out.println(sizeOfBribe);
			}	
		}		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + age;
		result = prime * result + (bribe ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sizeOfBribe;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputy other = (Deputy) obj;
		if (age != other.age)
			return false;
		if (bribe != other.bribe)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sizeOfBribe != other.sizeOfBribe)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", bribe=" + bribe + ", sizeOfBribe="
				+ sizeOfBribe + "]";}

	
}
