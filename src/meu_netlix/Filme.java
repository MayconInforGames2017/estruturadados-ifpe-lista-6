package meu_netlix;

public class Filme extends Video {

	public Filme(String titulo, String roteiro, String trilha_sonora, String producao, String empresa_envolvida,
			String nacionalidade, int duracao, int classificacao, double notas_usuarios, double notas_impresa,
			Genero genero) {
		super(titulo, roteiro, trilha_sonora, producao, empresa_envolvida, nacionalidade, duracao, classificacao,
				notas_usuarios, notas_impresa, genero);
		
	}

	public Filme() {
		// TODO Auto-generated constructor stub
	}

	
}
