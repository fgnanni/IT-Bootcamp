public class Motocicletas extends Veiculos{

    public static final int PESO_MOTOCILETAS = 300;
    public static final int RODAS = 2;

    public Motocicletas(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO_MOTOCILETAS, RODAS);
    }



}
