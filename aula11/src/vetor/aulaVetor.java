package vetor;
public class aulaVetor {
    public static void main(String[] args) {
      
        String nome[] = new String [3];
 
        nome [0] = "Victor";
        nome [1] = "Thiago";
        nome [2] = "Souza";
        
        //length devolve o tamanho correspondente do array
        
        for (int i = 0; i < nome.length; i++) {
            System.out.printf("nome [%d] = %s \n",i,nome[i]);
            System.out.println("-------------------------");
            System.out.println(nome[i]);
        }
        
        
    }
}
