/** 
Programa que recupera as entradas do usuário usando args "método da classe main" e também pela classe Scanner, do pacote java.util
*@author Carlos Dalagrana*/

//Importa o pacote que contém a classe
import java.util.Scanner;

	public class Entrada{
		
		public static void main (String [] args) {
			
			//Recupera pelo método main na chamada do programa pela saída
			//System.out.println (args[0]);
			
			//Recupera Interagindo com o usuário
			Scanner s = new Scanner (System.in);       //Cria um novo objeto para ler na entrada do sistema usando a classe Scanner
			System.out.println("Digite o seu nome?");  //Imprime na saída do sistema a pergunta para o usuário interagir
			String nome = s.nextLine();                //Cria a variável nome do tipo String e faz a leitura da entrada usando o método nextLine, que retorna uma String como resultado
			System.out.println ("Bem vindo " + nome);  //Imprime na saída do sistema uma saudação ao usuário concatenando a variável nome
			
			
		}
		
	}