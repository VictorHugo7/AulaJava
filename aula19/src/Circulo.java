/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorhugo
 */
public class Circulo extends Figura {
    Double raio;
    
    @Override
    
    public Double area(){
    
        Double retorno = 3.14 * raio  * raio;
        
        return retorno;
    }
    
    public Double area(int qualquer){
    return 0d;
    
    }
}
