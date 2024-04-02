package day9;
import java.util.HashMap;

public class TareaDia9 {

    public static int romanoAInteger(String s){
        int conversionRtoInt = 0;

        HashMap<Character, Integer> romano = new HashMap<>();
        romano.put('I', 1);
        romano.put('V', 5);
        romano.put('X', 10);
        romano.put('L', 50);
        romano.put('C', 100);
        romano.put('D', 500);
        romano.put('M', 1000);

        for (int i = 0; i < s.length(); i++) { // Usamos un for para iterar sobre los caracteres del string romano
            int valorActual = romano.get(s.charAt(i));

            if (i + 1 < s.length() && valorActual < romano.get(s.charAt(i + 1)) ) {
                conversionRtoInt -= valorActual;
            } else {
                conversionRtoInt += valorActual;
            }
        }

        return conversionRtoInt;
    }

    public static int arrToInt(int[] arr) {

        /**
         * Arr To Int es un método que recibe un array de enteros compuestos de números de un solo dígito.
         * Debes unirlos y retornar el valor equivalente
         *
         *
         * Ejemplo:
         *
         * input: [3, 2, 9]
         * output: 329
         *
         * input: [4, 1, 4]
         * output: 414
         *
         *
         * input: [3, 2, 5, 6, 2]
         * output: 30 + 2 => 32 => 320 + 5 => 325 => 3250 + 6 => 3256 => 32560 + 2 => 32562
         *
         *
         * 1. Sumar al acumulador
         * 2. Incrementar el acumulador x10.
         * 3. Repetir
         *
         * */

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sum *= 10;
        }

        sum /= 10;

        System.out.println(sum);
        return sum;
    }

    /**
     *
     * Escribir un programa que muestre en pantalla los números del 1 al 100,
     * sustituyendo los múltiplos de 3 por la palabra “fizz”, los múltiplos de 5 por “buzz” y los múltiplos de ambos,
     * es decir, los múltiplos de 3 y 5 (o de 15), por la palabra “fizzbuzz”.
     * */

    /*
    * 1
    * 2
    * fizz
    * 4
    * buzz
    * fizz
    * 7
    * 8
    * fizz
    * buzz
    * 11
    * f
    * 13
    * 14
    * fizzbuzz
    *
    **/

}
