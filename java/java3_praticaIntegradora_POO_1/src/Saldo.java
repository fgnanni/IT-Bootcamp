public class Saldo implements Transacao{


    @Override
    public void transaoOk() {
        System.out.println("Consultado saldo....");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Consulta de saldo não autorizado.!");
    }
}
