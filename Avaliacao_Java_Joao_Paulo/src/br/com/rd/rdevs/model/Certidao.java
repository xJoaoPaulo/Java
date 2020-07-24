package br.com.rd.rdevs.model;

public abstract class Certidao extends Documento implements Registro {
	
	protected int registro;
	private String nome;
	private String declarante;
	private String tipoCertidao;
	private int dataEmissao;
	private String nomeTabeliao;
	private String cartorio;


	@Override
	public int getRegistro() {
		return registro;
	}
	@Override
	public void setRegistro (int registro) {
		this.registro = registro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDeclarante() {
		return declarante;
	}
	public void setDeclarante(String declarante) {
		this.declarante = declarante;
	}
	
	public String getTipoCertidao() {
		return tipoCertidao;
	}
	public void setTipoCertidao(String tipoCertidao) {
		this.tipoCertidao = tipoCertidao;
	}
	
	public int getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(int dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getNomeTabeliao() {
		return nomeTabeliao;
	}
	public void setNomeTabeliao(String nomeTabeliao) {
		this.nomeTabeliao = nomeTabeliao;
	}
	public String getCartorio() {
		return cartorio;
	}
	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}
	
}
