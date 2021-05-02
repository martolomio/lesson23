package com.homework.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Supplier;

public class VerhovnaRada {

	ArrayList<Fraction> fractionList = new ArrayList<>() ;
	
	public void addFraction(Fraction fraction) {
		 Supplier<Fraction> fra = ()->{
			Scanner scanner = new Scanner(System.in);
			String nameOfFraction = scanner.next();
			return new Fraction( nameOfFraction);};
		 Fraction tion = fra.get();
		 System.out.println(fractionList.add(tion));	
	}
	
	public void addDeputyToFraction(String nameOfFraction) {
		 Scanner scanner = new Scanner(System.in);
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction currentFraction = iterator.next();
			if(currentFraction.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				currentFraction.addD();
			}		
		}
	}
	public void show(String nameOfFraction) {
		fractionList.stream().toArray().toString();
		}
	public void deleteDeputyFromFraction(String nameOfFraction) {
		 Scanner scanner = new Scanner(System.in);
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction currentFraction = iterator.next();
			if(currentFraction.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				currentFraction.removeD(scanner);
			}		
		}
	}
	public void allDeputyTo(String nameOfFraction) {
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction currentFraction = iterator.next();
			if(currentFraction.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				currentFraction.addD();
			}	
		}
	}
	public void removeFraction(Scanner scanner) {
		System.out.println("enter fraciton");
		String name = scanner.next();
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction fractionList = iterator.next();
			if(fractionList.getNameOfFraction().equalsIgnoreCase(name)) {
				iterator.remove();
				}
			}
		}
	public void showAllDeputy(Scanner scanner) {
		System.out.println("enter fraciton");
		String nameOfFraction = scanner.next();
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction currentFraction = iterator.next();
			if(currentFraction.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				currentFraction.showAllDeputy();
			}
		}
	}
	public void showAllBribes(Scanner scanner) {
		System.out.println("enter fraciton");
		String nameOfFraction = scanner.next();
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction frac = iterator.next();
			if(frac.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				frac.allBribeDB();
			}
		}
	}

	@Override
	public String toString() {
		return "VerhovnaRada [ fractionList=" + fractionList + "]";
	}
	
	
	
}

