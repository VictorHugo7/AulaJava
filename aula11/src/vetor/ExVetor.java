
package vetor;
import java.util.Scanner;
public class ExVetor {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
//-------------------------------------------------------------------------------------------------
//Crie um algoritmo que armazene três valores em um vetor e, calcule o quadrado dos valores lidos. 
//-------------------------------------------------------------------------------------------------
//        int num [] = new int[3],result;
//    
//            for (int i = 0; i < num.length; i++) {
//                 System.out.println("Informe um numero:");
//                 num[i] = scanf.nextInt();            
//            }
//            
//            for (int i = 0; i < num.length; i++) {
//                
//                result = num[i] * num[i];    
//                System.out.printf("O resultado dos numeros o quadrado é na posicão [%d] é = %d \n",i,result);
//        }
//-------------------------------------------------------------------------------------------------
//  Faça um programa que leia 5 valores e armazene em um vetor e, em seguida, leia dois valores X e Y 
//  quaisquer que correspondentes a duas posições no vetor. Ao final, apresentar a soma dos valores 
//  encontradas nas respectivas posições X e Y.
//-------------------------------------------------------------------------------------------------
//int [] num = new int [5];
//int x,y,r;
//
//        for (int i = 0; i < 5; i++) {
//                System.out.printf("Informe um numero para armazenar no vetor na posição [%d]\n",i);
//                num[i] = scanf.nextInt();
//        }
//        
//            System.out.println("Lembre-se: O vetor tem 5 posições.");
//            System.out.println("Informe a posição do vetor que deseja consultar o conteúdo: ");
//            x = scanf.nextInt();
//            
//            System.out.println("Informe uma outra posição do vetor que deseja consultar o conteúdo: ");
//            y = scanf.nextInt();
//
//            r = num[x] + num[y];
//            
//            System.out.println("O Primeiro valor é: " +num[x]);
//            System.out.println("O segundo valor é: "+num[y]);
//            
//            System.out.println("A somatória é: "+r);
//-------------------------------------------------------------------------------------------------
// Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui.
//-------------------------------------------------------------------------------------------------
//int [] x = new int[10];
//int par=0;
//        for (int i = 0; i < 10; i++) {    
//            System.out.printf("Informe um valor para armazenar dentro da posição [%d] do vetor: \n",i);
//            x[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < 10; i++) {
//            
//            if (x[i] % 2 == 0){
//                par = par + 1;
//                System.out.printf("O numero guardado na posição [%d] é par\n",i);
//            }  
//        }
//                System.out.printf("Ao todo, temos %d numeros pares\n",par);
//-------------------------------------------------------------------------------------------------
//Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule e imprima a média geral.
//-------------------------------------------------------------------------------------------------
// float[] nota = new float [15];
// float media=0;
//        for (int i = 0; i < nota.length; i++){
//            System.out.printf("Informe a nota da prova do aluno[%d]\n",i);
//            nota[i] = scanf.nextFloat();
//            media = media + nota[i];
//        
//            if(i==nota.length-1){
//                float result=media/nota.length;
//                System.out.printf("A media é %.2f ", result);
//             }
//        } 
//-------------------------------------------------------------------------------------------------
//Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos, juntamente 
//com o maior, o menor e a média dos valores.
//-------------------------------------------------------------------------------------------------
//int [] v = new int [5];
//int i, maior = 0, menor = 0, media = 0,imaior = 0, imenor = 0;
//
//        for (i = 0; i < v.length; i++) {
//            System.out.printf("Informe um valor para ficar na posição [%d] do vetor\n",i);
//            v[i] = scanf.nextInt();
//        }
//        for (i = 0; i < v.length; i++) {
//            
//            if (i == 0) {
//                menor = v[i];
//                maior = v[i];  
//            } 
//            
//           if(v[i] > maior){
//                   maior = v[i];
//                   imaior = i;
//               }
//            
//            if(v[i] < menor || v[i] == 0){
//                   menor = v[i];
//                   imenor = i;
//               }
//            
//            media += v[i];
//        }
//        
//        media=media/v.length;
//        
//        System.out.printf("o maior valor informado se encontra na posição [%d] e ele é: %d\n",imaior,maior);
//        System.out.printf("O menor numero informado se encontra na posição [%d] e ele é: %d\n",imenor,menor);
//        System.out.printf("A media dos valores informados é: %d\n",media);
    }
}
