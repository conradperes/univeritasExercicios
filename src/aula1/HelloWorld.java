package aula1;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Seja bem vindo ao Sistema da Univeritas");
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Guilherme Deltoro");
		pessoa.setDataNascimento(new Date());
		System.out.println("O "+pessoa.getNome() + " -- Nasceu em: "+pessoa.getDataNascimento());
	}

}
