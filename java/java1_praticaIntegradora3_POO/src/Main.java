public class Main {

    public static void main(String[] args) {

        Pessoa pessoaSemParametro = new Pessoa();
        Pessoa pessoaComTresParametros = new Pessoa("1", "Flávio", 21);
        Pessoa pessoaComTodosOsParametros = new Pessoa("1", "Elisa", 23, 55.8, 1.65);

        //Pessoa pessoaComDoisParametros = new Pessoa("Erraldo", 32);

        pessoaComTodosOsParametros.calculateBMI();
        System.out.println(pessoaComTodosOsParametros.toString());

        if (pessoaComTodosOsParametros.isLegalAge()) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }

        switch (pessoaComTodosOsParametros.calculateBMI()){

            case -1:
                System.out.println("Esta abaixo do peso");
                break;

            case 0:
                System.out.println("Possui Peso Saudável");
                break;

            case 1:
                System.out.println("Esta Sobrepeso");
                break;
        }

    }
}
