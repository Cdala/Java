/** 
Código verifica se as expressões são iguais, se uma é diferente da outra e também se ela faz a negação da expressão 
*@author Carlos Dalagrana*/

	public class Operador4{
	
		public static void main (String [] args){
		
		//O operador "E" verifica se as duas expressões são verdadeiras
		int x = 7;
		System.out.println((x >=1) && (x<=10));
		
		//O operador "OU" verifica se a primeira ou a segunda expressão é verdadeira
		int x1 = 7;
		System.out.println((x1 >=1) || (x1<=10));  
		
		//O operador "NÃO" faz a negação da expressão, invertendo o resultado dela
		int x2 = 7;
		System.out.println(!(x2 >=1)); 
		}
	}