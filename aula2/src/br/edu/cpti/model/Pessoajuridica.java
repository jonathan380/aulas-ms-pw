package br.edu.cpti.model;

public class Pessoajuridica extends impostoRenda{
	private String cnpj;

	

	public Pessoajuridica(String nome, double rendimentos, String cnpj) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public double calcularImposto() {
		return this.rendimentos*0.15;
	}
}
