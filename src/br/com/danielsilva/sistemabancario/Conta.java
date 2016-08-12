package br.com.danielsilva.sistemabancario;

public class Conta {
	
	private String nome;
	private double saldo;
	public static double limiteCredito = 500;

	public Conta(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		 this.saldo -= valor;
	}

	public double getSaldo(){
		return this.saldo;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void imprimirExtratoResumido(){
		System.out.println("==============================================");
		System.out.println("BANCO PIRATA");
		System.out.println("==============================================");
		
		System.out.println("Nome do Favorecido: "+ this.getNome() );
		System.out.println();
		System.out.println("Saldo R$ " + this.getSaldo() );
		System.out.println("Limite de Credito " + limiteCredito);
		System.out.println("==============================================");
	}
	
	public String getString(){
		return this.nome;
	}
	
	@Override
	public String toString() {
		return "Nome " + this.nome + " Saldo " + this.saldo;
	}
}
