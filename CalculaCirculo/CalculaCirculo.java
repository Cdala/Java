/** 
Código calcula o diâmetro, circunferência e área de um círculo
*@author Carlos Dalagrana*/

//Importa o pacote que contém a classe Scanner
import java.util.Scanner;


	public class CalculaCirculo{
	
		public static void main (String [] args){
			
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o raio");
		double raio = s.nextDouble();
		
		//Formula do Diametro -> 2r
		double diametro = 2*raio;
		System.out.println("Diametro=" + diametro);
		
		//Fomula da Circunferencia -> 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("Circunferencia=" + circunferencia);
		
		//Formula da Area -> PI * r2
		double area = pi * (raio * raio);
		System.out.println("Area=" + area);
		
		}
	}