package exAbstracao;
public class PessoaFisica extends Human {
    
   float _cpf;
   float _rg;
        
        public PessoaFisica  (String nome, float tel, String endereco, float cpf,float rg){
            super(nome, tel, endereco);
            _cpf = cpf;
            _rg = rg;
        }  

        public void PessoaFisica(){
            System.out.println("CPF: " + _cpf);
            System.out.println("RG: " + _rg);
        } 
}
