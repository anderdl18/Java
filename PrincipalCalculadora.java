package Calculadora;

public class Principal {

	public static void main(String[] args) {

		Calculadora conta=new Calculadora(25,5);
		System.out.println("Valor da soma é :" + conta.soma());
		System.out.println("Valor da subtração é :" + conta.sub());
		System.out.println("Valor da multiplicação é :" + conta.divid());
		System.out.println("Valor da divisão é :" + conta.mult());
	}

}
