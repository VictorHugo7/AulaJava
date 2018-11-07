package exAbstracao;
public class MainEmpresas {
    public static void main(String[] args) {
        
        Restaurante objRest = new Restaurante("Rua dos Restaurante Gourmet",123, 1235);
        exibir(objRest);
        objRest.ExibeAtributos();
        objRest.ExibirMesas();
        
        SuperMercado objSM = new SuperMercado("Rua Dos Supermercado top", 123, 123);
        exibir(objSM);  
        objSM.ExibeAtributos();
        objSM.SuperMercado();
    }
    
    public static void exibir(Empresas empresa) {
        empresa.ExibeAtributos();
    }
}
