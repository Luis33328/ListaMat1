package com.ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float salario;
		float percentualAumento;
		float aumento;
		float novoSalario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do sal�rio");
		salario = scan.nextFloat();
		
		System.out.println("Digite o valor do percentual de aumento");
		percentualAumento = scan.nextFloat();
		
		
		aumento = (salario * (percentualAumento/100));
		
		novoSalario = salario + aumento;
		
		System.out.println("Sal�rio: " + salario);
		System.out.println("Percentual de aumento: " + percentualAumento);
		System.out.println("Aumento do sal�rio: " + aumento);
		System.out.println("Novo valor do sal�rio: " + novoSalario);
	}
}
