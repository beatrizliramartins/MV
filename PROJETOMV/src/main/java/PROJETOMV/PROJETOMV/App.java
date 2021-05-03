package PROJETOMV.PROJETOMV;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ENTIDADE.Participantes;
import UTIL.JpaUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		 EntityManager ent = JpaUtil.getEntityManager();
    		
    		Participantes participante = new Participantes();
    		Scanner Ler = new Scanner(System.in);
    		
    		
    		
    		
    		int opcao; 
    		int faz = 0;
    		
    		
			
    		do {
    			System.out.println("======Cafe MV======");
    			System.out.println("Bem Vindo ao nosso caf� da manh�!");
    			System.out.println("Digite 1 para inserir participante,\n"
    							+ "       2 para remover participante,\n"
    							+ "       3 para pesquisar participante,\n"
    							+ "       4 para Listar participantes e Itens j� escolhidos,\n"
    							+ "       5 para sair");
    			
    			opcao = Ler.nextInt();
    			Ler.nextLine();
    			
    			
    			switch(opcao) {
    			case 1: 
    				
    				System.out.println("Inserir participante");
    				System.out.println("Digite o seu CPF:");
    				participante.setCpf(Ler.nextLine());
    				System.out.println("Digite o seu nome:");
    				participante.setNome(Ler.nextLine());
    				System.out.println("Digite o item que ir� trazer:");
    				participante.setItemTrazido(Ler.nextLine());
    				
    				
    				
    				break;
    			case 2:
    				System.out.println("Remova um participante pelo cpf");
    				System.out.println("CPF:");
    				participante.remover(Ler.nextLine());
    				
    				break;
    			case 3:
    				System.out.println("Persique pelo CPF");
    				System.out.println("CPF:");
    				participante.pesquisar(Ler.nextLine());
    				System.out.println("Participante:" +participante);
    				
    				break;
    			
    			case 4: 
    				System.out.println("Lista de participantes!");
    				System.out.println("CPF"    +participante.getCpf());
    				System.out.println("Nome:"   +participante.getNome());
    				System.out.println("Item � trazer:"  +participante.getItemTrazido());
    				
    				break;
    				
    			case 5: 
    				faz = 2;
    			}
    			if(opcao != 6) {
    				System.out.println("Deseja fazer uma nova operacao? \n 1 - Sim | 2- Nao");
    				faz = Ler.nextInt();
    			}else {
    				System.out.println("Volte sempre!");
    			}
    		}while (faz == 1);
    		Ler.close();	
    }
    
}
