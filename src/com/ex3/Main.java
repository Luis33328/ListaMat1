package com.ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String option = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a tabuada desejada: ");
		System.out.println("* - Multiplicação");
		System.out.println("/ - Divisão");
		option = sc.nextLine();
		
		if(option.equalsIgnoreCase("*")) {
			for(int i=1; i<=10; i++) {
				for(int j=1; j<=10; j++) {
					System.out.println(i + "*" + j + " = " + (i*j));
				}
			}
			System.out.println("--------------------------------------------------");
		}
		
		if(option.equalsIgnoreCase("/")) {
			for(int i=1; i<=10; i++) {
				for(int j=1; j<=10; j++) {
					System.out.println(i + "/" + j + " = " + (i/j));
				}
			}
			System.out.println("--------------------------------------------------");
		}
	}
	
}
