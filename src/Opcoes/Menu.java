package Opcoes;

import java.util.Scanner;

//import Testar.Scanner;

public class Menu {
	int escolha1, escolha2;
	int opcao;
	Scanner ler = new Scanner(System.in);

	public void mostrar() {
		System.out.println("Segue abaixo as informações que serão feitas:");
		System.out.println("1. Listar suas figuras.");
		System.out.println("2. Escolher sua figura.");
		System.out.println("3. Calcular.");
		System.out.println("4. Sair.");
		System.out.println("\n");
	}

	public void ListarFiguras() {
		System.out.println("1. Circulo");
		System.out.println("2. Triangulo equilatero");
		System.out.println("3. Quadrado.");
		System.out.println("4. Retangulo");
		System.out.println("5. Pentagono regular");
		System.out.println("6. Hexagono regular");
		System.out.println("7. Heptagono regular");
		System.out.println("8. Octogono regular");
		System.out.println("9. Eneagono regular");
		System.out.println("10. Decagono regular");
	}

	public void Selecionar() {
		System.out.println("\nEscolha a figura: ");
		;
		escolha1 = ler.nextInt();
	}

	public void Calculo() {

		System.out.println("Para calcular a area informe 1");
		System.out.println("Para calcular o perimetro informe 2");
		System.out.println("Para calcular os dois informe 3");
		escolha2 = ler.nextInt();

		switch (escolha2) {
			case 1:
				switch (escolha1) {
					case 1:
						Calcular Circulo = new Circulo();
						Circulo.area();
						break;
					case 2:
						Calcular Triangulo = new Triangulo();
						Triangulo.area();
						break;
					case 3:
						Calcular Quadrado = new Quadrado();
						Quadrado.area();
						break;
					case 4:
						Calcular Retangulo = new Retangulo();
						Retangulo.area();
						break;
					case 5:
						Calcular Pentagono = new Pentagono();
						Pentagono.area();
						break;
					case 6:
						Calcular Hexagono = new Hexagono();
						Hexagono.area();
						break;
					case 7:
						Calcular Heptagono = new Heptagono();
						Heptagono.area();
						break;
					case 8:
						Calcular Octagono = new Octagono();
						Octagono.area();
						break;
					case 9:
						Calcular Eneagono = new Eneagono();
						Eneagono.area();
						break;
					case 10:
						Calcular Decagono = new Decagono();
						Decagono.area();
						break;
				}
				break;

			case 2:

				switch (escolha1) {
					case 1:
						Calcular Circulo = new Circulo();
						Circulo.perimetro();
						break;
					case 2:
						Calcular Triangulo = new Triangulo();
						Triangulo.perimetro();
						break;
					case 3:
						Calcular Quadrado = new Quadrado();
						Quadrado.perimetro();
						break;
					case 4:
						Calcular Retangulo = new Retangulo();
						Retangulo.perimetro();
						break;
					case 5:
						Calcular Pentagono = new Pentagono();
						Pentagono.perimetro();
						break;
					case 6:
						Calcular Hexagono = new Hexagono();
						Hexagono.perimetro();
						break;
					case 7:
						Calcular Heptagono = new Heptagono();
						Heptagono.perimetro();
						break;
					case 8:
						Calcular Octagono = new Octagono();
						Octagono.perimetro();
						break;
					case 9:
						Calcular Eneagono = new Eneagono();
						Eneagono.perimetro();
						break;
					case 10:
						Calcular Decagono = new Decagono();
						Decagono.perimetro();
						break;
				}
				break;
			case 3:
				switch (escolha1) {
					case 1:
						Calcular Circulo = new Circulo();
						Circulo.perimetro();
						Circulo.area();
						break;
					case 2:
						Calcular Triangulo = new Triangulo();
						Triangulo.perimetro();
						Triangulo.area();
						break;
					case 3:
						Calcular Quadrado = new Quadrado();
						Quadrado.perimetro();
						Quadrado.area();
						break;
					case 4:
						Calcular Retangulo = new Retangulo();
						Retangulo.perimetro();
						Retangulo.area();
						break;
					case 5:
						Calcular Pentagono = new Pentagono();
						Pentagono.perimetro();
						Pentagono.area();
						break;
					case 6:
						Calcular Hexagono = new Hexagono();
						Hexagono.perimetro();
						Hexagono.area();
						break;
					case 7:
						Calcular Heptagono = new Heptagono();
						Heptagono.perimetro();
						Heptagono.area();
						break;
					case 8:
						Calcular Octagono = new Octagono();
						Octagono.perimetro();
						Octagono.area();
						break;
					case 9:
						Calcular Eneagono = new Eneagono();
						Eneagono.perimetro();
						Eneagono.area();
						break;
					case 10:
						Calcular Decagono = new Decagono();
						Decagono.perimetro();
						Decagono.area();
						break;
				}
				break;
		}
	}

	public int Sair() {
		System.out.println("\nDeseja sair?");
		System.out.println("1. sim");
		System.out.println("0. nao");
		opcao = ler.nextInt();

		return opcao;
	}
}
