import br.com.mercadolivre.model.Cachorro;
import br.com.mercadolivre.model.Gato;
import br.com.mercadolivre.model.Vaca;

public class Main {

    public static void main(String[] args) {

        Gato gatinho = new Gato();
        Cachorro cachorrinho = new Cachorro();
        Vaca vaquinha = new Vaca();

        gatinho.emitirSom();
        gatinho.comerAlimento(gatinho,"carne");
        System.out.println();

        cachorrinho.emitirSom();
        cachorrinho.comerAlimento(cachorrinho,"carne");
        System.out.println();

        vaquinha.emitirSom();
        vaquinha.comerAlimento(vaquinha, "pasto");

    }

}
