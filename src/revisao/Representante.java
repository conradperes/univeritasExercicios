package revisao;

import java.util.Date;

public class Representante {

	public static void main(String[] args) {
		Aluno abobrinha = new Aluno();
		abobrinha.setNome("Josevaldo");
		abobrinha.setDataNascimento(new Date());
		System.out.println(abobrinha.getNome());
		System.out.println(abobrinha.getDataNascimento());
	}

}
