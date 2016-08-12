package br.com.danielsilva.sistemaautomotivo;

public class CarroMain {
	
	public static void main(String[] args) {
		
		Carro fusca = new Carro ();
		fusca.ano = 1965;
		fusca.cor = "azul";
		fusca.marca = "VW";
		fusca.modelo = "fusca Itamar";
		fusca.motor = 1.5;
		fusca.renavam = "1234567890";
		
		Carro monza = new Carro ();
		monza.ano = 1987;
		monza.cor = "Preto";
		monza.marca = "GM";
		monza.modelo = "Monza Classic";
		monza.motor = 2.0;
		monza.renavam = "987654321";
		
		Carro corcel = new Carro ("Ford", 1.4, "Corcel II", "Cinza", 1986, "34567876543");
		
		System.out.println(fusca);
		System.out.println("");
		System.out.println(monza);
		System.out.println("");
		System.out.println(corcel);
		
		
	}

}
