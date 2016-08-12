package br.com.danielsilva.sistemaautomotivo;

public class Carro {
	
	String marca;
	double motor;
	String modelo;
	String cor;
	int ano;
	String renavam;
	
	public Carro (){
		
	}
	public Carro(String marca, Double motor, String modelo, String cor, int ano, String renavam){
	        this.marca = marca;
			this.motor = motor;
			this.modelo = modelo;
			this.cor = cor;
			this.ano = ano;
			this.renavam = renavam;
	}
	
	@Override
	public String toString() {
		return "Modelo: "+ this.modelo + "\n" +
		       "Marca.: "+ this.marca + "\n" +
		       "Cor:...."+ this.cor;
		
	}
}
