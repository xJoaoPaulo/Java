package br.com.rd.rdevs.model;

public abstract class Gerente extends Funcionario {
	private int numeroDeFuncionariosGerenciados;
	private int senhaG;

	public static void gerenciarFuncionarios() {

	}
	
	@Override
	public boolean autenticar(int senhaG) {
	    if (this.senhaG == senhaG) {
	    System.out.println("Acesso Permitido!");
	        return true;
	    } else {
	        System.out.println("Acesso Negado!");
	        return false;
	    } 
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	public double getBonificacao(){
		return this.salario * 0.15;
}



}
