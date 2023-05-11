package Opcoes;

import java.util.Scanner;

   public class Retangulo extends Calcular{
   Scanner ler = new Scanner(System.in);
	
	@Override
	
	public void area() {
		double lado1, lado2;
		System.out.printf("Informe o primeiro lado ");
		lado1 = ler.nextDouble();
		
		System.out.printf("\nInforme o segundo lado ");
		lado2 = ler.nextDouble();
		
		System.out.println("Sua area eh "+ (lado1*lado2));
	}
	
	public void perimetro() {
		double lado;
		System.out.printf("Informe o lado: ");
		lado = ler.nextDouble();
		
		System.out.println("Seu perimetro eh "+ ((2*lado)+(2*lado)));
	}
}
