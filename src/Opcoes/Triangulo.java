package Opcoes;

import java.util.Scanner;

public class Triangulo extends Calcular{	
	Scanner ler = new Scanner(System.in);
	
	@Override
	
	public void area() {
		double lado;
		System.out.printf("Informe o lado");
		lado = ler.nextDouble();
				
		System.out.println("Sua area eh "+ ((lado*lado*lado)*Math.sqrt(3))/4);
	}
	
	public void perimetro() {
		double lado;
		System.out.printf("Informe o lado: ");
		lado = ler.nextDouble();
		
		System.out.println("Seu perimetro eh "+ (3*lado));
	}
}
