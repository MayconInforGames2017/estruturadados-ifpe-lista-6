package meu_netlix;

import java.util.List;

public class Catalogo {
	
	private List<Video> catalogo;
	
	public Filme cadastrarFilme(String titulo, String roteiro, String trilha_sonora,
			                    String producao, String empresa_envolvida, String nacionalidade, 
			                    int duracao, int classificacao, double notas_usuarios, double notas_impresa, Genero genero) {
		Filme adicionarFilme = new Filme(titulo, roteiro, trilha_sonora, producao, empresa_envolvida, 
				nacionalidade, duracao, classificacao, notas_usuarios, notas_impresa, genero);
		catalogo.add(adicionarFilme);
		return adicionarFilme;
	}

	public Serie cadastrarSerie(String titulo, String roteiro, String trilha_sonora,
            String producao, String empresa_envolvida, String nacionalidade, 
            int duracao, int classificacao, double notas_usuarios, double notas_impresa, Genero genero, Temporada temp) {
		    Serie adicionarSerie = new Serie(titulo, roteiro, trilha_sonora, producao, 
		    		                         empresa_envolvida, nacionalidade, duracao, 
		    		                         classificacao, notas_usuarios, notas_impresa, 
		    		                         genero, temp);
		    catalogo.add(adicionarSerie);
		    return adicionarSerie;
	}

	public Filme excluirFilme(String titulo) {
		Video video = procurarTitulo(titulo);
		if (video instanceof Filme) {
			catalogo.remove(video);
			return (Filme) video;
		}
		return null;
	}
	
	public Serie excluirSerie(String titulo) {
		Video video = procurarSerieTitulo(titulo);
		if (video instanceof Serie) {
			catalogo.remove(video);
			return (Serie) video;
		}
		return null;
	}
	
	public Video procurarTitulo(String titulo) {
		for (Video video : catalogo) {
			if (video.getTitulo().equalsIgnoreCase(titulo)) {
				return video;
			}
		}
		return null;
	}
	
	public Video procurarSerieTitulo(String titulo) {
		for (Video video : catalogo) {
			if (video.getTitulo().equalsIgnoreCase(titulo)) {
				return video;
			}
		}
		return null;
	}
	
}
