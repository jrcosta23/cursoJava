package logicaDeProgramacao;

public class EstruturaDeDecisão {

	public static void main(String[] args) {
		String nome = "João Roberto";
		int idade = 22;
		char Sexo = 'M';
		
		if (Sexo == 'M') {
		 System.out.println("Alistamento militar obrigatório!");
		}
		 
		 else {
		 System.out.println("Não é necessário se alistar.");
			 
		}
		
		
		System.out.println("______________________________________");
		
		if (Sexo == 'M') {
			if(idade >= 18) {
			System.out.println("Alistamento obrigatório!");
			}
			
			else {
			System.out.println("Você não tem a idade necessário.");
			}
			
		  }
		  
		else {
			System.out.println("É preciso ser do sexo masculino para "
					+ "com obrigatóriedade!");
		}
		
	}

}
