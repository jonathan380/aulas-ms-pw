package br.edu.cpti;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto1= new Produto();
		Produto produto2= new Produto();
		new Produto();
		Produto produto3 = new Produto(1,"abacaxi",5.90);
		Produto produto4 = new Produto(2,"melancia",30.0);
		Produto produto5 = new Produto(3," abacate",6.0);
		produto3.setValor(7.0);
		produto3.setDescrição("abacaxi de marataises");
		System.out.println(produto3.getCodigo()+" "+produto3.getDescrição()+" "+produto3.getValor());
		System.out.println("total geral de produtos:"+Produto.getTotalProdutos());
		
		

	}

}
