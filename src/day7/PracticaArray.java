package day7;

import java.util.ArrayList;

public class PracticaArray {

    /**
     * Crear una función que reciba 2 arrays de enteros y retorne una
     * nueva lista con los dos arrays unidos.
     *
     *
     * Ejemplo:
     *
     * Recibes
     * [1, 2, 3, 4, 5]
     * [6, 7, 8, 9]
     *
     * Retorna
     * [1, 2, 3, 4, 5, 6, 7, 8, 9]
     *
     * */

    public static ArrayList<Integer> retornoLista (int[] arr1, int[] arr2) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            lista.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            lista.add(arr2[i]);
        }

        return lista;
    }


    /**
     * Crea una función que reciba un array de enteros y retorne un array con 2 elementos.
     * En primera posición va a estar el menor de los números del array, en segunda posición el mayor
     *
     * */
    public static int[] obtenerMenorYMayor(int[] array) {
        // [3, 2, 6, 8, 9]

        int menor = array[0];
        int mayor = array[0];
        int[] lista = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor){
                menor = array[i];
            }
            if (array[i] > mayor){
                mayor = array[i];
            }
        }
        lista[0] = menor;
        lista[1] = mayor;

        return lista;
    }

    /**
     *
     * Crea una función que reciba un array de enteros y verifique si hay elementos repetidos.
     * Si los hay, retorna true. Si no, retorna false.
     *
     * Ej:
     * [1, 2, 3, 2, 6] ==> true
     * [1, 2, 3, 4, 5, 6] ==> false
     *
     * */

}
