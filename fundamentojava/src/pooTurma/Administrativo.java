package pooTurma;

public class Administrativo extends Senac {
String emailCorporativo;
String redeDominio;
public Administrativo() {
	System.out.println("Dado pessoais");

  }

  void registrarPonto() {
	  System.out.println("Ponto registrar no sistema! ");
  }
  void imprirHolerite() {
	  System.out.println("Holerite impresso!");
  }
	  
   
    void abrirChamadoSuporte() {
    	
     System.out.println("Luiz, computador paroude funcionar!");
    	
    }
    
    
    
    public void acessarSistema() {
    	if (redeDominio == "@sp.senac.br") {
    		logar();
    	}
    		
    
    	
    	else { 
    		
    		
    		System.out.println("Login não realizado.tente novemente, " + nome);
    		
    	}
    }
    
}


