package vetor;
import java.util.Scanner;
public class exercicioVetor {
    public static void main(String[] args) {
        
        Scanner scanf = new Scanner (System.in);
        
        System.out.println("Informe o tamanho do Array:");
        int tamanhoarray = scanf.nextInt();
        
        int[] x = new int [tamanhoarray];
        
        for (int i = 0; i < tamanhoarray; i++) {
            System.out.println("digite um valor inteiro: ");
              x[i] = scanf.nextInt();
        }

        for (int i = tamanhoarray - 1; i >= 0; i--) {
            System.out.printf("Numeros informados na posição [%d] = %d \n",i,x[i]);
        }       
    }
}
