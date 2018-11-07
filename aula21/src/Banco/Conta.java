/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author victorhugo
 */
public class Conta {
    private double saldo;
    String nome;
    
    
    public double getSaldo()
    {
    return saldo;
    }
    
    public String getNome()
    {
    return nome;
    }
    
    public void setNome (String novoNome){
    nome = novoNome;
    }
    
    public void depositar (double valor)
    {
        saldo +=valor;
    }
    
    public void mostrarSaldo()
    {
        System.out.println("Saldo: " + saldo);
    }
    
}
