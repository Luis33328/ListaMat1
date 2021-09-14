package com.ex5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float precoGas = 2.5f;
		float precoRefri = 2.0f;
		float litrosGas = 0.0f;
		int quantRefri = 0;
		float totalGas = 0.0f;
		float totalRefri = 0.0f;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de litros de gasolina: ");
		litrosGas = sc.nextFloat();
		
		System.out.println("Digite a quantidade de latas de refrigerante: ");
		quantRefri = sc.nextInt();
		
		
		totalGas = litrosGas * precoGas;
		totalRefri = quantRefri * precoRefri;
		
		System.out.println("Subtotal Gasolina: " + totalGas);
		System.out.println("Subtotal Refrigerante: " + totalRefri);
		System.out.println("Valor total: " + (totalGas + totalRefri));
		
	}
	
}
