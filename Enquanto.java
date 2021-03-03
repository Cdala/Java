/** 
Código que demonstra a aplicacao do while e o do while (fluxo de repeticao que faz avaliacao) 
*@author Carlos Dalagrana*/


	public class Enquanto{
	
		public static void main(String[] args){
		
			//O while executa o bloco de codigo 0 ou n vezes
			int i = 0;
			while(i<2){
				
				System.out.println(i);
				i++;
			}
			
			//O do while executa o bloco de codigo 1 ou mais vezes
			int j = 3;
			do{
				System.out.println(j);
				j++;
			}while (j<2);
		}
	}