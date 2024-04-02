package day9;

import java.util.Arrays;

public class TestDay9 {

    public static void test2Sum() {
        int[] arr1 = {27, 16, 10, 23, 41, 74, 3};

        System.out.println("Target: 37 = " + Arrays.equals(Day9.sum2Elementos(arr1, 37), new int[]{10, 27}));
        System.out.println("Target: 115 = " + Arrays.equals(Day9.sum2Elementos(arr1, 115), new int[]{74, 41}));
        System.out.println("Target: 30 = " + Arrays.equals(Day9.sum2Elementos(arr1, 30), new int[]{3, 27}));
    }

    public static void testRomanToInt() {
        int MCMXCIV = TareaDia9.romanoAInteger("MCMXCIV");
        int LVIII = TareaDia9.romanoAInteger("LVIII");
        int III = TareaDia9.romanoAInteger("III");

        System.out.println("MCMXCIV es 1994? " + (MCMXCIV == 1994));
        System.out.println("LVIII es 58? " + (LVIII == 58));
        System.out.println("III es 3? " + (III == 3));
    }

    public static void testArrToInt() {
        int[] arr1 = new int[] {4, 1, 4};
        int[] arr2 = new int[] {1, 3, 2};

        System.out.println("arr1 is 414?" + (TareaDia9.arrToInt(arr1) == 414));
        System.out.println("arr2 is 132?" + (TareaDia9.arrToInt(arr2) == 132));
    }

}
