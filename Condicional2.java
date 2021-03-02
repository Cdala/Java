/** 
Código demonstra a aplicacao da condicioanl switch -> avalia em modo de comparacao com varias opcoes, avalia a igualdade dos operandos 
*@author Carlos Dalagrana*/

	public class Condicional2{
	
		public static void main(String[] args){
		
		//Declaracao da variavel e atribuicao de um valor para ela
		char sexo = 'M';
		
		//Variavel e chamada para comparacao nos casos a seguir e imprime o resultado  
		switch (sexo) {
			case 'M':
				System.out.println("Masculino");
				break;
			case 'F':
				System.out.println("Feminino");
				break;
			default:
				System.out.println ("Outro");
			
		}
		
		//Declaracao da variavel e atribuicao de um valor para ela
		String tecnologia = "HTML";
		
		//Variavel e chamada para comparacao nos casos a seguir e imprime o resultado  
		switch (tecnologia) {
			case "PHP":
			case "Java":
			case "C#":
				System.out.println("Linguagem de programacao");
				break;
			case "Mongo DB":
			case "Oracle":
			case "Mysql":
				System.out.println("Banco de Dados");
				break;	
			case "HTML":
			case "XML":
			case "SGML":
				System.out.println("Linguagem de marcacao");
				break;
			default:
				System.out.println("Tecnologia desconhecida");
			
			
		}
		
		}
	
	}