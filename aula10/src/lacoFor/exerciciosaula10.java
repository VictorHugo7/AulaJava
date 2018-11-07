package lacoFor;
import java.util.Scanner;
public class exerciciosaula10 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner (System.in);
//-------------------------------------------------------------------------------------------------
//         int i;
//         
//         for(i = 0; i <= 4; i++){
//             System.out.println("Digite uma nota: ");
//             float n1 = scanf.nextFloat();
//             
//             System.out.println("Digite outra nota: ");
//             float n2 = scanf.nextFloat();
//             
//             float m = (n1 + n2) / 2;
//             
//             System.out.printf("O aluno %dº fico com media %.2f: \n m);
//         
//         }
//-------------------------------------------------------------------------------------------------
//                int somar = 0;
//                int i,n; 
//         System.out.println("Digite o fim do laço de repetição");       
//         n = scanf.nextInt();
//         
//         for (i = 1; i <= n; i++){
//             somar += i;
//         }
//         System.out.println("Total " + somar);
// 
//-------------------------------------------------------------------------------------------------
//
//int i,x,y;
//        
//        System.out.println("Informe um numero: ");
//        x = scanf.nextInt();
//        
//        System.out.println("Informe outro numero: ");
//        y = scanf.nextInt();
//        
//    for(i=x; i<=y; i++){
//        System.out.println(i);
//        }      
//    }
//-------------------------------------------------------------------------------------------------
//Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes alunos,
//calcular e escrever a média aritmética dessas notas lidas
//-------------------------------------------------------------------------------------------------
//int alunos,n1, n2,m;
//int i;
//
//        System.out.println("Quantos alunos há na sua sala? ");
//        alunos = scanf.nextInt();
//        
//        for(i = 0; i <= alunos; i++){
//            System.out.println("informe a primeira nota: ");
//            n1 = scanf.nextInt();
//            System.out.println("Informe a segunda nota: ");
//            n2 = scanf.nextInt();
//            
//            m = (n1 + n2) / 2;
//            
//            System.out.printf("a media do aluno %dº é %d\n", i+1, m);
//                    
//        }
//---------------------------------------------------------------------------------------------------------------------
//Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita a entrada
//das seguintes informações: a) o número total de mercadorias no estoque; b) o valor de cada mercadoria. Ao final 
//imprimir o valor total em estoque e a média de valor das mercadorias.
//---------------------------------------------------------------------------------------------------------------------
//int i, totalmercadorias;
//float valormercadorias = 0,m, somar =0;
//
//        System.out.println("quantas mercadorias há no estoque?");
//        totalmercadorias = scanf.nextInt();
//        
//        for (i = 0; i < totalmercadorias; i++){
//            System.out.printf("informe o valor da mercadoria %dº\n", i+1);
//            
//            valormercadorias = scanf.nextFloat();
//            somar += valormercadorias;
//        }
//        
//        System.out.printf("Você tem %d mercadorias em estoque\n", totalmercadorias);
//        
//        System.out.println("o Valor total de mercadorias em estoque é: " + somar);
//        
//        m = somar / totalmercadorias;
//        
//        System.out.println("A media do valor das mercadorias em estoque é: "+m);
//-------------------------------------------------------------------------------------------------
//Escreva um algoritmo que imprima as seguintes seqüências de números: (1, 1 2 3 4 5 6 7 8 9 10) 
//(2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9 10) e assim sucessivamente, 
//até que o primeiro número (antes da vírgula), também chegue a 10. (Detalhe, este exercício pode ser resolvido
//utilizando laço dentro de laço) 
//-------------------------------------------------------------------------------------------------
//int i, n=10;
//    
//     for (i = 1; i <= n; i++){
//        
//        for (int j = 1; j <= n; j++) {  
//            
//            System.out.printf("%d, %d\n",i,j);
//            
//        }
//    }
//-------------------------------------------------------------------------------------------------
//Faça um programa que leia 5 valores e no final, escreva o maior e o menor valor lido.
//-------------------------------------------------------------------------------------------------
//int i,x, maiorn=0, menorn=0;
//    
//        for(i = 0; i<=4; i++){   
//        System.out.println("Informe um numero para saber qual é o maior");
//        x = scanf.nextInt();
//        
//        if (x < menorn || i == 0){
//            menorn = x;
//        
//        }
//        if (x > maiorn){
//        maiorn = x;
//        }
//}   
//        System.out.println("o maior numero informado foi: " +maiorn);
//        System.out.println("o menor numero informado foi: " +menorn);
//-------------------------------------------------------------------------------------------------
//Faça um algoritmo onde o usuário informará a idade e o peso de sete pessoas. Calcule e mostre: 
//A quantidade de pessoas com mais de 90 quilos; 
//A média das sete pessoas. 
//-------------------------------------------------------------------------------------------------
//int peso = 0, media=0,idade,pesado=0, i;
//
//for (i=0; i<= 3; i++){
//    System.out.printf("Informe a idade da pessoa %d\n",i+1);
//    idade = scanf.nextInt();
//    
//    System.out.printf("Informe o peso da pessoa %d\n",i+1);
//    peso = scanf.nextInt();         
//}
//    if(peso > 90){
//    pesado = peso;
//    System.out.println("a pessoa mais pesada tem: " +pesado);
//    }else System.out.println("não tem nenhuma pessoa com mais de 90 kg");
//    
//        media = peso+peso / 4;
//        System.out.println("a Media de peso é: " +media);   
    }
}