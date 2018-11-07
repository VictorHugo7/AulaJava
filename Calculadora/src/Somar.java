/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorhugo
 */
public class Somar extends Matematica {
    int n1, n2, resultado;
  
    @Override
    
    public int calcular(){
     resultado = n1 + n2;
     return resultado;
    }
    
}
