package exercicio4;
import java.util.Scanner;

public class Executador4 {
    public static void main (String arg[]){
        Scanner leitor = new Scanner(System.in);        
            String nomedono;
            String specie;
            String nome;
            String motivo;
        
        System.out.println("Informe o nome do Dono do Animal: ");
            nomedono = leitor.nextLine();
        System.out.println("Informe a Espécie do Animal: ");
            specie = leitor.nextLine();
        System.out.println("Informe o Nome do Animal: ");
            nome = leitor.nextLine();
        System.out.println("Informe o Motivo da visita: ");
            motivo = leitor.nextLine();
    
            Animal novoanimal = new Animal (nomedono, specie, nome, motivo);
            novoanimal.mostraranimal();
    
    }
    
    
}
