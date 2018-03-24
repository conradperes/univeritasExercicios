package aula2;

import java.util.Date;

public class Escopo {
	static int contador =0;
	String nome="Gabriel";
	{
		Date data = new Date();
		System.out.println(data);
	}
	
	public long getNumero() {
		return 128937129837219L;
	}
	
	void test() {
		String cpf =" 055.206.857-89";
		System.out.println(cpf);
		System.out.println(nome);
	}

	public static void main(String[] args) {
		Escopo escopo = new Escopo();
		escopo.test();
		contador++;
		System.out.println("Valor do contador="+contador);
		System.out.println(escopo.getNumero());
	
	
	
	}

}
