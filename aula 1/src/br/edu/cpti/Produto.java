package br.edu.cpti;

public class Produto {
private int codigo;
private String descrição;
private double valor;
private  static int TotalProdutos;
public static int getTotalProdutos() {
	return TotalProdutos;
}
public void setTotalProdutos(int totalProdutos) {
	TotalProdutos = totalProdutos;
}
public Produto() {
	System.out.println("construtor iniciado");
}
public Produto (int codigo,String descrição,double valor) {
	this.codigo=codigo;
	this.descrição=descrição;
	this.valor=valor;
	System.out.println("construtor cheio!");
	TotalProdutos++;
}
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
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
}
