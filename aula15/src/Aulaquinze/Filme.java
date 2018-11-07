package Aulaquinze;
import java.util.ArrayList;
public class Filme {

Long _FilmeID;
Long _CategoriaID;
String _nome;
ArrayList<Filme> filmeList = new ArrayList <Filme>();

public void listarFilme(){//método para listar os filmes cadastrados na lista filmeList   
  
    for (int i = 0; i < filmeList.size(); i++) {   
                Long catID = filmeList.get(i)._CategoriaID;            
                Long filmeID = filmeList.get(i)._FilmeID;
                String nomeFilme = filmeList.get(i)._nome;
                System.out.println("ID Categoria: " +catID);
                System.out.println("ID Filme: "+filmeID);
                System.out.println("Nome do Filme: "+nomeFilme);
           }
    
}
public void cadastrarFilme(Long categoriaID,Long filmeID, String nomeFilme) {    
        Filme objFilme = new Filme(); //Criado objeto da Classe Filme        
        
        objFilme._CategoriaID  = categoriaID;
        objFilme._FilmeID = filmeID;
        objFilme._nome = nomeFilme;
        
        filmeList.add(objFilme);
}

public void editarFilme( Long filmeID, String nomeFilme){
    for (int i = 0; i < filmeList.size(); i++) {
        if(filmeList.get(i)._FilmeID == filmeID){
            filmeList.get(i)._nome = nomeFilme;
        }else{
                System.out.println("FIlme não encontrado"); 
        }
    }
}

public void deletarFilme(Long idFIlme){
    for (int i = 0; i < filmeList.size(); i++) {
        if(filmeList.get(i)._FilmeID== idFIlme){
                filmeList.remove(filmeList.get(i));
                System.out.println("Removido com sucesso");
        }else{
                 System.out.println("Filme não encontrado");
        }
    }
}
}
