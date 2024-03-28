package day9;

import java.util.Arrays;

public class TestDay9 {

    public static void test2Sum() {
        int[] arr1 = {27, 16, 10, 23, 41, 74, 3};

        System.out.println("Target: 37 = " + Arrays.equals(Day9.sum2Elementos(arr1, 37), new int[]{10, 27}));
        System.out.println("Target: 115 = " + Arrays.equals(Day9.sum2Elementos(arr1, 115), new int[]{74, 41}));
        System.out.println("Target: 30 = " + Arrays.equals(Day9.sum2Elementos(arr1, 30), new int[]{3, 27}));
    }

}
