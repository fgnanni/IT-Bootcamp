package br.com.mercadolivre.springpratica01;

public class NumeroRomano {

    private static String[] numerosRomanos = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    private static int[] numerosDecimais = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    public static String converterDecimalParaRomano(int decimal){

        String scratch = "";
        String result ="";

        for(int i = 12; i >= 0; i--){

            while (decimal >= numerosDecimais[i]){

                decimal -=  numerosDecimais[i];
                scratch += numerosRomanos[i];

            }
            result = scratch;
        }


        return result;
    }

}
