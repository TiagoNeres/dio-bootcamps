package edu.smart_tv.user;

public class user {
	public static void main(String[] args) {
		commands controle = new commands();
		controle.ligar();
		while(controle.volume != 0) {
			controle.diminuirVolume();
		}
		controle.diminuirVolume();
	}
}
