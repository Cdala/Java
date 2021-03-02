/** 
Código demonstra a aplicacao do fluxo condicioanl if else
*@author Carlos Dalagrana*/

	public class Condicional{
	
		public static void main (String[] args){
		
			//Calcula se a pessoa e menor de idade -> forma simples e direta do if 
			int idade = 17;
			if(idade < 18) {
				
				System.out.println("Menor de idade");
				
			}
			
			//Calcula se o numero e par ou impar -> forma simples e direta do if else
			int numero = 11;
			if((numero % 2)==0) {
				
				System.out.println("Par");
				
			}	else {
					System.out.println("Impar");
			}
		
		{
		
			//Calcula se a pessoa e considerada crianca, adulto ou melhor idade -> forma simples e direta do if com varios elses
			int idade1 = 61;
			if(idade1 <= 11) {
				
				System.out.println("Crianca");
				
			} else if (idade1 > 11 && idade1 <= 18){
				
				System.out.println("Adoloescente");
			}else if (idade1 > 18 && idade1 <= 60){
				
				System.out.println("Adulto");
			}else {
				System.out.println("Melhor idade");
			}
		
		}	
		
			//Calcula se o aluno foi aprovado, reprovado ou esta em recupracao -> forma de if else com if aninhado -> MELHOR FORMA DE SE USAR
			int nota = 4;
			if(nota >= 7) {
				
				System.out.println("Aprovado");
				
			}	else {
					System.out.println("Reprovado");
					if(nota >= 5){
					System.out.println("Recuperacao");
					}
			}
		
		
		}
	}		
	
