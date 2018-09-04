package br.com.db1.model;

import javax.persistence.Query;

import org.junit.Test;

public class UfTest extends AbstractTest{
	@Test
	public void inserirTest() {
		Uf uf = new Uf();
		uf.setNome("RR");
		
		manager.getTransaction().begin();
		manager.persist(uf);
		manager.getTransaction().commit();
	}
	
	@Test
	public void updateTest(){
		Query q = manager.createQuery("from uf where nome = :pNome");
		q.setParameter("pNome", "RR");
		q.setMaxResults(1);
		Uf uf = (Uf) q.getSingleResult();
				
		System.out.println(uf);
		
		uf.setNome("AA");
		manager.getTransaction().begin();
		manager.persist(uf);
		manager.getTransaction().commit();
	}
}
