package Calculadora;

public class Principal {

	public static void main(String[] args) {

		Calculadora conta=new Calculadora(25,5);
		System.out.println("Valor da soma � :" + conta.soma());
		System.out.println("Valor da subtra��o � :" + conta.sub());
		System.out.println("Valor da multiplica��o � :" + conta.divid());
		System.out.println("Valor da divis�o � :" + conta.mult());
	}

}
