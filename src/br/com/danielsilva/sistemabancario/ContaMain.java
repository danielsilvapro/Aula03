package br.com.danielsilva.sistemabancario;

public class ContaMain {

	public static void main(String[] args) {

		Conta contaDoDaniel = new Conta("Daniel Silva", 1000);

		Conta.limiteCredito = 7000;

		contaDoDaniel.depositar(5000.0);

		contaDoDaniel.sacar(1000.0);

		contaDoDaniel.imprimirExtratoResumido();
	}
}
