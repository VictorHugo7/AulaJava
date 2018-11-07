package abstracao;

public  class director extends human {
    
    float _bonificacao;
            
    public director(String nome, int idade, String email, String sexo, float bonificacao){
        super(nome, idade, email, sexo); //passando parametros para o papai  
        _bonificacao = bonificacao;
    } 
    
    
    public void exibirbonificacao(){
    System.out.println("Valor da bonificação: " + _bonificacao);
    }
    
}
