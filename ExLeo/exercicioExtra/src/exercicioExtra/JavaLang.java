package exercicioExtra;

public class JavaLang {
	public static void main (String args[]) {
		
		//exercicio 1
		//1-1 pode se usar o m�todo .indexOf() para verificar se existe uma string dentro de outra.
		//1-2 pode se usar o m�todo .trim() para retirar os espa�os em branco do inicio e fim.
		//1-3 pode se usar o m�todo .equals("") para comparar a string em quest�o com vazio.
		//1-4 pode se usar o m�todo .length para contar a quantidade de caracteres.
		
		//exercicio 2
		String teste = " Jo�o Paulo ";
		for (int i = 0; i < teste.length(); i++){
			System.out.println(teste.charAt(i));
		}
		
		//exercicio 3
		String frases = " Socorram-me, subi no �nibus em Marrocos anotaram a data da maratona"; 
		for (int i = frases.length()-1; i >= 0; i--){
			System.out.println(frases.charAt(i)); }
		
		//exercicio 4
        String x = "765";

        int num = Integer.parseInt(x);
        
        System.out.println(num);
        
        //teste de convers�o
        int conta = (num / 2);
        System.out.println(conta);
       

		
		
			}

}

