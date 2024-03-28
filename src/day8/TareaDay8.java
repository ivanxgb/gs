package day8;

import java.util.HashSet;

public class TareaDay8 {

    public static boolean obtenerNumRepetido(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }

                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        // O(1) S
        // O(N^2) T

        return false;
    }

    public static boolean obtenerNumRepetido2(int[] arr) {
        HashSet<Integer> numSet = new HashSet<>();  // O(1)

        for (int i = 0; i < arr.length; i++) { // O(N)
            if (numSet.contains(arr[i])){ // O(1)
                return true;
            }

            numSet.add(arr[i]);
        }

        // O(N) T
        // O(N) S
        // O(N) ST

        return false;
    }
}
