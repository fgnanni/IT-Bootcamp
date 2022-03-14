
import java.util.Scanner;

public class Menu {

    public static void showMenu() {

        int option;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("==========Mercadinho==========\n" +
                    "1) Adicionar produto\n" +
                    "2) Sair\n" +
                    "Digite uma das opcoes acima: ");

            option = input.nextInt();

            switch (option) {

                case 1:
                    showSubMenu();
                    break;

                case 2:
                    System.out.println("Saindo...");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }


        } while (option != 2);

    }

    public static void showSubMenu() {

        int option;
        String name = "";
        double price = 0.00;
        int quantity = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("==========Mercadinho - Tipo do Produto==========\n" +
                    "1) Pereciveis\n" +
                    "2) Nao Pereciveis\n" +
                    "3) Voltar\n" +
                    "Digite uma das opcoes acima: ");

            option = input.nextInt();
            input.nextLine();

            if(option != 3){

                System.out.print("Nome do produto: ");
                name = input.nextLine();

                System.out.print("Preco do produto: ");
                price = Double.parseDouble(input.nextLine());

                System.out.print("Quantidade do produto: ");
                quantity = input.nextInt();
                input.nextLine();
            }


            switch (option) {

                case 1:
                    System.out.print("Dias para vencer: ");
                    int expiredDate = input.nextInt();
                    input.nextLine();
                    Produto produto = new Pereciveis(name, price, expiredDate);

                    Distribuidora.totalPrice += produto.calculateProduct(quantity);

                    Distribuidora.cart.put(produto.getId(), produto.toString());

                    break;

                case 2:
                    System.out.print("Tipo: ");
                    String typeProduct = input.nextLine();

                    Produto nonPerishableFood = new NaoPereciveis(name,price,typeProduct);
                    Distribuidora.totalPrice += nonPerishableFood.calculateProduct(quantity);

                    Distribuidora.cart.put(nonPerishableFood.getId(), nonPerishableFood.toString());

                    break;

                case 3:
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }


        } while (option != 3);

    }

}
