package cursojava.classes;

public class Aluno {
	/* TUDO ISSO ABAIXO SÃO OS ATRIBUTOS DA CLASSE */
	/* ATRIBUTOS PRIVATE SO SÃO ACESSADOS DENTRO DA PROPRIA CLASSE */

	/* Para acessar atributos em outras classes, como a MAIN , tem que ser PUBLIC */

	String nome;
	int idade;
		
	private String cpf;
	private String disciplina1;
	private String disciplina2;
	private String disciplina3;
	private String disciplina4;
	private String rg;
	private String dataNasc;
	private int matricula;
	private String nomeMae;
	String nomePai;
	
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	
	private Disciplina disciplina = new Disciplina();
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	
	
	public Aluno() { 
		
	}
	
	public Aluno(String nomePadrao) { 
		
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) { 
		
		nome = nomePadrao;
		idade = idadePadrao;
	}

	
	
	public double getMediaNota() {
		return (disciplina.getNota1() + disciplina.getNota2()
		+ disciplina.getNota3() + disciplina.getNota4())/4;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
			
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", disciplina1=" + disciplina1
				+ ", disciplina2=" + disciplina2 + ", disciplina3=" + disciplina3 + ", disciplina4=" + disciplina4
				+ ", rg=" + rg + ", dataNasc=" + dataNasc + ", matricula=" + matricula + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4="
				+ nota4 + ", disciplina=" + disciplina + "]";
	}
	
	
	
	
	}