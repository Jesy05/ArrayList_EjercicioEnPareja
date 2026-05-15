package ni.edu.uam.listasEnlazadas;

import java.util.LinkedList;

public class Ejer2 {
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Jesy");
        nombres.add("Marian");

        nombres.addFirst("Carlos");

        nombres.addLast("Gabriela");

        System.out.println("Lista de nombres organizada:");
        System.out.println(nombres);
    }
}