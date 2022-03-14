import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

public class Produto {

    private int id;
    private static int countProduct;
    private String name;
    private double price;

    public Produto() {
    }

    public Produto(String name, double price) {
        this.id = countProduct++;
        this.name = name;
        this.price = price;
    }



    public double calculateProduct(int quantityProducts) {
        return quantityProducts * this.price;
    }

    public static void showCart(){
        for (Map.Entry<Integer, String> value : Distribuidora.cart.entrySet()) {
            System.out.println(value.getValue());
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", price= " + price;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
