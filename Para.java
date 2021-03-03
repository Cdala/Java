/** 
Código que demonstra a utilizacao do laco de repeticao FOR
*@author Carlos Dalagrana*/


	public class Para{
	
		public static void main(String[] args){
			
			String texto = "";
		
		//Inicializacao, Teste, Acao e Atualizacao
		//Enquanto o numero for menor que 5 o bloco e executado
			for( int i=0; i<5; i++){
				
				texto += i + ",";
			}
				System.out.println(texto);
				
				
				String texto1 = "";
		
		//Inicializacao, Teste, Acao e Atualizacao
		//Enquanto o numero for maior que 0 o bloco e executado
			for( int i=10; i>0; i--){
				
				texto1 += i + ",";
			}
				System.out.println(texto1);
				
				String texto2 = "";
				
				//Inicializacao, Teste, Acao e Atualizacao
				//Executa o bloco e escreve os numeros pares de 0 a 20
			for( int i=0; i<=20; i++){
				
				if(i % 2 == 0){
				texto2 += i + ",";
				}
			}
				System.out.println(texto2);
				
		}
			
			
	}