/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorhugo
 */
public class Funcionario {
    int funcionarioID;
    String  nomeFuncionario;
    double salario;

    public Boolean autenticar(String senha)
    {
        if (senha.equals("123")){
            return true;
        }else{
            return false;
        }
    
    }

}
