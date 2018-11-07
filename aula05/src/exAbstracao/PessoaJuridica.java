package exAbstracao;
public class PessoaJuridica extends Human {

    float _cnpj; 
   
    public PessoaJuridica(String nome, float tel, String endereco, float cnpj){
        super(nome, tel, endereco);
        _cnpj = cnpj;
    }
    
    
    public void PessoaJuridica(){

            System.out.println("CNPJ:" + _cnpj);
    }
        
}
