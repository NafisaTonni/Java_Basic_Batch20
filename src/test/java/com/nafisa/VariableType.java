package com.nafisa;

import java.util.Scanner;

public class VariableType {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		 //integer number
		 
		System.out.println("Please Enter a number: ");
		int intNumber = input.nextInt();
		System.out.println("intNumber: " +intNumber);
		
		System.out.println("Please enter a number:");
		float floatNumber = input.nextFloat();
		System.out.println("floatNumber: " +floatNumber);
			 
		
		//System.out.println("intNumber: " +intNumber , "floatNumber: " +floatNumber);
		 }
 
	}


