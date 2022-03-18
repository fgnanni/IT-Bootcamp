import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class Corridas {

    private int distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private int numeroDeVeiculosPermitidos;
    private List<Veiculos> listaDeVeiculos;

    public Corridas(int distancia, BigDecimal premio, String nome, int numeroDeVeiculosPermitidos){

        this.distancia = distancia;
        this.premioEmDolares = premio;
        this.nome = nome;
        this.numeroDeVeiculosPermitidos = numeroDeVeiculosPermitidos;
        this.listaDeVeiculos = new ArrayList<>();

    }
    public void addCarro(Carros carro){
        if(numeroDeVeiculosPermitidos > listaDeVeiculos.size()){
            listaDeVeiculos.add(carro);
            System.out.println("Carro cadastrado com sucesso na corrida!");
        } else {
            System.out.println("Cadastro não realizado, corrida já atingiu o número maximo de participantes");
        }

    }

    public void addMotocicleta(Motocicletas moto){
        listaDeVeiculos.add(moto);
    }

    public void deleteVeiculo(Veiculos veiculos){
        listaDeVeiculos.remove(veiculos);
        System.out.println(listaDeVeiculos.size());
    };
    public void deleteVeiculoComPlaca(String placa){
        Optional<Veiculos> veiculo = listaDeVeiculos.stream().filter(veiculos -> veiculos.getPlaca().equals(placa)).findAny();
        if(!veiculo.isEmpty()){
            System.out.println(veiculo);
            listaDeVeiculos.remove(veiculo);
        }else{
            System.out.println("Nenhum veiculo foi registrado com a seguinta placa " + placa);
        }
    };

    public void defineVencedor(){

        int maiorVelocidade = 0;
        int calculoVelocidade = 0;
        int velocidadeProvisoria;
        int aceleracaoProvisoria;
        int anguloRotacaoProvisoria;
        int pesoProvisorio;
        Veiculos vencedor = null;

        for (Veiculos veiculo: listaDeVeiculos) {
        
            velocidadeProvisoria = veiculo.getVelocidade();
            aceleracaoProvisoria = veiculo.getAceleracao();
            anguloRotacaoProvisoria = veiculo.getAnguloDeGiro();
            pesoProvisorio = veiculo.getPeso();

            calculoVelocidade = velocidadeProvisoria * 1 / 2 * aceleracaoProvisoria / (anguloRotacaoProvisoria * (pesoProvisorio - veiculo.getRodas() * 100));
            
            if(calculoVelocidade > maiorVelocidade){
                vencedor = veiculo;
                maiorVelocidade = calculoVelocidade;
            }
            
        }

        System.out.println("O piloto vencedor é " + vencedor.getClass().getSimpleName()  + vencedor.toString() + "totalizando uma velocidade de " + maiorVelocidade);

    }


}
