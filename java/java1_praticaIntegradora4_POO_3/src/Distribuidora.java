import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Distribuidora {

    public static HashMap<Integer, String> cart = new HashMap<Integer, String>();
    public static double totalPrice;

    public static void main(String[] args) {

        Menu.showMenu();
        Produto.showCart();
        System.out.println("Total do carrinho é de: R$" + totalPrice);

    }

}
