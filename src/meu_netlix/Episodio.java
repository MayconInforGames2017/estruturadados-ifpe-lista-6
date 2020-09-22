package meu_netlix;

public class Episodio {

	private int numero;
	private String titulo;
	private String sinopse;

	public Episodio(int numero, String titulo) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.sinopse = sinopse;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

}
