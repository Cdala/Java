/** 
Código que apresenta tipos de operadores faz cáuculos básicos usando operadores e operandos
*@author Carlos Dalagrana*/

	public class Operador2{
	
	public static void main (String [] args){
	
		int x = 4 % 2; // Operador Módulo expressa o resto da divisão
		System.out.println(x);
		
		int y = 4; 
		int y1 = ++y; //Operador de Incremento -> Pré-incremento
		System.out.println(y);
		System.out.println(y1);
		
		int z = 4; 
		int z1 = y++; //Operador de Incremento -> Pós-incremento
		System.out.println(z);
		System.out.println(z1);
		
		int y2 = 4; 
		int y3 = ++y; //Operador de Decremento -> Pré-decremento
		System.out.println(y2);
		System.out.println(y3);
		
		int z2 = 4; 
		int z3 = y++; //Operador de Decremento -> Pós-decremento
		System.out.println(z2);
		System.out.println(z3);
	
	
	}
	
	}