package br.edu.cpti.model;

public class impostoRenda {
	protected String nome;
	protected double rendimentos;
	
	public impostoRenda(String nome, double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendimentos() {
		return rendimentos;
	}
	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

}
