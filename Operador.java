/** 
Código que apresenta tipos de operadores faz cáuculos básicos usando operadores e operandos
*@author Carlos Dalagrana*/

	public class Operador{
	
	public static void main (String [] args) {
	
		// Operador Binário  -> 5 + 3
		// Operador Unário   -> - 3
		// Operador Ternário -> false? "sim" : "não"
		
		int x = 5 + 3;
		System.out.println (x);
		
		String y = "5" + "3";
		System.out.println (y);
		
		double z = 5 + 8 - 3 * 3;
		System.out.println (z);
		
		double z1 = (5 + 8 - 3) * 3;
		System.out.println (z1);
	}
	}