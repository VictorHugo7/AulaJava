package exAbstracao;
public class SuperMercado extends Empresas{
    int _data;
    
    public SuperMercado(String ender, int qtdFunc, int data){
    super(ender, qtdFunc);
    
    _data = data;
    }
    
    public void SuperMercado(){
    System.out.println("Data de fundação: " + _data);
    }
}
