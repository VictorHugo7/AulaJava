package vetor;
import java.util.Scanner;
public class VETORINT {
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    
    int x[] = new int [4];
    
    for (int i=0; i < 4; i++){
            System.out.println("Digite um valor inteiro");
            x[i] = leitor.nextInt();
}
    for(int i=0; i < x.length; i++){
            System.out.println(x[i]);
}    
    }
    
    
}
