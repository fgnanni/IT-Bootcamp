package br.com.mercadolivre.springpratica02.model;


import java.util.HashMap;

public class Morse {

    private static HashMap<String,String> codificadorMorse = new HashMap<>();



    public static String converterMorseParaAlfabetico(String morse){

        String[] letras;
        String frase = "";
        letras = morse.split(" ");
        getCodificadorMorse();


        for(int i = 0; i < letras.length; i++){

            frase += codificadorMorse.get(letras[i]);

        }

        return frase;
    }

    public static HashMap<String, String> getCodificadorMorse() {

        codificadorMorse.put(".-","A");
        codificadorMorse.put("-...","B");
        codificadorMorse.put("-.-.","C");
        codificadorMorse.put("-..","D");
        codificadorMorse.put(".","E");
        codificadorMorse.put("..-.","F");
        codificadorMorse.put("--.","G");
        codificadorMorse.put("....","H");
        codificadorMorse.put("..","I");
        codificadorMorse.put(".---","J");
        codificadorMorse.put("-.-","K");
        codificadorMorse.put(".-..","L");
        codificadorMorse.put("--","M");
        codificadorMorse.put("-.","N");
        codificadorMorse.put("---","O");
        codificadorMorse.put(".--.","P");
        codificadorMorse.put("--.-","Q");
        codificadorMorse.put(".-.","R");
        codificadorMorse.put("...","S");
        codificadorMorse.put("-","T");
        codificadorMorse.put("..-","U");
        codificadorMorse.put("...-","V");
        codificadorMorse.put(".--","W");
        codificadorMorse.put("-..-","X");
        codificadorMorse.put("-.--","Y");
        codificadorMorse.put("--..","Z");
        codificadorMorse.put(".----","1");
        codificadorMorse.put("..---","2");
        codificadorMorse.put("...--","3");
        codificadorMorse.put("....-","4");
        codificadorMorse.put(".....","5");
        codificadorMorse.put("-....","6");
        codificadorMorse.put("--...","7");
        codificadorMorse.put("---..","8");
        codificadorMorse.put("----.","9");
        codificadorMorse.put("-----","0");
        codificadorMorse.put("..--..","?");
        codificadorMorse.put("-.-.--","!");
        codificadorMorse.put(".-.-.-",".");
        codificadorMorse.put("--..--",",");
        codificadorMorse.put("/"," ");

        return codificadorMorse;
    }
}
