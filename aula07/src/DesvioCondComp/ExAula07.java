package DesvioCondComp;
import java.util.Scanner;

public class ExAula07 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);    
 //-----------------------------------------------------------------------------------------------       
//1 Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10.
//-----------------------------------------------------------------------------------------------
//    int n;
//        System.out.println("Informe um numero para consultar se é maior que 10: ");
//        n = leitor.nextInt();
//        
//        if(n>10){
//            System.out.println("O numero informado é maior que 10");
//        }else System.out.println("O numero informado é menor que 10");
//-----------------------------------------------------------------------------------------------
//2 Escrever um algoritmo que leia dois valores inteiro distintos e informe qual é o maior.
//-----------------------------------------------------------------------------------------------   
// int x, y;
// 
//        System.out.println("Informe um numero: ");
//        x = leitor.nextInt();
//        
//        System.out.println("Informe outro numero: ");
//        y= leitor.nextInt();
//        
//        if (x>y){
//            System.out.println("O maior numero é: "+ x);
//        }else System.out.println("O maior numero é: "+ y);
//-----------------------------------------------------------------------------------------------   
//3 Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200.
//-----------------------------------------------------------------------------------------------
// int x;
//
//        System.out.println("Informe um numero");
//        x = leitor.nextInt();
//        
//        if (x >= 100 && x <= 200) {
//            System.out.println("Numero informado está entre 100 e 200");
//        }else System.out.println("Numero informado não está entre 100 e 200");
//-----------------------------------------------------------------------------------------------
/*4 Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. 
Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7).*/
//-----------------------------------------------------------------------------------------------
String nome;
int n1,n2,n3, media;

        System.out.println("Informe o nome do aluno: ");
        nome = leitor.nextLine();
        
        System.out.println("Informe a primeira nota: ");
        n1 = leitor.nextInt();
        
        System.out.println("Informe a segunda nota: ");
        n2 = leitor.nextInt();
        
        System.out.println("Informe a terceira nota: ");
        n3 = leitor.nextInt();
        
        media =(n1+n2+n3) / 3;
        
        if(media >= 7)
            {            
                System.out.println("Sua media foi: " + media);
                System.out.println("Voce está aprovado, " +nome);
            }
        else{
            
                System.out.println("Sua media foi: " +media);
                System.out.println("Voce está reprovado, " +nome);
            }
//-----------------------------------------------------------------------------------------------
/*5 Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. 
Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes,
informe qual número é o maior, e uma mensagem que são diferentes.*/
//-----------------------------------------------------------------------------------------------
//int n1, n2, m = 0;
//
//        System.out.println("Informe um numero: ");
//        n1 = leitor.nextInt();
//        System.out.println("Informe outro numero: ");
//        n2 = leitor.nextInt();
//
//    if (n1 != n2 && (n1 > n2)){
//        m = n1;
//        System.out.println("Os numeros são diferentes");
//        System.out.println("O maior numero é: " +m);
//    }
//    else if(n2 > n1){
//        m = n2;
//        System.out.println("O maior numero é: " +m);
//    } else System.out.println("Os numero são iguais");

//-----------------------------------------------------------------------------------------------
/*6- Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para
imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético;*/
//-----------------------------------------------------------------------------------------------
//float a, b, r;
//String c;
//        System.out.println("Informe um valor");
//        a = leitor.nextFloat();
//        System.out.println("Informe outro valor");
//        b = leitor.nextFloat();
//        leitor.nextLine();
//        System.out.println("Informe um simbolo Aritmético");
//        c = leitor.nextLine();
//
//        if(c.equals("+")){
//            r = a + a;
//            System.out.println("O resultado da somatória é: " +r);
//        }
//        else if(c.equals("-")){
//            r = a - b;
//            System.out.println("O resultado da subtração é: " +r);
//        }
//        else if (c.equals("/")) {
//            r = a / b;
//            System.out.println("O resultado da divisão é: " +r);
//        }
//        else if (c.equals("*")){
//            r = a * b;
//            System.out.println("O resultado da multiplicação é: " +r);
//        }
//        else System.out.println("Não foi informado nenhum símbolo Aritmético");
//-----------------------------------------------------------------------------------------------
//7- A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que calcule
//e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//•Professor Nível 1 R$12,00 por hora/aula
//•Professor Nível 2 R$17,00 por hora/aula
//•Professor Nível 3 R$25,00 por hora/aula
//Ao final, informe o salário do professor. 
//-----------------------------------------------------------------------------------------------
//        System.out.println("                                 --------------------------");
//        System.out.println("                                |ESCOLA: APRENDER PRA SABER|");
//        System.out.println("                                 --------------------------");
//        System.out.println(" -------------------------------------------------------------------------------------");
//        System.out.println("| Professor Nível 1= R$12,00 | Professor Nível 2= R$17,00 | Professor Nivel= R$25,00 |");
//        System.out.println(" -------------------------------------------------------------------------------------");
//       
//       int nivel;
//       float profn1 = 12.00f, profn2 = 17.00f, profn3 = 25.00f;
//       float diastrab;
//       
//        System.out.println("qual o nível do professor que quer calcular o salário? ");
//        nivel = leitor.nextInt();
//        System.out.println("Quantas aulas o professor deu? ");
//        diastrab = leitor.nextFloat();
//        
//        switch (nivel) {
//            case 1:
//                diastrab= diastrab * profn1;
//                System.out.println("O professor Nível 1 deverá receber R$"+diastrab);
//                break;
//            case 2:
//                diastrab = diastrab * profn2;
//                System.out.println("O professor Nivel 2 deverá receber R$"+diastrab);
//                break;
//            case 3:
//                diastrab = diastrab * profn3;
//                System.out.println("O professor Nível 3 deverá receber R$"+diastrab);
//                break;
//            default:
//                System.out.println("informe um nível existente. Níveis existentes: 1, 2 e 3.");
//                break;
//        }
//-----------------------------------------------------------------------------------------------
//8- Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
//•Infantil A = 5 - 7 anos
//•Infantil B = 8 - 10 anos
//•juvenil A = 11- 13 anos
//•juvenil B = 14 - 17 anos
//•Sênior > 18 anos
//-----------------------------------------------------------------------------------------------
//System.out.println("Em qual Categoria, você nadador se encontra?");
//
//int idade;
//
//        System.out.println("Informe a sua idade: ");
//        idade= leitor.nextInt();
//        
//        if(idade >= 5 && idade <=7){         
//            System.out.println("Você esta na categoria Infantil A");
//        } else if (idade >= 8 && idade <= 10){
//            System.out.println("Você está na categoria Infantil B");
//        } else if (idade >= 11 && idade <= 13){
//            System.out.println("Você está na categoria Juvenil A");
//        } else if (idade >= 14 && idade <= 17){
//            System.out.println("Você está na categoria Juvenil B");
//        } else if (idade > 18){
//            System.out.println("Você está na categoria Sênior");
//        }
//-----------------------------------------------------------------------------------------------
    
//float h;
//int i = 1;
//            for(i=50; i>=0; i--){
//                
//                if(i%2 == 1){
//                    System.out.println("Numero impares");
//                     System.out.println(i);   
//                }else {
//                        System.out.println("numeros pares");
//                        System.out.println(i);
//                }
//                }
                
            }
    }
    

