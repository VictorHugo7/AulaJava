package Aulaquinze;
import java.util.ArrayList;

public class Categoria {
    //atributos classe categoria
    Long _categoriaID;
    String  _descricao;
     ArrayList <Categoria> categoriaList = new ArrayList <Categoria>();
     
//metodo para cadastrar categoria  
public void cadastrarCateg(Long categoriaID,String descricao){

Categoria objCategoria = new Categoria();//criando um objeto do tipo categoria   
objCategoria._categoriaID = categoriaID;
objCategoria._descricao = descricao;
categoriaList.add(objCategoria);
  }
   //metodo para listar categoria cadastradas
  public void listarCateg(){
      for (int i = 0; i < categoriaList.size(); i++) 
      {
          Long id = categoriaList.get(i)._categoriaID;
          String nome = categoriaList.get(i)._descricao;
          System.out.println(id+ "-"+ nome);   
      }  
   }
 public void editarCateg(Long ID, String batata){
     for (int i = 0; i < categoriaList.size(); i++) {
         if (categoriaList.get(i)._categoriaID == ID) {
             categoriaList.get(i)._descricao = batata;
         }else{
             System.out.println("Categoria inexistente");
         }
     }
     
 }
}
