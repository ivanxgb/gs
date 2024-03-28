package day9;

import java.util.HashMap;
import java.util.HashSet;

public class Day9 {

    public static int[] sum2Elementos(int[] arr, int target) {

        /**
         * Recibes un listado de números y un número target.
         * Debes buscar en ese listado 2 números que sumados sean igual al target.
         *
         * Ejemplo:
         *
         * recibido: [15, 23, 69, 4, 20, 18]
         * target: 27
         *
         * return [23, 4]
         *
         * Restricción: No puedes usar un mismo número dos veces.
         * El array NUNCA va a tener dos elementos repetidos.
         *
         * Se espera complejidad O(N)
         * */

        HashSet<Integer> suma = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int diferencia = target - arr[i];

            if (suma.contains(diferencia)){
                return new  int[] {arr[i], diferencia};
            }

            suma.add(arr[i]);
        }

        return new int[] {};
    }

    public static int[] sum2ElementsIndex(int[] arr, int target) {
        /**
         * Recibes un listado de números y un número target.
         * Debes buscar en ese listado 2 números que sumados sean igual al target y
         * retornar el index de los 2 números.
         *
         * Ejemplo:
         *
         * recibido: [15, 23, 69, 4, 20, 18]
         * target: 27
         *
         * return [1, 3]
         *
         * Restricción: No puedes usar un mismo número dos veces.
         * El array NUNCA va a tener dos elementos repetidos.
         *
         * */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (target == arr[i] + arr[j]){
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }
    public static int[] sum2ElementsIndex2(int[] arr, int target) {
        /**
         * Recibes un listado de números y un número target.
         * Debes buscar en ese listado 2 números que sumados sean igual al target y
         * retornar el index de los 2 números.
         *
         * Ejemplo:
         *
         * recibido: [15, 23, 69, 4, 20, 18]
         * target: 27
         *
         * return [1, 3]
         *
         * Restricción: No puedes usar un mismo número dos veces.
         * El array NUNCA va a tener dos elementos repetidos.
         *
         * */

        HashMap<Integer, Integer> sum2Elementos = new HashMap();

        for (int i = 0; i < arr.length ; i++) {
            int diferencia = target - arr[i];

            // containsValue() => retorna true o false si un value existe
            // containsKey() => retorna true o false si una key existe
            // "sopa" : "queso" => "sopa" es key, "queso" value.

            // recibido: [15, 23, 69, 4, 20, 18]
            // target: 27
            // return [1, 3]

            if (sum2Elementos.containsKey(diferencia)){
                return new int[] {i , sum2Elementos.get(diferencia)};
            }

            sum2Elementos.put(arr[i], i);
        }


        return new int[] {};
    }



}
