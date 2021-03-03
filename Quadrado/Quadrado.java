/** 
Código que cria um quadrado com asteríscos utilizando um laco de repeticao FOR dentro de outro
*@author Carlos Dalagrana*/

	public class Quadrado{
		
		public static void main(String[] args){
		
		//Cria a variavel que recebe o tamanho do quadrado
			int tamanho = 20;
			
			//Enquanto o valor for menor que 20 executa o bloco for interno e acrescenta um ao contador j
			for(int j=0; j<tamanho; j++){
				
				for(int i=0; i<tamanho; i++){
					//Imprime na tela do sistema sem a quebra de linha
					System.out.print("* ");
				}
				//Imprime na tela do sistema com a quebra de linha
				System.out.println();
			}
		}
	}