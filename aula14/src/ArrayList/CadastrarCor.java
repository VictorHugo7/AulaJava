package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class CadastrarCor {
    
    public static void main(String[] args) { //inicio main
        
        ArrayList<Cor> ListaCores = new ArrayList <Cor>(); //isto está dentro do main
        
        Scanner scanf =  new  Scanner(System.in); // Scanner chamado 'scanf' tbm esta no main
        
        char saida = 'n'; //iniciando a variável saida com 'n'
        int opcao;//declarando variável opcao para o switch case
        
        do{//inicio faca
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Remover");
                System.out.println("3- Editar");
                System.out.println("--------------------");
                
                opcao = scanf.nextInt();
                scanf.nextLine();
                
                switch (opcao){
                    case   1:
                        cadastrar(ListaCores, scanf);
                       break;
                    
                    case 2:
                        deletar(ListaCores,scanf);
                        break;
                        
                    case 3:
                        editar(ListaCores,scanf);
                        break;
                        
                    default:
                        System.out.println("Opção invalida, seu animal!");
                        break;
                }
                System.out.println("\t--------------------");
                System.out.println("\tItens cadastrados");
                System.out.println("\t--------------------");
                 for (int i = 0; i < ListaCores.size(); i++) {
                String nome = ListaCores.get(i).descricao;
                System.out.println("\t" + nome);
                System.out.println("\t--------------------");
        }         
                System.out.println("Voce quer sair?");
                saida = scanf.next().charAt(0);
                System.out.println("--------------------");
        }while(saida != 's'); 
     
       
        
    }
    
 public static void deletar(ArrayList<Cor> lista, Scanner scanf){
     if(lista.size()==0){
         
         System.out.println("Não há cores cadastradas!");
     }else { System.out.println("Qual cor vc deseja deletar?");
                        String cor = scanf.next();
         
                        for (int i = 0; i < lista.size(); i++) {
                                Cor item = lista.get(i);
                                
                                 if (cor.equalsIgnoreCase(item.descricao)) {
                                lista.remove(item);
                                  System.out.println("Item removido com sucesso!");   
                               }
                        }
     }
 }
  public static void editar(ArrayList<Cor> lista, Scanner scanf){
                System.out.println("Qual cor vc deseja editar?");     
                String cor = scanf.next();
                
           for (int i = 0; i < lista.size(); i++) {
             Cor item = lista.get(i);//item é um objeto do tipo cor e é usado para guardar o valor get da lista na posição i do vetor
                    
             if (cor.equalsIgnoreCase(item.descricao) ){
  
                 System.out.println("Informe uma nova cor");            
                 item.descricao = scanf.next();
                 System.out.println("--------------------");
                  System.out.println("Editado com sucesso");
                  System.out.println("--------------------");
                  break;                                       
          }else {
                 System.out.println("Esta cor não existe na lista");
             }
           } 
  }
    public static void cadastrar (ArrayList<Cor> lista, Scanner scanf){

        System.out.println("Digite uma cor");
        String  d = scanf.next();
        
        //Criando um objeto do tipo cor 
        Cor novaCor = new Cor();
        
        novaCor.descricao = d;
        
        lista.add(novaCor);//adiciona um item na lista
        System.out.println("--------------------");
        System.out.println("Cadastrado com sucesso!");
        System.out.println("--------------------");
        
    
    }
    
}
