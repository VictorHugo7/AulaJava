package exercicio2;
import java.util.Scanner;

public class Executador2 {
    
    public static void main (String arg[]){
        Scanner leitor = new Scanner(System.in);
    
        String titular;
        long num, saldo;

        System.out.println("Informe o numero da conta: ");
           num = leitor.nextLong();
            leitor.nextLine();
        System.out.println("Informe o titular da conta: ");
           titular = leitor.nextLine();
         
        System.out.println("Informe o Saldo: ");
            saldo = leitor.nextLong();
            
        Usuario usr = new Usuario (num, titular, saldo);
        
       usr.imprimir();
                                                                                 
    }     
}