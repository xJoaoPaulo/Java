package exercicioExtra;

public class JavaLang {
	public static void main (String args[]) {
		
		//exercicio 1
		//1-1 pode se usar o método .indexOf() para verificar se existe uma string dentro de outra.
		//1-2 pode se usar o método .trim() para retirar os espaços em branco do inicio e fim.
		//1-3 pode se usar o método .equals("") para comparar a string em questão com vazio.
		//1-4 pode se usar o método .length para contar a quantidade de caracteres.
		
		//exercicio 2
		String teste = " João Paulo ";
		for (int i = 0; i < teste.length(); i++){
			System.out.println(teste.charAt(i));
		}
		
		//exercicio 3
		String frases = " Socorram-me, subi no ônibus em Marrocos anotaram a data da maratona"; 
		for (int i = frases.length()-1; i >= 0; i--){
			System.out.println(frases.charAt(i)); }
		
		//exercicio 4
        String x = "765";

        int num = Integer.parseInt(x);
        
        System.out.println(num);
        
        //teste de conversão
        int conta = (num / 2);
        System.out.println(conta);
       

		
		
			}

}

