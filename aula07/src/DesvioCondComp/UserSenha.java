/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesvioCondComp;
import java.util.Scanner;

public class UserSenha {
    public static void main(String[] args) {
        Scanner Leitor  = new Scanner(System.in);
        String user;
        int key;
        
        System.out.println("User:" );
        user = Leitor.nextLine();
        
        System.out.println("Senha: ");
        key = Leitor.nextInt();
                    
                    //verificar user and key 
        if (key == 123 && user.equalsIgnoreCase
        /*equalIgnoreCase é um metodo que ignora as letras maisuculas 
        ou minuscluas pra clase do usuario*/ ("Victor")){
                System.out.println("Usuario Logado");
                
        }else System.out.println("Usuario ou senha incorreta");
        
    }
    
}
