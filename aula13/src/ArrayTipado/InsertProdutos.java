//1 criar um array para cada produto ok
//2 criar uma clase para cada produto ok
// Atributos:  descrição, preço e quantidade ok
//3 criar um laço para receber os 5 produtos 
//4 caso o usuario desejar para de cadastrar deverá pressionar "S" para encerrar o cadastro dos produtos
//--------------------------------------------------------------------------------------------------------
package ArrayTipado;

import java.util.Scanner;

public class InsertProdutos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char sair = 'n';
        Produto produtolist[] = new Produto[5];

        for (int i = 0; i < produtolist.length; i++) {
            
            produtolist[i] = new Produto();

            System.out.println("Descrição: ");
            produtolist[i].descricao = leitor.next();

            System.out.println("Preço: ");
            produtolist[i].preco = leitor.nextFloat();

            System.out.println("Quantidade: ");
            produtolist[i].quantidade = leitor.nextShort();
            leitor.nextLine();

            System.out.println("Deseja Sair? S/N");
            sair = leitor.next().charAt(0);

                if (sair == 's') {
                    break;
                }
        }
        
        for (int i = 0; i < produtolist.length; i++) {
                    if (produtolist[i] != null) {
                        System.out.println("Descrição do produto cadastrado: " + produtolist[i].descricao + " || ");
                        System.out.println("Preço do produto cadastrado: " + produtolist[i].preco + " || ");
                        System.out.println("Quantidades inseridas: " + produtolist[i].quantidade + " || ");
                        System.out.println(" ");
                    }
        }
        
    }
}
