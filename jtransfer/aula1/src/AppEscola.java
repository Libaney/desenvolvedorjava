
import java.util.Scanner; //importar uma classe externa

public class AppEscola {
    //main
    //static = da classe
    //void = vazio

    public static void main (String args[]){
     
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String name= teclado.nextLine();
       
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        
       
        System.out.println("Tem Faculdade:  ");
        Boolean temFaculdade = teclado.nextBoolean();
        

        Aluno aluno = new Aluno(name, idade, temFaculdade);
        System.out.println(aluno.getName());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.gettemFaculdade());

    }


}
