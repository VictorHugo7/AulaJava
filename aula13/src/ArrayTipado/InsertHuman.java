package ArrayTipado;
/**
 *
 * @author victorhugo
 */
public class InsertHuman{
    public static void main(String[] args) {
        Human listpessoa[] = new Human[4]; 
       listpessoa[0]= new Human();
       listpessoa[0].nome = "Victor Hugo";
       listpessoa[0].idade = 19;
       listpessoa[0].email = "victorhugoaraujo1999@gmail.com";
    
       listpessoa[1] = new Human();
       listpessoa[1].nome = "Thiago Xavier";
       listpessoa[1].idade = 32;
       listpessoa[1].email = "sila.com";
       
        for (int i = 0; i < 4; i++) {
            if(listpessoa[i] != null){
            System.out.print("Nome: "+listpessoa[i].nome + " || ");
            System.out.print("Idade: "+listpessoa[i].idade + " || ");
            System.out.print("email: "+listpessoa[1].email + " || ");
            System.out.println("");
            }
        }
    }
}
