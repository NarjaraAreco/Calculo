package Opcoes;

import java.util.Scanner;

public class Heptagono extends Calcular{

Scanner ler = new Scanner(System.in);
	
	@Override
	
	public void area() {
		double perimetro, apotema;
		System.out.printf("Informe o perimetro ");
		perimetro = ler.nextDouble();
		
		System.out.printf("\nInforme a apotema ");
		apotema = ler.nextDouble();
		
		System.out.println("Sua area eh "+ ((perimetro*apotema)/2));
	}
	
	public void perimetro() {
		double lado;
		System.out.printf("Informe o lado: ");
		lado = ler.nextDouble();
		
		System.out.println("Seu perimetro eh "+ (7*lado));
	}
}
