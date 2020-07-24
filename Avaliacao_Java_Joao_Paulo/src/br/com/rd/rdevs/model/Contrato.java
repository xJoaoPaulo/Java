package br.com.rd.rdevs.model;

public abstract class Contrato extends Documento implements Registro{
	
	private String nomeEnvolvido;
	private String testemunha;
	private String tipoContrato;
	
		
	public String getNomeEnvolvido() {
		return nomeEnvolvido;
	}
	public void setNomeEnvolvido(String nomeEnvolvido) {
		this.nomeEnvolvido = nomeEnvolvido;
	}
	
	public String getTestemunha() {
		return testemunha;
	}
	public void setTestemunha(String testemunha) {
		this.testemunha = testemunha;
	}
	
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato (String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}


}
