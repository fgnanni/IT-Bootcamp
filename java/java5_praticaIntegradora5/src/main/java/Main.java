import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Carros piloto1 = new Carros(100,30,45,"abc213");
        Motocicletas piloto2 = new Motocicletas(100, 50, 75, "bca321");

        Corridas corrida = new Corridas(300,new BigDecimal(2300.49),"Corrida de interlagos", 10);

        corrida.addCarro(piloto1);
        corrida.addMotocicleta(piloto2);

        corrida.deleteVeiculoComPlaca("abc123");

    }

}
