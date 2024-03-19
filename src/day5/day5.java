package day5;

public class day5 {

    public static void arrayDeArrays() {
        int[] A = {3, 15, 23};
        int[] B = {5, 32, 60};
        int[] C = {4, 20, 69};

        int[][] arrayPrincipal = {A, B, C };


//        for (int i = 0 ; i < arrayPrincipal.length; i++) {
//            System.out.println("Array " + (i + 1));
//
//            for (int d = 0; d < arrayPrincipal[i].length; d++) {
//                System.out.println(arrayPrincipal[i][d]);
//            }
//        }

//        int suma = 0;
//
//        for (int i = 0; i < arrayPrincipal.length ; i++) {
//            int suma2 = 0;
//            for (int j = 0; j < arrayPrincipal[i].length; j++) {
//                int elementoActual = arrayPrincipal[i][j];
//                suma = suma + elementoActual;
//                suma2 = suma2 + elementoActual;
//            }
//            System.out.println(suma2);
//
//        }
//        System.out.println(suma);

        int suma = 0;

//        for (int i = 0; i < A.length ; i++) {
//
//            for (int j = 0; j < A.length ; j++) {
//                suma += A[i] * A[j];
//            }
//
//        }

        for (int i = 0; i < A.length ; i++) {
            suma += A[i];
        }

        suma *= suma;
        System.out.println(suma);


    }

    public static int funcionSuma(int num) {
        int suma = 0;
        for (int i = 0; i < num; i++){
            suma +=i;
        }
        System.out.println(suma);
        return suma;
    }
}
