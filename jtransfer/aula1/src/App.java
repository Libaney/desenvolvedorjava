import java.io.FileWriter; // classe para escrever no arquivo
import java.io.IOException; // classe para tratar excessões do arquivo
import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        String name;
        int optionTransporte;
        String meioTransporte = "";
        //classe para teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("== Pesquisa de Transporte Diário ==");
        System.out.println("== Digite seu nome: ");
        name = scanner.nextLine();
        System.out.println(name);
        System.out.println("como você vai ao trabalho?");
        System.out.println("1-Metrô");
        System.out.println("2 - Onibus");
        System.out.println("3 - Caminhada");
        System.out.println("4 - Uber");
        System.out.println("5 - Taxi");
        System.out.println("6 - Carro");
        System.out.println("Escolha uma opção (1~6)");

        optionTransporte = scanner.nextInt();
        switch(optionTransporte) {
            case 1:
                meioTransporte = "Metrô"; break;
            
            case 2:
                meioTransporte = "Ônibus"; break;

            case 3:
                meioTransporte = "Caminhada"; break;
            
            case 4:
                meioTransporte = "Uber"; break;

            case 5:
                meioTransporte = "Taxi"; break;

            case 6:
                meioTransporte = "Carro"; break;
        }

        System.out.println("Name: "+name+","+   "meioTransporte:   "+meioTransporte);

    }
}
