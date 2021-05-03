package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import ENTIDADE.Participantes;
import UTIL.Jdbc;
import UTIL.JpaUtil;

public class ParticipantesImplDAO implements ParticipantesDAO {
	
	private EntityManager ent;
	private EntityTransaction tx;

	@Override
	public void salvar(Participantes p) {
	
		String sql = "INSERT INTO PARTICIPANTES (CPF, NOME, ITEMTRAZIDO)"
					+ "VALUES(?,?,?)";
		
		Connection conexao = null;
		
		try {
			
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, p.getCpf());
			ps.setString(2, p.getNome());
			ps.setString(3, p.getItemTrazido());
			
			ps.execute();
			ps.close();
			conexao.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void remover(String nome) {
		String sql = "DELETE FROM PARTICIPANTES WHERE NOME = ?";
		Connection conexao;
		
		try { 
			conexao = JpaUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, nome);
			ps.execute();
			ps.close();
			conexao.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	

	@Override
	public void alterar(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Participantes pesquisar(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Participantes> listarSorvetes() {
	
				List<Participantes> p = new ArrayList<Participantes>();
				this.ent = JpaUtil.getEntityManager();

				Query query = ent.createQuery("from * SORVETE");

				p = query.getResultList();
				return p;
	}

	
}
