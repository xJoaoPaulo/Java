package exercicioExtra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collections {
	public static void main ( String args[]) {
		
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for (int i = 0; i < total; i++){
			teste.add(i);
		}
		for (int i = 0; i < total; i++){
			teste.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		
		//1 ArrayList é mais lento, o tempo gasto foi de 247 contra 6 do HashSet!
		//2 o uso de Set ou List se torna melhor quando precisamos retornar uma posição exata.
		//3 infer generic type arguments.
		
		
		/*
		 * Conta c1 = new ContaCorrente(); c1.depositar(10000); Conta c2 = new
		 * ContaCorrente(); c2.depositar(3000); // cria o mapa Map<String, Conta>
		 * mapaDeContas = new HashMap<>(); // adiciona duas chaves e seus valores
		 * mapaDeContas.put("diretor", c1); mapaDeContas.put("gerente", c2); // qual a
		 * conta do diretor? Conta contaDoDiretor = mapaDeContas.get("diretor");
		 * System.out.println(contaDoDiretor.getSaldo());
		 */
		
		System.out.println("Iniciando...");
		long inicio2 = System.currentTimeMillis();
		// trocar depois por ArrayList
		List<Integer> teste2 = new ArrayList<>();
		for (int i = 0; i < 30000; i++) {
			teste.add(i);
		}
		long fim2 = System.currentTimeMillis();
		double tempo2 = (fim2 - inicio2) / 1000.0;
		System.out.println("Tempo gasto: " + tempo2);
		
		//4 a diferença foi de apenas 0.001 com vantagem para ArrayList.
		
		//5 e 6 -- erros na classe banco.



	

		

	}

}
