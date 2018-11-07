package exAbstracao;
public class Veiculos {
            String _tipo;
            String _cor;
            String _motor;
            int _qtdPassageiro;
            float _valor;  
    
        public Veiculos (String tipo, String cor, String motor, int qtdPassageiro, float valor){
                _tipo = tipo;
                _cor = cor;
                _motor = motor;
                _qtdPassageiro = qtdPassageiro;
                _valor = valor;
            }

        public void EscreverAtributosVeic () {
            System.out.println("Tipo do veículo: " + _tipo);
            System.out.println("Cor: " + _cor);
            System.out.println("Motor do veículo: " +_motor);
            System.out.println("Quantidade Máxima de Passageiros: "+ _qtdPassageiro);
            System.out.println("Valor do Veículo: " + _valor);
}
}
