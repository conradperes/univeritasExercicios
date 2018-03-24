package exerciocios;

public class Cerveja {
	private String nome;
	private String tipo;
	private double valor;
	private int ano;
	private String nacionalidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Cerveja(String nome, String tipo, double valor, int ano, String nacionalidade) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
		this.ano = ano;
		this.nacionalidade = nacionalidade;
	}
	
	
}
