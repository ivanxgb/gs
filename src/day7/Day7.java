package day7;

public class Day7 {

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
         * */

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (i == j) {
                    continue;
                }

                if (target == arr[i] + arr[j]){
                    return new int[] {arr[i], arr[j]};
                }
            }
        }

        /**
         * Complejidad:
         *
         * O(N^2) T
         * O(N) S
         * */


        return new int[] {-1, -1};
    }

    public static int cristalBall(Boolean[] arr) {

       /**
        * Recibes un edificio cuyos pisos están expresados como un array booleano.
        * A partir de cierto piso una bola de cristal se parte, debes devolver cual es el primer piso desde donde se
        * parte
        *
        * */


       // (int) castea un valor a entero (Integer). Math.floor redondea un elemento hacia abajo (5.9 -> 5.0).
       // Math.sqrt calcula la raiz cuadrada (square root)
       int salto = (int) Math.floor(Math.sqrt(arr.length));
       int pisoMaximo = 0;

        for (int i = 0; i < arr.length ; i+=salto) {
            if (arr[i] == true){
                pisoMaximo = i;
                break;
            }

        }

        int pisoDesde = pisoMaximo - salto;
        if (pisoDesde < 0) {
            pisoDesde = 0;

        }

        // System.out.println("Pisos " + arr.length);
        // System.out.println("Salto " + salto);
        // System.out.println("PisoDesde " + pisoDesde);
        // System.out.println("PisoMax " + pisoMaximo);

        for (int i = pisoDesde; i <= pisoMaximo ; i++) {
            if (arr[i] == true) {
                return i;
            }
        }

       return -1;
    }

}
