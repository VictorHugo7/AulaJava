package abstracao;

public class human {
    //declaração de atributos
    String _nome;
    int _idade;
    String _email;
    String _sexo;
    
    //metodo construtor
    public human(String nome, int idade, String email, String sexo){
    _nome = nome;
    _idade = idade;
    _email = email;
    _sexo = sexo;
    }   
    
    public void escreveratributos(){
        System.out.println("Nome: " +_nome);
        System.out.println("Idade: " +_idade);
        System.out.println("Email: " +_email);
        System.out.println("Sexo: " +_sexo);
    }
}
