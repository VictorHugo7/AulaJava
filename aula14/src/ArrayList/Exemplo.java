package ArrayList;

import java.util.ArrayList;

public class Exemplo {
    
    public static void main(String[] args) {
        ArrayList <String>  nomes = new ArrayList <String>();
       int tam= nomes.size();

       //método add (adicionar valores)
        nomes.add("Victor");
        nomes.add("Davizera");
        nomes.add("Gabrielzera");
        
        tam = nomes.size();
        //Método size (Mostrar o tamanho do arraylist)
        for (int i = 0; i <  tam; i++) {
            //Método get (Pegar um elemento dentro do array list pelo indice)
            System.out.println(nomes.get(i));
        }
            //Método remove (Remove um valor do ArrayList) 
                                    nomes.remove(nomes.get(0));  
            
            
            System.out.println("**********************************");
       
            
            System.out.println(tam);
            
            nomes.clear();
           
            tam = nomes.size();
            
            System.out.println(tam);
        }
    }
    

