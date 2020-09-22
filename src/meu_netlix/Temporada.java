package meu_netlix;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

	private int numero;
	private List<Episodio> episodios;

	public Temporada(int numero) {
		super();
		this.numero = numero;
		this.episodios = new ArrayList<>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}

	public boolean inserirEpisodio(String titulo) {
		int idEpisodio = this.episodios.size() + 1;
		Episodio episodio = new Episodio(idEpisodio, titulo);
		return this.episodios.add(episodio);
	}
	
	public boolean alterarTitulo(String titulo, int id) {
		if (id <= this.episodios.size()) {
			Episodio episodio = this.episodios.get(id-1);
			episodio.setTitulo(titulo);
			return true;
		} else {
			return false;	
		}
	}

	
	public boolean alterarEpisodio(Episodio novoEpisodio, int id) {
		if (id <= this.episodios.size()) {
			this.episodios.set(id-1, novoEpisodio);
			return true;
		} else {
			return false;	
		}
	}
	
	public Episodio excluirEpisodio(int id) {
		if (id >= 0 && id <= this.episodios.size()) {
			return this.episodios.remove(id);
		}
		return null;
	}
	
}
