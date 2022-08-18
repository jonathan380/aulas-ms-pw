package br.edu.cpti.teste;

import java.time.LocalDate;

import br.edu.cpti.model.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		Produto produto1=new Produto();
		produto1.setCodigo(1);
		produto1.setDescrição("celular");
		produto1.setDataCadastro(LocalDate.now());
		produto1.setValor(1500.);
		Produto produto2 = new Produto (2,"kindle",300.0,LocalDate.now());
		System.out.println(produto2.getDescrição());
		System.out.println(produto2.getDataCadastro());
		System.out.println(produto1.getDescrição());
		System.out.println(produto1.getDataCadastro());
			
	}
}
