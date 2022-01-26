package util;

public class GenerarAleatorios {

    private GenerarAleatorios(){}


    public static String generarNumeroCelular(){
        return String.valueOf( (long)Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
    }


}
