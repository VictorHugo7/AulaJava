package abstracao;


public class main {
    public static void main(String[] args) {
        //criar uma instancia de humano
        
        //human Human1 = new human("Victor Hugo", 19, "victor@gmail.com", "masc");

        filhoaluno objAluno = new filhoaluno ("Thiago Xavier",  28, "NetoDoChico@gmail.com", "Haku");
 
             objAluno.escreveratributos();
                
        director objDirector = new director ("Diretor cuzao", 88 , "direto@gmail.com", "Haku", 4243.5f);
        
             objDirector.escreveratributos();
             objDirector.exibirbonificacao();
             
        teacher objTeacher = new teacher ("Girafales", 77, "giragira@gmail.com", "Haku", 123.7f, "Sarrada no ar");
             
             objTeacher.escreveratributos();
             objTeacher.exibiratributosadicionais();
    }
         
    
}
