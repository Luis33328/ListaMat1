package com.ex6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float percentualMaximo = 0.3f;
		float salario = 0.0f;
		float prestacao = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do sal�rio: ");
		salario = sc.nextFloat();
		
		System.out.println("Digite o valor da presta��o: ");
		prestacao = sc.nextFloat();
		
		if(prestacao <= (salario * percentualMaximo)) {
			System.out.println("Empr�stimo aceito.");
		}
		else {
			System.out.println("Empr�stimo negado.");
		}
	}
}
