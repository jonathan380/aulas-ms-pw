package br.edu.cpti.model;

public class caminhao extends Veiculo {
	private double cargaMaxima;

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	@Override
	public double calcularIpva() {
		// TODO Auto-generated method stub
		return super.calcularIpva()*2;
	}

}
