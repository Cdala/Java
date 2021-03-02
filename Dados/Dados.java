/** 
Código do jogo de dados que pergunta ao usuario qual e o palpite, mostra qual o valor do dado e diz se o palpite esta correto ou errado
*@author Carlos Dalagrana*/

import java.util.Scanner;
import java.util.Random;

	public class Dados{
	
		public static void main(String[] args){

		//Cria um novo objeto para capturar o valor digitado pelo usuario
		Scanner s = new Scanner(System.in);
		
		//Imprime na tela do sistema 
		System.out.println("Qual e o seu palpite?");
		
		//Cria uma variavel palpite do tipo inteiro que vai receber o valor do dado  
		int palpite = s.nextInt();
		
		//Cria um novo objeto para buscar o valor aleatorio do dado -> sao 6 fazes do dado "0...5" entao adiciona-se +1 para o 0 passar a ser 1 e o 5 passar a ser 6
		Random n = new Random();
		int dado = n.nextInt(6) + 1;
		
		//Imprime na tela do sistema o palpite digitado pelo usuario e o valor do dado
		System.out.println("Palpite =" + palpite);
		System.out.println("Dado =" + dado);
		
		//Verifica de o palpite e igual ao valor do dado
		if(palpite==dado){
			
			//Imprime na tela do sistema se o usuario acertou
			System.out.println("Acertou");
		} else {
			
			//Imprime na tela do sistema se o usuario errou
			System.out.println("Errou");
		}
		
		
		
		
		
		
		}
	}