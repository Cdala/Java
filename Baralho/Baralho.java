/** 
Código cria um Array e busca de forma aleatoria uma carta do baralho
*@author Carlos Dalagrana*/

import java.util.Random;

	public class Baralho{
	
		public static void main(String [] args){
		
			//Cria os Arrays
			String[] faces = {"A","2","3" ,"4","5","6","7","8","9","10","Valete","Dama","Rei"};
			String[] nipes = {"Paus","Copas","Espadas","Ouros"};
			
			//Cria uma nova instancia usando a classe Random
			Random r = new Random();
			
			//Cria a variavel face do tipo String que recebe o Array faces e executa o metodo r.nextInt que escolhe aleatoriamente uma face em toda a estensao do Array faces
			String face = faces[r.nextInt(faces.length)];
			
			//Cria a variavel nipe do tipo String que recebe o Array naipes e executa o metodo r.nextInt que escolhe aleatoriamente um nipe em toda a estensao do Array nipes
			String nipe = nipes[r.nextInt(nipes.length)];
			
			String carta = face + " " + nipe;
			System.out.println (carta);
			
			}
	}