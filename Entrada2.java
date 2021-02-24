/** 
Programa que recupera as entradas do usuário usando a classe JOptionPane, do pacote java.swing e imprime numa janela gráfica
*@author Carlos Dalagrana*/

//Importa o pacote que contém a classe
import javax.swing.JOptionPane;

	public class Entrada2{
		
		public static void main (String [] args){
			
			String nome = JOptionPane.showInputDialog("Digite o seu nome:"); // Cria a variável nome que vai receber o que o usuário vai digitar na caica de dialogo, usando a classe JOptionPane e o método showInputDialog
			//System.out.println(nome);                                     //Imprime diretamente na saída do sistema
			JOptionPane.showMessageDialog(null, nome);                      //Imprime o nome digitado pelo usuário numa caixa de dialogo com um ok para clicar para sair   
		}
		
	}