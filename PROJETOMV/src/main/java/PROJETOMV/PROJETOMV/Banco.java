package PROJETOMV.PROJETOMV;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ENTIDADE.Participantes;
import UTIL.JpaUtil;

public class Banco {
	
	public static void main(String[] args)
	
	{
		
		EntityManager ent = JpaUtil.getEntityManager();
		
		Participantes p = new Participantes();
		
		p.setCpf("10356027414");
		p.setNome("Beatriz");
		p.setItemTrazido("Pão");
		
		EntityTransaction ts = ent.getTransaction();
		ts.begin();
		
		ent.persist(p);
		
		ts.commit();
		ent.close();
		
		System.out.println("Inserido!");
	}

}
