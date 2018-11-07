package aula06;
public class Principal {

    public static void main(String[] args) {

            boolean verificar = false; //primitivo
            Boolean check = new Boolean(true); //classe wrapper       
                System.out.println(verificar);
                System.out.println(check);

            //exemplos char
            char sexo = 'M'; //primitivo
            Character tipoSexo = new Character ('M');// classe Wrapper
            
            //short - 2 bytes
            short idade = 128; //primitivo
            Short idadea = new Short("1234");//classe Wrapper
            
            //Integer - 4 bytes
            int quantidade = 3000000;//primitivo
            Integer qtdProdutos = new Integer("35000");//classe Wrapper
          
            //Long - 8 bytes
            long cpf = 46867378854l;
            Long cnpj = new Long("124445746453");
        
            //float - 4 bytes
            float salario = 10000.50f;
            Float salarioComDesc = new Float("100000.50");
            //System.out.printf("%.2f",salario);
            
            //Double - 8 bytes
            double ganhoAtual = 12341241.50d;
            Double ganhoMensal = new Double ("234235233.55");
            
            
            //casting de inteiro para float
            int x = 10; //primitivo
            float y = (float)x;//criando casting quando se passa (float)antes de realizar a conversão direta
            System.out.println("Valor de x " + x);
            System.out.println("Valor de y " + y);
            
            //Casting de float pra int
            float a = 12.44f;
            int b = (int) a;
            System.out.println("Valor de a: " + a);
            System.out.println("Valor de b: " + b);
    
            //incremento a varíavel recebe ela mesma mais 1
            int q = 1;
            q++; 
             System.out.println ("a: "+ q);
            
            int h = 5;
            int t = 3;
             boolean checkValores = h == t;
             System.out.println("A é igual a B? " + checkValores);
             
             
            //usando Operadores Relacionais          
            int n1 = 5;
            int n2 = 6;                  
                if(n1!=n2){
                    System.out.println("Palmeiras não tem mundial");
                }else System.out.println("DEVOPS");
    }
}
