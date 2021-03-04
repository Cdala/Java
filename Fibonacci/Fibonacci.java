/** 
Código que calcula e imprime a sequencia de fibonacci ate um determinado numero, nesse caso 90
*@author Carlos Dalagrana*/


	public class Fibonacci{
	
		public static void main(String[] args){
		
			//Declara duas variaveis
			int anterior = 0;
			int proximo = 1;
			System.out.println(anterior);
			
			//usa o laco de repeticao while e enquanto a variavel proximo for menor que 90 ele executa o bloco
			while(proximo < 90){
			System.out.println(proximo);
			proximo = proximo + anterior; // Proximo numero fibonacci
			anterior = proximo - anterior; // Atualiza o numero fibonacci
			}
		}
	
	}