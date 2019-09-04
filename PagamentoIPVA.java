package Default;

import java.util.Scanner;

public class PagamentoIPVA {
	
	Scanner s = new Scanner(System.in);
	
	String genero;
	
	void MenuInterativo( ) {
		System.out.print("Informe o Gênero: ");
		genero = s.nextLine();
		switch (genero.toLowerCase()) {
		case "f": System.out.println("Gênero Feminino.");
		case "m": System.out.println("Gênero Masculino.");
		default: System.out.println("Gênero Indefinido.");
		}
	}
}