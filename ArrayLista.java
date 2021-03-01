/** 
Código cria dios Arrays busca de forma aleatoria uma carta do baralho
*@author Carlos Dalagrana*/

import java.util.ArrayList;

	public class ArrayLista{
	
		public static void main(String[] args){
		
		//Cria o ArrayList
		ArrayList<String> frutas = new ArrayList<>();
		frutas.add("Laranja");
		frutas.add("Pera");
		frutas.add("Uva");
		frutas.add("Maca");
		
		//remove um elemento da lista do Array
		frutas.remove("Maca");
		
		//Imprime na tela do sistema o ArrayList
		System.out.println(frutas.toString());
		
		//Imprime na tela do sistema o tamanho do ArrayList
		System.out.println("Tamanho=" +frutas.size());
		
		//Imprime na tela do sistema um elemento específico do ArrayList
		System.out.println("Elemento=" +frutas.get(2));
		
		//Imprime na tela do sistema qual é o indice, em que posicao esta um elemento dentro do ArrayList
		System.out.println("Indice da fruta=" +frutas.indexOf("Uva"));
		
		//Imprime na tela do sistema se existe tal elemento dentro do ArrayList
		frutas.contains("Laranja");
		System.out.println("Tem Laranja?" +frutas.contains("Laranja"));
		}
	}