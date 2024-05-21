import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TarefaColecoes {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por , ");
        String resposta = s.next();
        String[] listaNomes = resposta.split(",");
        
        System.out.println("Nomes desordenados:");
        for (String nome : listaNomes) {
            System.out.println(nome.trim());
        }
        
        Arrays.sort(listaNomes);
        
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : listaNomes) {
            System.out.println(nome.trim());
        }
        
        List<String> feminino = new ArrayList<>();
    	List<String> masculino = new ArrayList<>();
        
        System.out.println("Deseja adicionar um aluno na lista? (Digite 'S' para Sim ou 'N' para Não)");
        String resposta2 = s.next();
        
        while(resposta2.equals("S")) {
        	System.out.println("Digite o nome e o sexo do aluno: (Exemplo: Mateus-M, Larissa-F)");
        	String aluno = s.next();
        	String[] alunoArray = aluno.split("-");
        	
        	if (alunoArray[1].equals("M")) {
        		masculino.add(alunoArray[0]);
        	} else {
        		feminino.add(alunoArray[0]);
        	}
        	
        	System.out.println("Deseja adicionar mais um aluno na lista? (Digite 'S' para Sim ou 'N' para Não)");
        	resposta2 = s.next();
        }
        
        System.out.println("******* Lista dos alunos ******");
        System.out.println("Sexo feminino: " + feminino);
        System.out.println("Sexo masculino: " + masculino);
        System.out.println("Obrigado!!!");
        
        s.close();
	}
}
