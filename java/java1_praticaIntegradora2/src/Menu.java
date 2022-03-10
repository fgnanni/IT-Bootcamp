import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    public static void showMenu(){

        int circuitChoice;

        System.out.println("==========Seja bem-vindo! Corrida na Selva.===========");
        System.out.println("===================================================================================");
        System.out.println("1- Cadastrar Participante." +
                "\n2- Listar Participantes." +
                "\n3- Remover Participante." +
                "\n4- Pagamentos Participantes");

        System.out.print("Escolha uma opcao: ");

        Scanner input = new Scanner(System.in);

        do{


            circuitChoice = input.nextInt();
            input.nextLine();

            switch (circuitChoice){
                case 1:
                    menuCategory();
                    break;

                case 2:
                    Participante.showParticipant();
                    break;

                case 3:
                    Participante.deleteParticipant();

                    break;

                case 4:
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcao inválida! Escolha uma opcao de 1-5.");
                    System.out.print("Escolha uma opcao valida: ");

            }

        }while(circuitChoice != 5);
    }

    public static void menuCategory(){

        System.out.println("==========Menu Categoria==========");
        System.out.println("1- Categoria Pequena");
        System.out.println("2- Categoria Media");
        System.out.println("3- Categoria Avancada");
        System.out.println("4- Voltar");
        System.out.print("Escolha uma opcao: ");

        int categoryChoice;

        Scanner input = new Scanner(System.in);

        do {

            categoryChoice = input.nextInt();
            input.nextLine();

            switch (categoryChoice){

                case 1:

                case 2:

                case 3:
                    Participante.registerParticipant(categoryChoice);
                    break;

                case 4:
                    showMenu();
                    break;

            }

        }while(categoryChoice != 4);


    }

}
