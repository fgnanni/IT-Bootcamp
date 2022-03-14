public class PagamentosDeServicos implements Transacao{

    @Override
    public void transaoOk() {
        System.out.println("Pagamento de Servico OK!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Pagamento de Servico nao realizado");
    }
}
