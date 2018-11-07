package exercicio1;
import java.util.Scanner;

public class Executador1 {
    
    public static void main (String arg[]){
        Scanner leitor = new Scanner(System.in);
    
        String nome, endereco;
        long cnpj, tel;

        System.out.println("Informe o nome do fornecedor: ");
            nome =leitor.nextLine();
       
        System.out.println("Informe o CNPJ: ");
            cnpj = leitor.nextLong();
            leitor.nextLine();
         
        System.out.println("Informe o endereço: ");
            endereco = leitor.nextLine();
           
        System.out.println("informe o telefone: ");
            tel = leitor.nextLong();
            
        Fornecedor forn = new Fornecedor(nome,cnpj, endereco, tel);
        forn.mostrarfornecedores();
                                                                                 
    }     
}
