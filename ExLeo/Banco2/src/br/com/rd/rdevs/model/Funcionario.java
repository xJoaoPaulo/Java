package br.com.rd.rdevs.model;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	private int senha;
	private double bonificacao;
	
		
		public boolean autenticar(int senha) {
	    	if (this.senha == senha) {
	    	System.out.println("Acesso Permitido!");
	        	return true;
	    	} else {
	        	System.out.println("Acesso Negado!");
	        	return false;
	    	} 
		}


	    public void setNome(String nome) {
	        this.nome = nome; 
	    }

	    public String getNome() {
	        return nome; 
	    }
	    
	    public void setCpf(String cpf) {
	        this.cpf = cpf; 
	    }

	    public String getCpf() {
	        return cpf; 
	    }

	    public void setSalario(double salario) {
	        this.salario = salario; 
	    }

	    public double getSalario() {
	        return salario; 
	    }
	    
	    public double bonificacao() {
	    	return this.salario = salario * 0.10;
	    }
	    


		public double getBonus() {
			// TODO Auto-generated method stub
			return 0;
		}

}