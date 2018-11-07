/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesvioCondComp;
import java.util.Scanner;
public class man1 {
    
    public static void main(String[] args) {
            
        Scanner teclado = new Scanner (System.in);   
        float notaUm, notaDois, notaTres, m;
        float somar = 0;
        
        //VERDADEIRO OU FALSO
System.out.println("Digite a primeira nota: ");
        notaUm = teclado.nextFloat();
        System.out.println("Digite a Segunda nota: ");
        notaDois = teclado.nextFloat();
        System.out.println("Digite a Terceira nota: ");
        notaTres = teclado.nextFloat();
        
 if (notaUm < notaDois && notaUm < notaTres){
 }else if (notaTres < notaDois && notaTres < notaUm){
     somar = notaUm + notaDois;
 }else {
     somar = notaUm +notaTres;
 } 
        somar  = somar /2 ;
        
        System.out.printf("A média é: %.2f", somar);
        
        
//-----------------------------------------------------------
             //DESCUBRA A MEDIA DO ALUNO (TRES NOTAS)
//-----------------------------------------------------------             
//        System.out.println("Digite a primeira nota: ");
//        notaUm = teclado.nextFloat();
//        System.out.println("Digite a Segunda nota: ");
//        notaDois = teclado.nextFloat();
//        System.out.println("Digite a Terceira nota: ");
//        notaTres = teclado.nextFloat();
//        
//        m = (notaUm+notaDois+notaTres)/3;
//        
//        System.out.println("A media do aluno é: "+m);
//-----------------------------------------------------------
}    
}
