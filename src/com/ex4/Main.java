package com.ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float salario = 0;
		float aumento = 0.2f;
		
		Scanner sc = new Scanner(System.in);
		
		String option = "";
		
		while(true) {
			System.out.println("Informe o sal�rio: ");
			
			salario = Float.parseFloat(sc.nextLine());
			
			if(salario <= 500) {
				salario = salario + (salario * aumento);
				System.out.println("O novo sal�rio � " + salario);
			}
			else {
				System.out.println("Aumento inv�lido.");
			}
			
			System.out.println("Digite ENTER para continuar...");
			option = sc.nextLine();
			
			if(option.equalsIgnoreCase("N�o")) {
				System.exit(0);
			}
		}
		
		
	}
	
}
