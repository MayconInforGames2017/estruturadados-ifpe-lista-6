package meu_netlix;

import java.util.List;

public class Serie extends Video {

	private List<Temporada> temporadas;
	
	public Serie(String titulo, String roteiro, String trilha_sonora, 
		         String producao, String empresa_envolvida, String nacionalidade, 
		         int duracao, int classificacao, double notas_usuarios, 
		         double notas_impresa,
			Genero genero, Temporada temp) {
		super(titulo, roteiro, trilha_sonora, producao, empresa_envolvida, nacionalidade, 
				duracao, classificacao, notas_usuarios, notas_impresa, genero);	
	}

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	
}
