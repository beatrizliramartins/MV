package DAO;

import java.util.List;

import ENTIDADE.Participantes;

public interface ParticipantesDAO {


	

		public void salvar(Participantes p);

		public void remover(String nome);

		public void alterar(String nome);

		public Participantes pesquisar(String nome);

		public List<Participantes> listarSorvetes();

}
