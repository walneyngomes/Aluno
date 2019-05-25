import java.util.ArrayList;

public class Disciplina {
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void colocaNotaAluno(int matricula, double nota, String periodo, int bimestre) {
		for (Aluno a : alunos) {
			if (a.getNumeroMatricula() == matricula) {
				a.atribuirNota(periodo, nota, bimestre);
				break;
			}
		}

	}

}
