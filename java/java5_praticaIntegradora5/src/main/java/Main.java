import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Carros piloto1 = new Carros(100,30,45,"ABC213");
        Carros piloto2 = new Carros(80, 35, 90,"FBC234");
        Carros piloto3 = new Carros(200,100,90,"POT324");
        Carros piloto4 = new Carros(150,85,65,"OTP908");
        Carros piloto5 = new Carros(185,90,75,"FLA210");


        Motocicletas piloto6 = new Motocicletas(100, 50, 75, "BCA321");
        Motocicletas piloto7 = new Motocicletas(250, 150, 90, "LSD420");
        Motocicletas piloto8 = new Motocicletas(150, 90, 65, "DSL873");
        Motocicletas piloto9 = new Motocicletas(190, 90, 85, "LKJ872");
        Motocicletas piloto10 = new Motocicletas(200, 130, 45, "OPG098");


        Corridas corrida = new Corridas(300,new BigDecimal(2300.49),"Corrida de interlagos", 10);

        corrida.addCarro(piloto1);
        corrida.addCarro(piloto2);
        corrida.addCarro(piloto3);
        corrida.addCarro(piloto4);
        corrida.addCarro(piloto5);

        corrida.addMotocicleta(piloto6);
        corrida.addMotocicleta(piloto7);
        corrida.addMotocicleta(piloto8);
        corrida.addMotocicleta(piloto9);
        corrida.addMotocicleta(piloto10);

        corrida.deleteVeiculoComPlaca("abc123");

        corrida.defineVencedor();

    }

}
