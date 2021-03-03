/** 
Código que coleta uma lista de produtos informados pelo usuario e imprime todos os produtos quando o usuario digitar a palavra FIM
*@author Carlos Dalagrana*/

import java.util.ArrayList;
import java.util.Scanner;

	public class Produtos{
	
		public static void main(String[] args){
			
			//Cria a lista onde serao colocados os produtos
			ArrayList<String> produtos = new ArrayList<String>();
			//Le da tela do sistema o que o usuario esta digitando
			Scanner s = new Scanner (System.in);
			//Explica para o usuario o que ele precisa fazer
			System.out.println("Liste seu produtos : Para sair digite FIM");
			
			//Inicializa a variavel que armazena o produto
			String produto;
			
			//Coleta o produto com  o scanner.nextLine -> faz a repeticao com o while, faz a verificacao pra ver se e diferente da palavra FIM
			while (!"FIM".equals(produto = s.nextLine())){
				
				produtos.add(produto);
			}
			
			System.out.println(produtos.toString());
		}
	}