/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesvioCondComp;
import java.util.Scanner;

public class NomesIguais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       String nome1,nome2;
        System.out.println("_____________________________");
        System.out.println("VERIFICADOR DE NOMES IGUAIS");  
        System.out.println("-----------------------------");
        
            System.out.println("Informe um nome: ");
            nome1 = leitor.nextLine();
        
            System.out.println("Informe o outro nome: ");
            nome2 = leitor.nextLine();
      
      if (nome1.equalsIgnoreCase(nome2)){
          System.out.println("Nomes Iguais");
      }  else System.out.println("Nomes Diferentes");
       
        
    }
}
