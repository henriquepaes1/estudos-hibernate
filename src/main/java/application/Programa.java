package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Pessoa;

public class Programa {

	public Programa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Configuração do JPA
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager manager = factory.createEntityManager();
		
		// Criação dos objetos
		Pessoa p1 = new Pessoa(null, "Henrique", "hpaesdesouza@gmail.com");
		Pessoa p2 = new Pessoa(null, "Carlos", "carlito@hotmail.com");
		Pessoa p3 = new Pessoa(null, "Edson", "teste@usp.br");
		
		//persistindo os objetos
//		manager.getTransaction().begin();
//		manager.persist(p1);
//		manager.persist(p2);
//		manager.persist(p3);
//		manager.getTransaction().commit();
		
		// Buscando objetos
		Pessoa p4 = manager.find(Pessoa.class, 1);
		System.out.println("Encontrada: " + p4.toString());
		
//		// Deletando objetos
//		manager.getTransaction().begin();
//		manager.remove(p4);
//		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		

	}

}
