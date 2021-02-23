/** 
Programa que imprime valores na tela, usando tipos primitivos e Classes Wrapper - Envólucros para Tipos Primitivos
*@author Carlos Dalagrana*/

	public class Wrapper{
	
	public static void main (String [] args){
		
		//Classe Wrapper usa Letra maiúscula no início...nesse caso está criando um novo objeto "new" usando uma String
		Double preco = new Double ("13.36");
		
		//Tipo primitivo começa com letra minúscula...nesse caso está convertendo tipo primitivo para recuperar o valor do double do preço
		double d = preco.doubleValue();
		//convertendo tipo primitivo para recuperar o valor do inteiro do preço
		int i = preco.intValue();
		
		//Conversão Estática usando a própria classe sem criar um novo objeto
		double d1 = Double.parseDouble("135.65");
		int i1 = Integer.parseInt ("356");
		
		int i2 = Integer.valueOf ("101011", 2 ); //Imprime na tela o nº 43...no primeiro parâmetro está o valor binário e no 2º está a base de conversão binária
		
		System.out.println (i2);
	}
	
	}