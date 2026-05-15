package ni.edu.uam.listasEnlazadas;

import java.util.LinkedList;

public class Ejer3 {
    public static void main(String[] args) {
        LinkedList<String> productos = new LinkedList<>();

        productos.add("Laptop");
        productos.add("Mouse Inalámbrico");
        productos.add("Teclado Mecánico");
        productos.add("Monitor Gamer");

        System.out.println("Inventario inicial: " + productos);

        productos.remove("Mouse Inalámbrico");

        System.out.println("Inventario actualizado: " + productos);
        System.out.println("Total de productos: " + productos.size());
    }
}