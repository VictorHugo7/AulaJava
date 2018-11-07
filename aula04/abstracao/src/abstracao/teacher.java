package abstracao;

public  class teacher extends human {
    
    String _disc;
    float _sal;
   
    
    public teacher(String nome, int idade, String email, String sexo, float sal, String disc){
        super(nome, idade, email, sexo); //passando parametros para o papai  
        _disc = disc;
        _sal = sal;
    } 
    
    
    public void exibiratributosadicionais(){
    System.out.println("Discplina: " + _disc);
    System.out.println("Salario: " + _sal);
    }
    
}
