public class SaquesEmDinheiro implements Transacao{


    @Override
    public void transaoOk() {
        System.out.println("Saque em dinheiro realizado!.");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Saque em dinheiro nao realizado.");
    }
}
