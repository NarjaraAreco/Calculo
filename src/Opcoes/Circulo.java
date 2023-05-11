package Opcoes;

import java.util.Scanner;

public class Circulo extends Calcular{
	Scanner ler = new Scanner(System.in);

	@Override
	
		public void area() {
		double raio;
		System.out.println("Informe o raio");
		raio = ler.nextDouble();
		
		System.out.println("Sua area eh "+ (3.14*(raio*raio)));
		
	}
	public void perimetro() {
		double raio;
		System.out.println("Informe o raio");
		raio = ler.nextDouble();
		
		System.out.println("Seu perimetro eh "+(2*3.14*(raio)));
	}

}
