public class Aluno {
	private String nome;
	private int numeroMatricula;
	private static final int Qnt_Notas = 4;
	private double[] primeiroBimestre = { 0.0, 0.0, 0.0, 0.0 };
	private double[] segundoBimestre = { 0.0, 0.0, 0.0, 0.0 };;
	private double[] terceiroBimestre = { 0.0, 0.0, 0.0, 0.0 };;

	public void atribuirNota(String periodoLetivo, double nota, int p) {
		if ("b1".equals(periodoLetivo)) {
			primeiroBimestre[p] = nota;
			primeiroBimestre[4] = atribuirMedia(primeiroBimestre[0], primeiroBimestre[1], primeiroBimestre[2]);

		} else if ("b2".equals(periodoLetivo)) {
			segundoBimestre[p] = nota;
			segundoBimestre[4] = atribuirMedia(segundoBimestre[0], segundoBimestre[1], segundoBimestre[2]);
		} else if ("b3".equals(periodoLetivo)) {
			terceiroBimestre[p] = nota;
			terceiroBimestre[4] = atribuirMedia(terceiroBimestre[0], terceiroBimestre[1], terceiroBimestre[3]);
		}

	}

	private double atribuirMedia(double valor1, double valor2, double valor3) {
		return (valor1 + valor2 + valor3) / Qnt_Notas - 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

}
