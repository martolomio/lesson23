/* LOGOS It Academy homework*/

package com.homework.task1;
/**
 * @since java 1.8
 * @author Martha
 * @versoin 1.2
 * */

import java.util.Scanner;

public class Main {
	
	/**
	 * @author Martha 
	 */
	
	static void menu() {
		
		System.out.println("1 щоб додати фракцію");
		System.out.println("2 щоб видалити конкретну фракцію");
		System.out.println("3 щоб вивести усі фракнії ");
		System.out.println("4 щоб очистити конкретну фракцію");
		System.out.println("5 щоб вивести конкретну фракцію");
		System.out.println("6 щоб додати депутатат в фракцію");
		System.out.println("7 щоб видалити депутатат з фракції");
		System.out.println("8 щоб вивести список хабарників");
	}

	public static void main(String[] args) {
		
		VerhovnaRada vr = new VerhovnaRada();
		
		Scanner scaner = new Scanner (System.in);
			
		while(true) {
			menu();
			
			switch(scaner.next()) {
			
			case"1":{
				System.out.println("Додати фракцію");
				vr.addFraction(new Fraction(null));
				
				System.out.println(vr);	
				break;	
			}
			case "2":{
				vr.removeFraction(scaner);
				
				System.out.println(vr);
				break;	
			}	
			
			case "3":{
				System.out.println("Вивести всі фаркції");
				scaner = new Scanner (System.in);
				String sc = scaner.next();
				vr.show(sc);
				
				System.out.println(vr);
				break;
			}
			case "6":{
				System.out.println("Enter fraction");
				String sc = scaner.next();
				vr.addDeputyToFraction(sc);
				
				System.out.println(vr);
				break;
			}
			case "4":{
				scaner = new Scanner (System.in);
				vr.fractionList.clear();
				
				System.out.println(vr);
				break;
			}	
			case "5":{
				String sc = scaner.next();
				vr.show(sc);
				vr.showAllDeputy(scaner);
				
				System.out.println(vr);
				break;
			}	

			case "7":{
				System.out.println("delete deputy from fraciton");
				scaner = new Scanner (System.in);
				String sc = scaner.next();
				vr.deleteDeputyFromFraction(sc);
				
				System.out.println(vr);
				break;
			}
			
			case " 8":{	
				scaner = new Scanner (System.in);
				vr.showAllBribes(scaner);
				
				System.out.println(vr);	
			}
		break;
		}
	}
}
}