package exAbstracao;
public class Restaurante extends Empresas{
        long _mesas;
        
        public Restaurante(String ender, int qtdFunc, long mesas){
            super(ender, qtdFunc);
        
            _mesas = mesas;
        }
        
        public void ExibirMesas() {
             System.out.println("Quantidade de mesas disponíveis: " + _mesas);
           
        }
}
