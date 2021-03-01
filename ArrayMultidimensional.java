/** 
Código demonstra a construcao e uso de um Array Multidimensional
*@author Carlos Dalagrana*/

	public class ArrayMultidimensional{
	
		public static void main (String [] args){
		
		//Criando e imprimindo na tela do sistema o Array Multidimensional
		String[][]duas = {{"Carlos", "M", "PR"}, {"Maria","F", "SP"}};
		
		System.out.println (duas[0] [1]);
		System.out.println (duas[1] [2]);
		
		//Descobrindo quantos elementos tem dentro do Array Multidimensional
			System.out.println (duas[0].length);
		
		//Modificando os elementos de um Array de varias dimensoes
			duas [1][0] = "Renata";
			System.out.println (duas[1][0]);
		}
	
	}