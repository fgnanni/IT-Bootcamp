import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Veiculos {

    private int velocidade;
    private int aceleracao;
    private int anguloDeGiro;
    private String placa;
    private int peso;
    private int rodas;

    public Veiculos(int velocidade, int aceleracao, int anguloDeGiro, String placa, int peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}
