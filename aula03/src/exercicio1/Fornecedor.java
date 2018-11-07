
package exercicio1;

public class Fornecedor {
    String _nome;
    Long _cnpj;
    String _endereco;
    Long _tel;
    
    //metodo construtor
    public Fornecedor (String nome, Long cnpj, String endereco, Long tel){
        _nome = nome;
        _cnpj = cnpj;
        _endereco = endereco;
        _tel = tel;    
    }
    public void mostrarfornecedores(){
        System.out.println("Nome Fornecedor: " + _nome);
        System.out.println("CNPJ: " + _cnpj);
        System.out.println("Endereço: " + _endereco);
        System.out.println("Telefone: " + _tel);
    } 
}