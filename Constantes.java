/** 
Programa que imprime valores na tela, usando constantes
*@author Carlos Dalagrana
*/

	public class Constantes {
	
	public static void main (String [] args){
	
		//Variáveis são escritas no modelo Camel Case e podem assumir outros valores
		int populacaoBrasileira = 230569563;
			populacaoBrasileira = 321;
		
		//Constantes são escritas em letras maiúsculas, quando compostas são separadas por underline e precisam do modificador "final"	
		final double PI = 3.14159265358979323846;
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		
		System.out.println (PI);
		System.out.println (SEXO_MASCULINO);
		System.out.println (SEXO_FEMININO);
		
		
	}	
	
	}