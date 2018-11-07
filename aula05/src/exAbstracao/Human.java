package exAbstracao;
public class Human {
   
    //declaração de atributos
    String _nome;
    float _fone;
    String _endereco;
    
    
    //metodo construtor
    public Human(String nome, float fone, String endereco){
    _nome = nome;
    _fone = fone;
    _endereco = endereco;
    }   
    
    public void escreveratributos(){
        System.out.println("Nome: " +_nome);
        System.out.println("Telefone: " +_fone);
        System.out.println("Endereço: " +_endereco);
    }
}
