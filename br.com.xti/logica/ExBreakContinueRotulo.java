package logica;
public class ExBreakContinueRotulo{

	public static void main(String[] args){
	
		//break
		//continue
		//rotulos
		
		//exemplo break
		//para o fluxo de repeticao quando chegar a 5
		for( int i = 0; i < 10; i++ ) {
			if( i == 5) {
				break;
			}
			System.out.print(i + ",");
		}
		
		System.out.println();
		//exemplo de continue
		//quando chegar a 5 apenas pula esta instrucao e continua
		for( int i = 0; i < 10; i++ ) {
			if( i == 5) {
				continue;
			}
			System.out.print(i + ",");
		}
		
		System.out.println();
		
		//achar o elemento true
		boolean [][] matrix =
		{
			{false, true, false, false, false},
			{false, false, false, false, false}
		};
		//exemplo do uso de rotulos
		busca: //rotulo busca do for externo
		for(int a=0; a < matrix.length; a++) {
			//percorre todas as linhas
			System.out.print("A ");
			for(int b = 0; b < matrix[a].length; b++){
				if(matrix[a][b]) {
					System.out.print("TRUE ");
					break busca; //interrompe a partir do rotulo busca
					//sem o break e o rotulo aqui, ele iria retornar todos os valores
					//com o uso destes, poupa processamento do aplicativo
				}
				//percorre todos os campos
				System.out.print("B ");
			}
		}
	}

}