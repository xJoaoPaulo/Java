package br.com.rd.rdevs.model;

public class ContaCorrente extends Conta {
	
	public void calculaTaxa() {
		valorImposto =  saldo * 0.01; 
	}

}
