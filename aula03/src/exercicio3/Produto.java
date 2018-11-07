package exercicio3;
//código, nome e valor do produto. 

public class Produto {
    Long _sku;
    String _nomeprodt;
    Long _valprodt;
    
    
    
    public Produto (Long sku, String nomeprodt, Long valprodt){
        _sku = sku;
        _nomeprodt = nomeprodt;
        _valprodt = valprodt;
        }
    
    public void mostrarprodt(){
        System.out.println("SKU: " + _sku);
        System.out.println("Nome: " + _nomeprodt);
        System.out.println("Valor do produto: " + _valprodt);
}
    
    
}
