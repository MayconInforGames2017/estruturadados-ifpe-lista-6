package notas_alunos;

public class NoAluno {

	private Aluno aluno;
	private NoAluno proximoAluno;
	
	public NoAluno(Aluno alunos) {
		this.aluno = alunos;
		this.setProximoAluno(null);
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public NoAluno getProximoAluno() {
		return proximoAluno;
	}

	public void setProximoAluno(NoAluno proximoAluno) {
		this.proximoAluno = proximoAluno;
	}
	
}
