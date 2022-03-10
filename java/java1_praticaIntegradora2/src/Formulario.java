import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Formulario {

    public static List<String> showForm(){

        List<String> participantRegistration = new ArrayList<String>();

        String rg, firstName, lastName, age, phoneNumber, emergencyNumber, bloodGroup;


        Scanner input = new Scanner(System.in);

        System.out.println("==========Ficha Cadastral==========");

        System.out.print("RG: ");
        rg = input.nextLine();
        participantRegistration.add(rg);

        System.out.print("Nome: ");
        firstName = input.nextLine();
        participantRegistration.add(firstName);

        System.out.print("Sobrenome: ");
        lastName = input.nextLine();
        participantRegistration.add(lastName);

        System.out.print("Idade: ");
        age = input.nextLine();
        participantRegistration.add(age);

        System.out.print("Número de celular: ");
        phoneNumber = input.nextLine();
        participantRegistration.add(phoneNumber);

        System.out.print("Número de emergencia: ");
        emergencyNumber = input.nextLine();
        participantRegistration.add(emergencyNumber);

        System.out.print("Grupo sanguineo: ");
        bloodGroup = input.nextLine();
        participantRegistration.add(bloodGroup);

        return participantRegistration;
    }


}
