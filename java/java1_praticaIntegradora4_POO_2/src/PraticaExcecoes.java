public class PraticaExcecoes {

    static int a = 0, b = 300;

    public static void divisionError() {

        try {
            System.out.println(b / a);

        } catch (ArithmeticException error) {
            throw new ArithmeticException("Ocorreu um erro");

        } finally {
            System.out.println("Programa finalizado.");

        }

    }

}
