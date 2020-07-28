package br.com.rd.rdevs.main;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;


public class TesteCollecion {
	
	public static void main (String[] args) {
		
		//Set<String> cargos = new HashSet<>();// uma ordem qualquer
		//Set<String> cargos = new LinkedHashSet<>(); //na ordem da inserção
		
		//cargos.add("Gerente");
		//cargos.add("Diretor");
		//cargos.add("Analista");
		//cargos.add("Contador");
		//argos.add("Gerente");
		
		//System.out.println(cargos);
		
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("Teste 10");
		conjunto.add("Teste 20");
		conjunto.add("Teste 30");
		conjunto.add("Teste 40");
		conjunto.add("Teste 50");
		
		for(String texto : conjunto) {
			System.out.println(texto);
		}
	}

}
