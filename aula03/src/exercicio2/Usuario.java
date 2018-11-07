package exercicio2;

public class Usuario {
        Long _num;
        String _titular;
        Long _saldo;
    
    public Usuario(Long num, String titular, Long saldo){
        _num = num;
        _titular = titular;
        _saldo = saldo;
        }
    
    public void imprimir(){
        System.out.println("|-----------------------------------|");
        System.out.println("|numero da conta: " + _num);
        System.out.println("|-----------------------------------");
        System.out.println("|titular da conta: " + _titular);
        System.out.println("|-----------------------------------");
        System.out.println("|Saldo: " + _saldo);
        System.out.println("|-----------------------------------|");
        }
}
