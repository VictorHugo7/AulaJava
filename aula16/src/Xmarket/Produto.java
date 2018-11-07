package Xmarket;
import java.util.ArrayList;

public class Produto {
long _idProduto;
String _descricaoProduto;
long _idSetor;
ArrayList<Produto> listaProduto = new ArrayList <Produto>();

public void cadastrarProduto(long idProd, String descProd, long idSetor){
Produto objProduto = new Produto();

objProduto._idProduto = idProd;
objProduto._descricaoProduto =descProd;
objProduto._idSetor = idSetor;

listaProduto.add(objProduto);
}
public void listarProduto(){
    for (int i = 0; i < listaProduto.size(); i++) {
        long idProduto = listaProduto.get(i)._idProduto;
        long idSetor = listaProduto.get(i)._idSetor;
        String descSetor = listaProduto.get(i)._descricaoProduto;
        System.out.println("ID produto: " +idProduto);
        System.out.println("ID Setor: " +idSetor);
        System.out.println("Produto: " +descSetor);
    }
}
public void editarProduto(long idProd, String novoProd){
      for (int i = 0; i < listaProduto.size(); i++) {
          if(listaProduto.get(i)._idProduto == idProd){
          listaProduto.get(i)._descricaoProduto = novoProd;
          }else{
              System.out.println("Não há um produto deste cadastrado");
          }
    }
}
public void deletarProduto(long idProd){
    for (int i = 0; i < listaProduto.size(); i++) {
        if (listaProduto.get(i)._idProduto == idProd) {
            listaProduto.remove(listaProduto.get(i));
            System.out.println("Produto removido com sucesso");
        }
    }
}
}

