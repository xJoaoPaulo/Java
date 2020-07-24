package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.Certidao;
import br.com.rd.rdevs.model.CertidaoCasamento;

public class TesteCartorio {
	public static void main (String args[]) {
		
		CertidaoCasamento certidao1 = new CertidaoCasamento();
		
		certidao1.setRegistro(00001);
		certidao1.setNome("Felipe e Vanessa");
		certidao1.setDeclarante("Felipe, Vanessa");
		certidao1.setTipoCertidao("Casamento");
		certidao1.setDataEmissao(23/07/2020);
		certidao1.setNomeTabeliao("João");
		certidao1.setCartorio("Cartorio de Registro SP");

		
		
		System.out.println(certidao1.getNome());
		
		
	}

}
