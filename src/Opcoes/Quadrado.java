package Opcoes;

import java.util.Scanner;

public class Quadrado extends Calcular{
   Scanner ler = new Scanner(System.in);
	
	@Override
	
	public void area() {
		double lado;
		System.out.printf("Informe o lado: ");
		lado = ler.nextDouble();
		
		System.out.println("Sua area eh "+ (lado*lado));
	}
	
	public void perimetro() {
		double lado;
		System.out.printf("Informe o lado: ");
		lado = ler.nextDouble();
		
		System.out.println("Seu perimetro eh "+ (4*lado));
	}
}
