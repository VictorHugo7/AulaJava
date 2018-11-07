package exAbstracao;
public class MainVeic {
    public static void main(String[] args) {
     
        Carro objCar = new Carro ("Carro - Kombi", "Verde", "Motor de BMW", 14, 14.00f);
        objCar.EscreverAtributosVeic();
        
        Barcos objBar = new Barcos ("Boia", "Preta","braço", 1, 420.00f);
        objBar.EscreverAtributosVeic();
    }
}
