package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestDay7 {

    public static void test2Sum() {

        int[] arr1 = {27, 16, 10, 23, 41, 74, 3};

        System.out.println("Target: 37 = " + Arrays.equals(Day7.sum2Elementos(arr1, 37), new int[]{27, 10}));
        System.out.println("Target: 115 = " + Arrays.equals(Day7.sum2Elementos(arr1, 115), new int[]{41, 74}));
        System.out.println("Target: 30 = " + Arrays.equals(Day7.sum2Elementos(arr1, 30), new int[]{27, 3}));
    }

    public static void testCristalBall() {
        for (int i = 0; i < 40; i++) {
            System.out.println("Prueba " + (i + 1));
            TestDay7.cristallBall();
            System.out.println();
        }
    }

    private static void cristallBall() {
        int pisoSize = new Random().nextInt(100);

        Boolean[] pisos = new Boolean[pisoSize];

        int pisoDesdeDondeSeParte = new Random().nextInt(pisoSize);

        for (int i = 0; i < pisos.length; i++) {
            pisos[i] = i >= pisoDesdeDondeSeParte;
        }

        System.out.println("Piso dado: " + pisoDesdeDondeSeParte + "\n" + "Piso encontrado: " + Day7.cristalBall(pisos));
    }

    public static void test2MergeArray() {
        int[] arr = {2, 34, 55, 13, 44};
        int[] arr2 = {5, 3, 5, 3, 4};

        ArrayList<Integer> merged = PracticaArray.retornoLista(arr, arr2);

        System.out.println("Size of arr + arr2: " + (arr.length + arr2.length));
        System.out.println("Size of new list: " + merged.size());
    }

    public static void lowerAndHigher() {
        int[] arr = {29, 30, -1, -123991, 184838, 77889};

        int[] response = PracticaArray.obtenerMenorYMayor(arr);

        System.out.println("Menor es -123991?: " + (response[0] == -123991));
        System.out.println("Mayor es 184838?: " + (response[1] == 184838));

    }

}
