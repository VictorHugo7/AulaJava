package exAbstracao;

public class main {
    public static void main (String [] args){
    
        PessoaFisica objPF = new PessoaFisica  ("Victor Hugo", 19.981457454f, "Rua Padre Manuel Campello", 468.67378854f, 37.327001f);
        objPF.escreveratributos();
        objPF.PessoaFisica();
        
        
        PessoaJuridica objPJ = new PessoaJuridica ("Adv algum", 19.98134234f, "Padre Manuel", 1231231.23123f);
        
        objPJ.escreveratributos();
        objPJ.PessoaJuridica();   
    }
}
