/*
Criar (imaginar, pesquisar ou consultar os magos) um exemplo e aplicar os conceitos de classe aprendidos. 
Por exemplo, imaginem outras situações do mundo real que possam ser transformadas em classe.
Pode ser algum cadastro para um site, um usuário de algum produto, enfim, tente criar uma classe. 
 */
package exercicio4;

public class Animal {
    String _nomedono;
    String _specie;
    String _nome;
    String _motivo;
    
    public Animal(String nomedono, String specie, String nome, String motivo){
        _nomedono = nomedono;
        _specie = specie;
        _nome = nome;
        _motivo = motivo;
        }
    
    public void mostraranimal(){
        System.out.println("Dono: " + _nomedono);
        System.out.println("Espécie: " + _specie);
        System.out.println("Nome: " + _nome);
        System.out.println("Motivo: " + _motivo);
        }
}
