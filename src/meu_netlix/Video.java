package meu_netlix;

public class Video {

	private String titulo;
	private String roteiro;
	private String trilha_sonora;
	private String producao;
	private String empresa_envolvida;
	private String nacionalidade;
	private int duracao;
	private int classificacao;
	private double notas_usuarios;
	private double notas_impresa;
	private Genero genero;

	public Video(String titulo, String roteiro, String trilha_sonora, String producao, String empresa_envolvida,
			String nacionalidade, int duracao, int classificacao, double notas_usuarios, double notas_impresa,
			Genero genero) {
		super();
		this.titulo = titulo;
		this.roteiro = roteiro;
		this.trilha_sonora = trilha_sonora;
		this.producao = producao;
		this.empresa_envolvida = empresa_envolvida;
		this.nacionalidade = nacionalidade;
		this.duracao = duracao;
		this.classificacao = classificacao;
		this.notas_usuarios = notas_usuarios;
		this.notas_impresa = notas_impresa;
		this.genero = genero;
	}

	public Video() {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}

	public String getTrilha_sonora() {
		return trilha_sonora;
	}

	public void setTrilha_sonora(String trilha_sonora) {
		this.trilha_sonora = trilha_sonora;
	}

	public String getProducao() {
		return producao;
	}

	public void setProducao(String producao) {
		this.producao = producao;
	}

	public String getEmpresa_envolvida() {
		return empresa_envolvida;
	}

	public void setEmpresa_envolvida(String empresa_envolvida) {
		this.empresa_envolvida = empresa_envolvida;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public double getNotas_usuarios() {
		return notas_usuarios;
	}

	public void setNotas_usuarios(double notas_usuarios) {
		this.notas_usuarios = notas_usuarios;
	}

	public double getNotas_impresa() {
		return notas_impresa;
	}

	public void setNotas_impresa(double notas_impresa) {
		this.notas_impresa = notas_impresa;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
