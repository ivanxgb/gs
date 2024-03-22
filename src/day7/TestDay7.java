package day7;

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
}
