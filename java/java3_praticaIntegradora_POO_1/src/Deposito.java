public class Deposito implements Transacao {


    @Override
    public void transaoOk() {
        System.out.println("Depositando....");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Deposito não autorizado");
    }
}
