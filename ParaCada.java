/** 
Código que demonstra a aplicacao do foreach "for(tipo do elemento que tem dentro do Array - fornece uma variavel : aqui retorna o elemento que ele deve percorrer)"
*@author Carlos Dalagrana*/

import java.util.ArrayList;

	public class ParaCada{
	
		public static void main(String[] args){
		
		//Cria a variavel que recebe a lista de numeros pares
			int[] pares = {2,4,6,8};
			//enquanto i for menor que todos os elementos do Array e incrementado 1
			for(int i=0; i<pares.length; i++){
				
				//A variavel par recebe o Array e o contadoe e imprime o conteudo da variavel par
				int par = pares[i];
				System.out.println(par);
			}
			
			//foreach Cria uma lista do tipo Integer e enquanto o contador for menor que 10 e executado o bloco e incrementa 1
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0; i<10; i++){
				
				//cada vez quee e contado o cntador e adicionado a lista
				list.add(i);
				
			}
			for(Integer numero : list){
				
				System.out.println(numero);
			}
		
		}
	}