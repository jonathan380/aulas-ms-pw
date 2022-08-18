package br.edu.cpti;

public class Conta {
	// padrão camelcase
	//encapsulamento
	//acessivel via getter and setter
	private String numeroConta;
	private Double saldo;
	public string getnumeroConta() {
		return=numeroConta 
	}
	//entrada de dados 
	 public void setNumeroConta(String numeroConta) {
		 this.NumeroConta=numeroConta;
	 }
	 
	 //leituras de dados
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// metodos sem retorno 
	public void deposito(double valor) {
		saldo += valor;
		}
	//metodo com retorno
	public String saque(double valor) {
		if(saldo<valor) {
			return"saldo insuficiente";
			
	}else {
		saldo-=valor;
		return "saque efetuado com sucesso!!";
	}
	
	}
}

