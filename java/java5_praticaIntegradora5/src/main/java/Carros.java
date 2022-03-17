public class Carros extends Veiculos{

    private static final int PESO_CARRO = 1000;
    private static final int RODAS = 4;

    public Carros(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO_CARRO, RODAS);
    }

}
