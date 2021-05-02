package com.homework.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Supplier;

public class Fraction  {
	   
	    private String nameOfFraction;
		ArrayList<Deputy> deputyList = new ArrayList<>();
	
		public Fraction(String nameOfFraction) {
			super();
			this.nameOfFraction = nameOfFraction;}
		
		public String getNameOfFraction() {
			return nameOfFraction;}
		
		public void setNameOfFraction(String nameOfFraction) {
			this.nameOfFraction = nameOfFraction;}
		
		public void addD() {
			
			
		 Supplier<Deputy> dep = ()->{
			 Scanner scanner = new Scanner(System.in);				
			 System.out.println("Додати weight");
			 int weight = scanner.nextInt(); 
			 System.out.println("Додати height");
			 int heigh = scanner.nextInt();
			 System.out.println("Додати прізвище");				
			 String suname = scanner.next();			 
			 System.out.println("Додати name");
			 String name = scanner.next();			 
			 System.out.println("Додати age");
			 int age = scanner.nextInt();			 
			 System.out.println("Додати isbriber");
			 boolean isbriber = scanner.nextBoolean();
			
			 return new Deputy( weight, heigh, suname, name, age, isbriber);};
		 Deputy ty = dep.get();
		
		 System.out.println(ty.getName()+deputyList.add(ty));
		}

		public void removeD(Scanner scanner) {
			System.out.println("Remove deputy");
			String name = scanner.next();
			Iterator<Deputy> iterator = deputyList.iterator();
			while(iterator.hasNext()) {
				Deputy deputy = iterator.next();
				if(deputy.getName().equalsIgnoreCase(name)) {
					iterator.remove();
				}
			}

		}
		public void allBribeD() {
			 Scanner scaner = new Scanner (System.in);
			Iterator<Deputy> iterator = deputyList.iterator();
			while(iterator.hasNext()) {
				Deputy briber = iterator.next();
				if(briber.isBribe()==true) {
					briber.giveBribe(scaner);
				}
			}
		}
		@SuppressWarnings("unlikely-arg-type")
		public void allBribeDB() {
			deputyList.stream().filter((bribe) -> bribe.equals(true)).toString();
		}
		
		public void showAllDeputy() {
			deputyList.toString();}

		public void clearFraction() {
			deputyList.clear();}

		@Override
		public String toString() {
			return "Fraction [ nameOfFraction=" + nameOfFraction + ", deputyList=" + deputyList
					+  "]";
		}


		
		
		
	
	
	
	
	

}
