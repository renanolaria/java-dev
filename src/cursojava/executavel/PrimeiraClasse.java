package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasse {
	public static void main(String[] args) {
		// aluno1, ASSIM COMO OS DEMAIS SÃO REFERENCIA DO OBJETO*//
		/* new ALUNO ( ) , é a INSTANCIA(CRIAÇÃO DO OBJETO) */
		Aluno aluno1 = new Aluno();

		// INJETANDO DADOS NO METODO SETTER
		// ESSE É O ALUNO 1.
		System.out.println("========================================================================");
		// METODO DE ENTRADA DE DADOS EM FORMATO DE CAIXA.
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno 1 ? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno 1 ? ");
		String nascimento = JOptionPane.showInputDialog("Qual o nascimento do aluno 1 ? ");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno 1 ?? ");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe aluno 1 ? ");
		String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1 ?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1 ?");

		String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2 ?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2 ?");

		String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3 ?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3 ?");

		String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4 ?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4 ?");

		// METODO SETTER PARA INJETAR OS DADOS.
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNasc(nascimento);
		aluno1.setNomeMae(mae);
		aluno1.setCpf(cpf);
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);

		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));

		// USANDO O MÉTODO TOSTRING //
		System.out.println(aluno1.toString());
		System.out.println("A média do aluno e = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado " : "Reprovado"));

		System.out.println("A média do aluno 1 é = " + aluno1.getMediaNota());

		// OBTENDO OU NÃO APROVAÇÃO
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("\n");
		System.out.println("=========================================================================");

	}

}