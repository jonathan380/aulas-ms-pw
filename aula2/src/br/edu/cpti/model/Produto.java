package br.edu.cpti.model;

import java.time.LocalDate;

public class Produto {
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	public Produto(int codigo, String descrição, Double valor, LocalDate dataCadastro) {
		super();
		this.codigo = codigo;
		this.descrição = descrição;
		this.valor = valor;
		this.dataCadastro = dataCadastro;
	}
	private int codigo;
	private String descrição;
	private Double valor;
    private LocalDate dataCadastro;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
