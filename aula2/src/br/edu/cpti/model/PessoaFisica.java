package br.edu.cpti.model;

public class PessoaFisica extends impostoRenda {
	public PessoaFisica(String nome, double rendimentos, String cpf) {
		super(nome, rendimentos);
		this.cpf = cpf;
	}

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

public double calcularImposto() {
	return this.rendimentos*0.11;
}
}
