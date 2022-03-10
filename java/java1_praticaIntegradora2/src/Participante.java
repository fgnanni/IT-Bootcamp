import java.util.*;

public class Participante {

    public static int smallRegistrationNumber = 0, mediumRegistrationNumber = 0, advancedRegistrationNumber = 0;
    public static List<String> participantRegistration = new ArrayList<String>();

    public static HashMap<Integer, List<String>> listSmallParticipants = new HashMap<>();
    public static HashMap<Integer, List<String>> listMediumParticipants = new HashMap<>();
    public static HashMap<Integer, List<String>> listAdvancedParticipants = new HashMap<>();

    public static void registerParticipant(int circuitLevel ){

        switch (circuitLevel){

            case 1:
                smallRegistrationNumber++;
                participantRegistration = Formulario.showForm();
                listSmallParticipants.put(smallRegistrationNumber, participantRegistration);
                System.out.println("Usuário cadastrado!");
                break;

            case 2:
                mediumRegistrationNumber++;
                participantRegistration = Formulario.showForm();
                listMediumParticipants.put(mediumRegistrationNumber, participantRegistration);
                System.out.println("Usuário cadastrado!");
                break;

            case 3:
                advancedRegistrationNumber++;
                participantRegistration = Formulario.showForm();
                listAdvancedParticipants.put(advancedRegistrationNumber, participantRegistration);
                System.out.println("Usuário cadastrado!");
                break;

        }

        Menu.showMenu();

    }

    public static void showParticipant(){

        System.out.println("==========Listar Participantes - Categoria==========");
        System.out.println("1- Categoria Pequena");
        System.out.println("2- Categoria Media");
        System.out.println("3- Categoria Avancada");
        System.out.println("Escolha uma opcao: ");

        int categoryChoice;

        Scanner input = new Scanner(System.in);

        do {

            categoryChoice = input.nextInt();
            input.nextLine();

            switch (categoryChoice){

                case 1:


                    System.out.println("==========Lista Participantes - Circuito Pequeno==========");
                    System.out.printf("%-15.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s\n","ID","RG", "NOME", "SOBRENOME", "IDADE", "TELEFONE", "TELEFONE EMERGENCIAL", "TIPO SANGUINEO");
                    for (Map.Entry<Integer, List<String>> list : Participante.listSmallParticipants.entrySet()){
                        Integer key = list.getKey();
                        List<String> value = list.getValue();
                        System.out.print("ID - " + key + " ");
                        value.forEach(s -> System.out.printf("%-30.30s", s));
                        System.out.println();
                    }
                    break;


                case 2:

                    System.out.println("==========Lista Participantes - Circuito Medio==========");
                    System.out.printf("%-15.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s\n","ID","RG", "NOME", "SOBRENOME", "IDADE", "TELEFONE", "TELEFONE EMERGENCIAL", "TIPO SANGUINEO");
                    for (Map.Entry<Integer, List<String>> list : Participante.listMediumParticipants.entrySet()){
                        Integer key = list.getKey();
                        List<String> value = list.getValue();
                        System.out.printf("%-15.30s",key);
                        value.forEach(s -> System.out.printf("%-30.30s", s));
                        System.out.println();
                    }
                    break;

                case 3:


                    System.out.println("==========Lista Participantes - Circuito Avancado==========");
                    System.out.printf("%-15.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s\n","ID","RG", "NOME", "SOBRENOME", "IDADE", "TELEFONE", "TELEFONE EMERGENCIAL", "TIPO SANGUINEO");
                    for (Map.Entry<Integer, List<String>> list : Participante.listAdvancedParticipants.entrySet()){
                        Integer key = list.getKey();
                        List<String> value = list.getValue();
                        System.out.print("ID - " + key + " ");
                        value.forEach(s -> System.out.printf("%-30.30s", s));
                        System.out.println();
                    }
                    break;

                case 4:
                    Menu.showMenu();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + categoryChoice);
            }

        }while(categoryChoice != 5);


    }

    public static void deleteParticipant(){

        System.out.println("==========Deletar Participantes - Categoria==========");
        System.out.println("1- Categoria Pequena");
        System.out.println("2- Categoria Media");
        System.out.println("3- Categoria Avancada");
        System.out.println("Escolha uma opcao: ");

        int categoryChoice;
        int idParticipant;

        Scanner input = new Scanner(System.in);

        do {

            categoryChoice = input.nextInt();
            input.nextLine();

            switch (categoryChoice){

                case 1:

                    System.out.print("Informe o ID do participante que deseja deletar:");
                    idParticipant = input.nextInt();

                    List<String> remove = Participante.listSmallParticipants.remove(idParticipant);

                    if(remove == null){
                        System.out.println("O ID informado não existe");
                    } else{
                        System.out.println(remove + "foi removido com sucesso");
                    }


                    break;


                case 2:

                    System.out.print("Informe o ID do participante que deseja deletar:");
                    idParticipant = input.nextInt();

                    remove = Participante.listMediumParticipants.remove(idParticipant);

                    if(remove == null){
                        System.out.println("O ID informado não existe");
                    } else{
                        System.out.println(remove + "foi removido com sucesso");
                    }
                    break;

                case 3:


                    System.out.print("Informe o ID do participante que deseja deletar:");
                    idParticipant = input.nextInt();

                    remove = Participante.listAdvancedParticipants.remove(idParticipant);

                    if(remove == null){
                        System.out.println("O ID informado não existe");
                    } else{
                        System.out.println(remove + "foi removido com sucesso");
                    }
                    break;

                case 4:
                    Menu.showMenu();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + categoryChoice);
            }

        }while(categoryChoice != 5);


    }

}
