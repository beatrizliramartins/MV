package ENTIDADE;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Participantes")
public class Participantes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "ItemTrazido", nullable = false)
	private String ItemTrazido;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String string) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getItemTrazido() {
		return ItemTrazido;
	}
	public void setItemTrazido(String itemTrazido) {
		ItemTrazido = itemTrazido;
	}
	public void inesrir(Participantes participante) {
		return;
	}
	public void remover(String CPF) {
		return;
	}
	public List<Participantes> listarParticipantes() {
		return null;
		
	}
	public Participantes pesquisar(String cpf) {
		return null;
	}
	
	

}


