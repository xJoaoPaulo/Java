package br.com.rd.rdevs.model;

public abstract class ManipuladorDeSeguroDeVida extends SeguroDeVida {
	
	private SeguroDeVida seguroDeVida;
	
	public void criarSeguro() {
		
	}

	public SeguroDeVida getSeguroDeVida() {
		return seguroDeVida;
	}

	public void setSeguroDeVida(SeguroDeVida seguroDeVida) {
		this.seguroDeVida = seguroDeVida;
	}

}
