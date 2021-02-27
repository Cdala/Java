/** 
Código calcula o IMC -> Indice de Massa Corporal
IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
*@author Carlos Dalagrana*/

//Importa o pacote da classe JOptionPane
import javax.swing.JOptionPane;

	public class IMC{
	
	public static void main (String [] args){
		
		//Entrada de dados feita pelo usuario
		String peso = JOptionPane.showInputDialog("Qual seu peso em Quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual sua altura em Metros?");
		
		//Captura os dados inseridos pelo usuario e converte a String para Double, que da classe Wrapper
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		
		//Faz o calculo do imc
		double imc = pesoEmQuilogramas/ (alturaEmMetros * alturaEmMetros);
		
		// Formula do operador ternario -> (avaliação ? valor : valor);	
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do peso ideal";
		
		//A variavel msg recebe o calculo do imc, faz uma quebra de linha e recebe tambem o valor antigo de msg
		msg = "IMC=" + imc + "\n" + msg; 
		
		//Mostra na tela grafica a mensagem da variavel msg
		JOptionPane.showMessageDialog(null , msg);
		
		
		
		}
	}