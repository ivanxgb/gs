package day4;

import java.util.ArrayList;

public class Day4 {

    public static void learningArray() {

        int[] array = new int[7];

        // Al elemento en posición `3` le asignamos el valor de 25
        array[3] = 25;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion " + i + " Antes de Reasignar : " + array[i]);
            array[i] = 10;
            System.out.println("Posicion "+ i +" Después de Reasignar : " + array[i]);
        }

    }

    public static void learningArrayList() {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Bquilla");
        ciudades.add("Bogota");
        ciudades.add("Medellin");

        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("ciudad en posicion " + i + ": es " + ciudades.get(i));
        }

        System.out.println("Antes de eliminar: " + ciudades.get(2));

        ciudades.remove(2);

        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println(ciudades.get(i));
        }

    }
}
