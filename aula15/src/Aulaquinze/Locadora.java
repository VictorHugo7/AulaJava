package Aulaquinze;
import java.util.Random;
import java.util.Scanner;

public class Locadora {
    
    public static void main(String[] args) {
        Scanner scanf= new Scanner (System.in);
        Short opcao;
        Categoria objCateg = new Categoria();
        Filme objFilme = new Filme();
        Random rand = new Random();
        
        do{
            
            System.out.println(" M E N U - LOCAFILM");
            System.out.println("0 = sair");
            System.out.println("1 = cadastrar categoria");
            System.out.println("2 = cadastrar filmes");
            System.out.println("3 = editar filme");
            System.out.println("4 = Deletar Filme");
            System.out.println("5 = Editar categoria");
            opcao = scanf.nextShort();
        
            
            switch (opcao){
                
                case 1:
                    
                    String nomeCategoria;
                    long id = rand.nextInt(50) +1 ;
                    
                    System.out.println("Informe a categoria para cadastrar:");        
                    nomeCategoria = scanf.next();
                    objCateg.cadastrarCateg(id, nomeCategoria);
                    System.out.println("Cadastrado com sucesso, mestrão!");
                    break;
                    
                case 2:
                       String nomeFilme = null;
                      id =rand.nextInt(50);
                      System.out.println("Escolha uma categoria");
                      objCateg.listarCateg();
                      long idCategoria = scanf.nextLong();
                      scanf.nextLine();
                      System.out.println("Informe o nome do filme");
                      nomeFilme = scanf.next();   
                      objFilme.cadastrarFilme(idCategoria, id, nomeFilme);
                       break;
                        
                case 3:
                    objFilme.listarFilme();
                    System.out.println("Escolha um filme para editar pelo ID: ");
                    id = scanf.nextLong();
                    System.out.println("Informe o novo nome do filme: ");
                    nomeFilme = scanf.next();
                    objFilme.editarFilme(id, nomeFilme);
                    System.out.println("Filme alterado com sucesso, Mextrão! ");
                     break;       
            
                case 4:
                    objFilme.listarFilme();
                    System.out.println("Escolha um filme pelo ID praa deleta-lo: ");
                    id = scanf.nextLong();
                    scanf.nextLine();
                     objFilme.deletarFilme(id);
                       break;
                case 5:
                    objCateg.listarCateg();
                    System.out.println("Escolha uma categoria para Editar pelo ID");
                    id = scanf.nextLong();
                    scanf.nextLine();
                    System.out.println("Informe o novo nome da Categoria");
                    nomeCategoria = scanf.nextLine();
                    
                    objCateg.editarCateg(id, nomeCategoria);
                    
                    break;
                       
                case 0:
                    System.out.println("Vai com Deus!");
                    break;
                    
                    default:
                    System.out.println("Informe uma opção válida");
                    break;
            }
            
        }while(opcao!=0);
            
        objFilme.listarFilme();
    }
    
}
