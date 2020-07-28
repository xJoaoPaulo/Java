package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.Conta;

public class TestaConta {

	public static void main(String args[]){
		Conta minhaConta;
		minhaConta = new Conta();
		Conta cc= new Conta();
		
		minhaConta.setNumero(1257);
		minhaConta.setTitular("Ivo");
		minhaConta.depositar(20000);

		System.out.println(minhaConta.recuperarDadosParaImpressao());
		
		
		Conta outraConta = new Conta();
		
		outraConta.setNumero(1258);
		outraConta.setTitular("João");
		outraConta.depositar(10000);

		
		System.out.println(outraConta.recuperarDadosParaImpressao());
		
	

	}
}
