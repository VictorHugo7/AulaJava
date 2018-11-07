package ArrayTipado;
import java.util.Scanner;
public class CadastroCliente {
    public static void main(String[] args)  {
        Scanner scanf = new Scanner (System.in);
        Cliente ListaCliente [] = new  Cliente [2];
        char sair = 'n';
        for (int i = 0; i < ListaCliente.length; i++) {
            
            ListaCliente[i]  =  new Cliente();
            
            System.out.println("Nome: ");
            ListaCliente[i].ClientName = scanf.next();
            
            System.out.println("Email: ");
            ListaCliente[i].ClientEmail = scanf.next();
            
            System.out.println("Telefone: ");
            ListaCliente[i].ClientTel = scanf.nextFloat();
            
            System.out.println("Quantas vezes você cortou o cabelo no Xavier Fashion Hair? (Se esta for sua primeira vez aqui, pressione zero)");
            ListaCliente[i].ClientFrequency = scanf.nextInt();
                    if(ListaCliente[i].ClientFrequency == 0 ){
                        System.out.println("Esta é sua primeira vez aqui! E será uma honra dar um UP na sua auto-estima!");
                        System.out.println("Onde será o checkup de hoje? No cabelo ou na Barba?");
                        System.out.println("Para Cabelo, pressione 1. Para Barba, pressione 2. Caso for fazer barba-cabelo-bigode, pressione 3");
                      ListaCliente[i].BarbaCabeloBigode = scanf.nextInt();
                    }else{
                        System.out.println("Eaí, qual vai ser o CheckUp de hoje?");           
                        System.out.println("Para Cabelo, pressione 1. Para Barba, pressione 2. Caso for fazer barba-cabelo-bigode, pressione 3");
                        ListaCliente[i].BarbaCabeloBigode = scanf.nextInt();
                    }
                    System.out.println("Deseja receber os emails de promocionais do Xavier Fashion Hair? [SIM | NÃO] ");
                    ListaCliente[i].acceptEmail = scanf.next();
                    System.out.println("Para finalizar seu cadastro / LOGIN , pressione 'S' ");
                    sair = scanf.next().charAt(0);
                    if (sair  == 's') {
                        break;
                       
            }
        }
            for (int i = 0; i < ListaCliente.length; i++) {
                
                if(ListaCliente != null){
                System.out.printf("Nome do cliente: %s\n",ListaCliente[i].ClientName );
                System.out.printf("Email: %s\n", ListaCliente[i].ClientEmail);
                System.out.printf("Telefone: %f\n", ListaCliente[i].ClientTel);
                System.out.printf("Visitas ao Xavier Fashion Hair: %d\n", ListaCliente[i].ClientFrequency);
                System.out.println("|               TABELA CHECKUP DO DIA:             |");
                System.out.println("| Cabelo = 1 | Barba = 2 | Barba-Cabelo-Bigode = 3 |");
                System.out.printf(" |               CheckUP do dia: %d                 |\n",ListaCliente[i].BarbaCabeloBigode); 
                System.out.printf("Recebimento de emails Promocionais: %s\n",ListaCliente[i].acceptEmail);
                }
                System.out.println(" ");
        }
        
    }
}
