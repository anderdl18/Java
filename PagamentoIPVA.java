package Default;

import java.util.Scanner;

public class PagamentoIPVA {
	
	Scanner s = new Scanner(System.in);
	
	String genero;
	
	void MenuInterativo( ) {
		System.out.print("Informe o G�nero: ");
		genero = s.nextLine();
		switch (genero.toLowerCase()) {
		case "f": System.out.println("G�nero Feminino.");
		case "m": System.out.println("G�nero Masculino.");
		default: System.out.println("G�nero Indefinido.");
		}
	}
}