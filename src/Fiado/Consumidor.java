package Fiado;

public class Consumidor {
	
	//Atributos
	
	private String nome;
	private int[] fiados;
	public String telefone;
	private int posicao = 0;

	// constructor
	public Consumidor(String nome, String telefone ) {
		this.telefone = telefone;
		this.nome = nome;
		this.fiados = new int[10];
	}

	//GETTER E SETTER
	public String getNome( ) {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return this.telefone;
	}
	
	public void registrarFiado (int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	
	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
}
