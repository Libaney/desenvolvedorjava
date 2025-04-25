public class Aluno {
    //variáveis = atributos
    //caracteristicas dos objetos
    //class Wrappers
   private String name; 
   private int idade;
   private Boolean temFaculdade;
   
   public  Aluno(){

   }
   public Aluno(String name, int idade, Boolean temFaculdade){
    this.name = name;
    this.idade = idade;
    this.temFaculdade = temFaculdade;
   }
   public String getName(){
    return name;
   }
   public int getIdade(){
    return idade;
   }

   public Boolean gettemFaculdade(){
    return temFaculdade;
   }

}
