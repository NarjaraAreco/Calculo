package Testar;

import Opcoes.Menu;

public class TesteCalculo {

	public static void main(String[] args) {

		// Scanner ler = new Scanner(System.in);
		Menu menu = new Menu();
		// menu.lista();
		do {
			menu.mostrar();

			menu.ListarFiguras();

			menu.Selecionar();
			for (int i = 0; i < 1; i++) {
				System.out.println("");
			}
			menu.Calculo();
			for (int i = 0; i < 1; i++) {
				System.out.println("");
			}
		} while (menu.Sair() == 0);

		System.out.println("Ate a proxima");
	}

}
