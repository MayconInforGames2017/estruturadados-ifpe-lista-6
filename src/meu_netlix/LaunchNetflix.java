package meu_netlix;

import java.util.Scanner;

public class LaunchNetflix {

	public static char menu() {
		String msg;
		System.out.println("----------------------------------");
		System.out.println("          Escolha uma op��o       ");
		System.out.println("----------------------------------");
		System.out.println("= 1. Inserir filme               =");
		System.out.println("= 2. Localizar filme             =");
		System.out.println("= 3. Alterar filme               =");
		System.out.println("= 4. Excluir filme               =");
		System.out.println("= 5. Imprimir lista de alunos    =");
		System.out.println("= 6. Quantidade de alunos        =");
		System.out.println("= 8. Sair do programa            =");
		System.out.println("----------------------------------");
		msg = new Scanner(System.in).next();
		return msg.charAt(0);
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Video video = new Video();
		Catalogo catalogo;
		Filme filme;
		Serie serie;
		
		char opcao;
		
		do {
			
			opcao = menu();
			switch (opcao) {
			case '1':
				System.out.println("Insira abaixo os dados do filme: ");
				filme = new Filme();
				System.out.println("T�tulo: ");
				filme.setTitulo(ler.next());
				System.out.println("Roteiro: ");
				filme.setRoteiro(ler.next());
				System.out.println("Trilha sonora: ");
				filme.setTrilha_sonora(ler.next());
				System.out.println("Produ��o: ");
				filme.setProducao(ler.next());
				System.out.println("Empresas envolvidas: ");
				filme.setEmpresa_envolvida(ler.next());
				System.out.println("Nacionalidade: ");
				filme.setEmpresa_envolvida(ler.next());
				System.out.println("Dura��o: ");
				filme.setDuracao(ler.nextInt());
				System.out.println("Classifica��o: ");
				filme.setClassificacao(ler.nextInt());
				System.out.println("Notas da impressa: ");
				filme.setNotas_impresa(ler.nextDouble());
				System.out.println("Notas do usu�rio: ");
				filme.setNotas_usuarios(ler.nextDouble());
				System.out.println("G�nero: ");
				
				break;
				
			case '2':
				System.out.println("Digite o t�tulo do filme: ");
				String titulo = ler.next();
				if (catalogo.procurarTitulo(titulo) == null) {
					System.out.println("Filme n�o encontrado!");
				} else {
					System.out.println(catalogo.procurarSerieTitulo(titulo));
				}
				
				break;
				
			default:
				System.out.println("Op��o inv�lida, tente novamente!");
			}
		} while (opcao != '7');
		System.exit(0);
	}
}
