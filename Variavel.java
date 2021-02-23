/** 
Programa que imprime nome e idade na tela, usando variáveis
*@author Carlos Dalagrana
*/

public class Variavel{

public static void main (String [] args) {
	
	String nome = "Carlos";
	int idade = 48;
	double preco = 14.65;
	char sexo = 'M';
	boolean casado = true;
	
	System.out.println(nome);
	System.out.println(idade);
	
	byte b = 127; //até 127
	short s = 32767; //até 32 mil
	int i = 2_000_000_000; //até 2 bilhões
	long l = 9_000_000_000_000_000_000L; // até 9 quintilões
	double d = 1.797693134862315E+308; //IEEE 754
	float f = 546F; //pode ser representado com a letra F no final
	byte bb = 0b01010101; //deve ser representado iniciando com 0b - 8 bits ou 1 byte
	short ss = 0b0101010101010101; //16 bits ou 2 bytes
	int ii = 0b01010101010101010101010101010101; //32 bits ou 4 bytes
	
	//Conversão
	i = s; //Cast Implícito
	System.out.println(s);
	System.out.println(i);
	
	i = (int) l; //Cast Explícito
	System.out.println(l);
	System.out.println(i);
	
	//numero decimal
	System.out.println(ii);
	
	
	

	
	
}
}