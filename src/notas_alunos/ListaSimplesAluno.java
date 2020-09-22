package notas_alunos;

public class ListaSimplesAluno {

	private NoAluno primeiro;
	private NoAluno ultimo;
	private int quantidade;

	public ListaSimplesAluno(NoAluno primeiro, NoAluno ultimo, int quantidade) {
		super();
		this.primeiro = primeiro;
		this.ultimo = ultimo;
		this.quantidade = quantidade;
	}

	public ListaSimplesAluno() {
		// TODO Auto-generated constructor stub
	}

	public NoAluno getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoAluno primeiro) {
		this.primeiro = primeiro;
	}

	public NoAluno getUltimo() {
		return ultimo;
	}

	public void setUltimo(NoAluno ultimo) {
		this.ultimo = ultimo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void inserirPrimeiro(Aluno aluno) {
		NoAluno noAluno = new NoAluno(aluno);
		if (this.vazio()) {
			this.ultimo = noAluno;
		}
		noAluno.setProximoAluno(this.primeiro);
		this.primeiro = noAluno;
		this.quantidade++;
	}
	
	public boolean vazio() {
		return (this.primeiro == null);
	}
	
	public void inserirUltimo(Aluno aluno) {
		NoAluno noAluno = new NoAluno(aluno);
		if (this.vazio()) {
			this.primeiro = noAluno;
		}else {
			this.ultimo.setProximoAluno(noAluno);
		}
		this.ultimo = noAluno;
		this.quantidade++;
	}
	
	public boolean removeAluno(String nome) {
		NoAluno atual = this.primeiro;
		NoAluno anterior = null;
		if (this.vazio()) {
			return false;
		} else {
			while ((atual != null) && (atual.getAluno().getNome().equals(nome))) {
				anterior = atual;
				atual = atual.getProximoAluno();
			}
			if (atual == this.primeiro) {
				if (this.primeiro == this.ultimo) {
					this.ultimo = null;
				}
				this.primeiro = this.primeiro.getProximoAluno();
			}else {
				if (atual == this.ultimo) {
					this.ultimo = anterior;
				}
				anterior.setProximoAluno(atual.getProximoAluno());
			}
			this.quantidade++;
			return true;
		}
	}
	
	public String pesquisaNome(String nome) {
		String msg = "";
		NoAluno atual = this.primeiro;
		while ((atual != null) && (!atual.getAluno().getNome().equals(nome))) {
			atual = atual.getProximoAluno();
		}
		return msg = "Nome: " + atual.getAluno().getNome() + "\n" + 
					 "Matricula: " + atual.getAluno().getNumero() + "\n" + 
				     "Nota: " + atual.getAluno().getNota();
	}

	public String imprimirLista() {
		String msg = "";
		if (this.vazio()) {
			msg = "A lista está vazia";
		} else {
			NoAluno atual = this.primeiro;
			while (atual != null) {
				msg += atual.getAluno().getNome() + " -> ";
				atual = atual.getProximoAluno();
			}
		}
		return msg;
	}

}
