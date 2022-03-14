public class Basico {

    Saldo saldo;
    PagamentosDeServicos servicos;
    SaquesEmDinheiro saques;

    public Basico() {
        this.saldo = new Saldo();
        this.servicos = new PagamentosDeServicos();
        this.saques = new SaquesEmDinheiro();

    }
}
