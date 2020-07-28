package br.com.rd.rdevs.model;

public class Conta implements Comparable<Conta> {
	
	private int numero;
	private String titular;
	protected double saldo = 1000;
	private double limite;
	private double rendimento;
	private int identificador;
	private int tipoConta;
	protected double valorImposto;
	public static int qtdConta;


	
	public boolean sacar(double valorSacado){
		
		try {
		if(this.saldo < valorSacado && valorSacado < 0){
			return false;
		}else{	
			this.saldo = this.saldo - valorSacado;
			return true;
		}
	}
	catch (IllegalArgumentException e) {
		System.out.println("Valor Negativo " + e);
	}
		
	}
	
	public void depositar(double valorDepositado){
		
	try {
			if (valorDepositado < 0){
				System.out.println("erro");
			}else{
				this.saldo += valorDepositado;
		}
	}catch (IllegalArgumentException e) {
		System.out.println("Valor Negativo " + e);
	}
}

	

	public boolean transferir(Conta destino, double valorTransferido){
		boolean retirou = this.sacar(valorTransferido);
		if (!retirou){
			return false;
		}else{
			double valorDepositado;
			destino.depositar(valorDepositado);
			return true;
		}
		this.saldo = this.saldo - valorTransferido;
		destino.saldo = destino.saldo + valorTransferido;
	}

	double calcularRendimento(double valorRendimento){
			return rendimento = (this.saldo * 0.1);
	}

	public String recuperarDadosParaImpressao(){
        String dados = "Nome Titular: " + this.getTitular() + " Numero da Conta: " + this.getNumero() + " Agencia: " + " Saldo: " + this.saldo;
        return dados;

	}

	int contarIdenfificador(int valorIdentificacao){
		return identificador += this.identificador;
	}



	public int getidentificador(){
		return identificador;

	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	
}