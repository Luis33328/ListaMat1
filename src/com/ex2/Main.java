package com.ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero;
		int count = 0;
		
		int[] numeros = new int[] {};
		
		Scanner scan = new Scanner(System.in);
		
		while(count < 10) {
			System.out.println("Digite um n�mero: ");
			numero = scan.nextInt();
			if(numero%2 == 0) {
				System.out.println("Esse n�mero � par\n");
			}
			else {
				System.out.println("Esse n�mero � �mpar\n");
			}
			count++;
			
		}
	}
	
}
