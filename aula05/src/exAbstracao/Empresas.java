package exAbstracao;
public class Empresas {
    String _ender;
    int _qtdFunc;
    
    public Empresas (String ender, int qtdFunc){
    _ender = ender;
    _qtdFunc = qtdFunc;
    }
    
    public void ExibeAtributos(){
    System.out.println("Endereço: " + _ender);
    System.out.println("Quantidade de Funcionários: " + _qtdFunc);
    }
    
}
