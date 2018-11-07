/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

public class Pessoa {

private String nome;
private String nomePai;
private String nomeMae;
private boolean casadx;

public String getNome()
{
    return nome;
}
public String getNomePai()
{
    return nomePai;
}
public String getNomeMae()
{
    return nomeMae;
}
public boolean getCasadx()
{
    return casadx;
}
//métodos Set
public  void setNome (String novoNome)
{
    this.nome = novoNome;
}
public void setNomePai (String novoNomePai)
{
    this.nomePai = novoNomePai;
}
public void setNomeMae (String novoNomeMae)
{
    this.nomeMae = novoNomeMae;
}
public void setCasadx(boolean novoCasadx){
    this.casadx = novoCasadx;
}

}

