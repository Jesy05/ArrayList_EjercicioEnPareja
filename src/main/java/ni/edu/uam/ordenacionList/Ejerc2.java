package ni.edu.uam.ordenacionList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejerc2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Sara");
        nombres.add("Fabiola");
        nombres.add("Adriana");
        nombres.add("Gabriela");
        nombres.add("Marian");

        System.out.println("Nombres originales: " + nombres);

        // Ordenamos alfabéticamente
        Collections.sort(nombres);

        System.out.println("Nombres ordenados (A-Z): " + nombres);
    }
}