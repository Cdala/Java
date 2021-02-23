/** 
Programa que imprime valores na tela, usando variáveis primitivas e de referência
*@author Carlos Dalagrana
*/

	public class Variavel2 {
	
	public static void main (String [] args) {
	
		//Variável Primitiva - Substitui pelo novo valor e desconsidera o anterior
		int x = 10; //1º valor
	    x = 15;     //2º valor
		
		//Variável de Referência - Substitui pelo novo valor, porém ainda o mantem na JMV até que o Garbage collector o limpa
		String y = "Duo Brothers"; //1º valor
	    y = "Duo Brothers Band";   //2º valor
		y = null;                  //null aciona o Garbage Collector
		
		System.out.println (x);
		System.out.println (y);
	}
	
	}