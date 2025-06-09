package edu.smart_tv.user;

public class commands {
	boolean tvLigada = false;
	int volume = 25;
	int[] canais = {2,4,6,8};
	
	public void ligar() {
		tvLigada = true;
		System.out.println("TV ligada");
	}
	public void desligar() {
		tvLigada = false;
		System.out.println("TV desligada");
	}
	public void aumentarVolume() {
		if(volume < 100) {
			volume = volume + 5;
			System.out.println("volume: "+ volume);
		}else {
			System.out.println("volume no maximo");
		}
	}
	
	public void diminuirVolume() {
		if(volume > 0) {
			volume = volume - 5;
			System.out.println("volume: "+ volume);
		}else {
			System.out.println("volume no mudo");
		}
		
	}
	
	public void proximoCanal() {
	// desenvolver logica para selecionar o proximo array desejado.	
	}
	public void canalAnterior() {
	}
	
}
