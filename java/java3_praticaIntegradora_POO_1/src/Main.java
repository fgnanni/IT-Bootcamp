public class Main {

    public static void main(String[] args) {
        Executivos user01 = new Executivos();
        Basico user02 = new Basico();
        Cobradores user03 = new Cobradores();


        System.out.println("================EXECUTIVO==========================" +
                "\n=====================DEPOSITO======================");
        user01.deposito.transaoOk();
        user01.deposito.transacaoNaoOk();
        System.out.println("=====================TRANSFERENCIA=================");
        user01.transferencia.transaoOk();
        user01.transferencia.transacaoNaoOk();
        System.out.println("\n");

        System.out.println("================BÁSICO==========================" +
                "\n=====================SALDO======================");
        user02.saldo.transaoOk();
        user02.saldo.transacaoNaoOk();
        System.out.println("===================PAGAMENTOS DE SERVICOS===============");
        user02.servicos.transaoOk();
        user02.servicos.transacaoNaoOk();
        System.out.println("=====================SAQUES=================");
        user02.saques.transaoOk();
        user02.saques.transacaoNaoOk();
        System.out.println("\n");

        System.out.println("================COBRADORES==========================" +
                "\n=====================SAQUES======================");
        user03.saques.transaoOk();
        user03.saques.transacaoNaoOk();
        System.out.println("=====================SALDO=================");
        user03.saldo.transaoOk();
        user03.saldo.transacaoNaoOk();




    }
}
