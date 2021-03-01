/** 
Código demonstra a construcao e uso de um Array
*@author Carlos Dalagrana*/

import java.util.Arrays;

	public class ArraySimples{
	
		public static void main(String [] args){
		
			//Declara o tipo, o nome e adiciona os dados
			String [] cidades = {"Sao Paulo","Rio de Janeiro", "Curitiba","Belo Horizonte"};
			System.out.println (cidades[0]);
			
			//Altera um valor do Array
			cidades [0] = "Porto Alegre";
			System.out.println (cidades[0]);
			
			//Acessa o tamanho do Array
			System.out.println (cidades.length);
			
			// Transforma para um tipo String
			System.out.println (Arrays.toString(cidades));
			
			//Pesquisa dentro Array 
			int posicao = (Arrays.binarySearch(cidades,"Rio de Janeiro"));
			System.out.println (posicao);
			
			//Ordena os elementos do Array
			Arrays.sort(cidades, 0, cidades.length);
			System.out.println(Arrays.toString(cidades));
			
			//Acessa um metodo do objeto dentro do array
			Double[] valores = {14.32, 32.56};
			System.out.println(valores [0].doubleValue());
			
			//Outra forma de inicializar um Array, que sempre é inicializada com a palavra chave "new", tanto com objetos "String" quanto em tipos primitivos "int"
			int [] pares = new int [5];
			pares [0] = 0;
			pares [1] = 2;
			pares [2] = 4;
			pares [3] = 6;
			pares [4] = 8;
			
			System.out.println (pares[4]);
			
			
		}
	}