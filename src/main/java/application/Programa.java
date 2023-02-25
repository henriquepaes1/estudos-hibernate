package application;

import model.Pessoa;

public class Programa {

	public Programa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Henrique", "hpaesdesouza@gmail.com");
		Pessoa p2 = new Pessoa(1, "Carlos", "carlito@hotmail.com");
		Pessoa p3 = new Pessoa(1, "Edson", "teste@usp.br");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}

}
