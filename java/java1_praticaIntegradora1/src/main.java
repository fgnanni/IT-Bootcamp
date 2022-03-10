public class main {

    public static void main(String[] args) {

        String[] citys = {"Londres", "Madrid","Nueva York", "Buenos Aires", "Asuncíon", "São Paulo", "Lima","Santiago de Chile", "Lisboa","Tokyo"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int minTemp = 0;
        int maxTemp = 0;

        String cityMinTemp = null;
        String cityMaxTemp = null;


        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (temperaturas[i][j] < minTemp) {
                    minTemp = temperaturas[i][j];
                    cityMinTemp = citys[i];
                } else if (temperaturas[i][j] > maxTemp){
                    maxTemp = temperaturas[i][j];
                    cityMaxTemp = citys[i];
                }

            }
        }

        System.out.println(cityMinTemp + " registra a menor temperatura chegando a " + minTemp + "C.");
        System.out.println(cityMaxTemp + " registra a maior temperatura chegando a " + maxTemp + "C.");
    }
}
