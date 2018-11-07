package exercicio3;
import java.util.Scanner;

public class Executador3 {
      
        public static void main (String arg[]){
            Scanner ler = new Scanner (System.in);
            
            Long sku, valprodt; 
            String nomeprodt;
            
            System.out.println("Ïnforme o SKU do Produto: ");
                sku = ler.nextLong();
                      ler.nextLine(); //este método interrope o método next.Long para poder realizar a leitura de uma String.
                      
            System.out.println("Ïnforme o Nome do Produto: ");
                nomeprodt = ler.nextLine();
                
            System.out.println("Ïnforme o Valor do Produto: ");
                valprodt = ler.nextLong();
      
            
            Produto prod = new Produto (sku, nomeprodt, valprodt);
            prod.mostrarprodt();
        }
}
