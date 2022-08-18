package br.edu.cpti.teste;

public class TesteVeiculo {

	public static void main(String[] args) {
		caminhao c1 = new caminhao();
		c1.setPlaca("KLI-0909");
		c1.setChassi("234343434");
		c1.setCargaMaxima(10500.);
		c1.setValor(55000);
		System.out.println("ipva caminhão:" + c1.calcularIpva());
		
		VeiculoPasseio v1 = new VeiculoPasseio();
		v1.setPlaca("hyu-9090");
		v1.setChassi("3432434");
		v1.setValor(15000);
		System.out.println("ipva caminhão:" + v1.calcularIpva());
	}

}
