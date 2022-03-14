public class Transferencia implements Transacao{

    @Override
    public void transaoOk() {
        System.out.println("Transferindo....");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transferencia não realizada.");
    }
}
