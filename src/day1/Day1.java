package day1;

public class Day1 {

    public static void day1() {
        byte edad = 18;
        // byte edad2 = 128; --> Errpr, 128 superior a 127 (valor máximo)
        int conteoDeVistas = 123_456_789;
        long conteoDeVistas2 = 3_123_456_789L;
        float decimal = 23.6F;
        double decimal1 = 23.6F;


        long d = 3123456789L;
        double dComoInt = d;
        char lola = 'á';
        boolean c = true;
        boolean v = false;

        System.out.println("Long: " + d);
        System.out.println("Nuevo Int: " + dComoInt);



        // No primitivos

        // Array

        int[] arr = {25, 6, 27};

        System.out.println("Pos 1 antes: " + arr[1]);

        arr[1] = 2004;

        System.out.println("Pos 1 después: " + arr[1]);
        System.out.println(arr[2]);


        String hi = "hola";  // ['h', 'o', 'l', 'a']
        System.out.println(hi.charAt(2));
        System.out.println(hi);

        hi = "aloh";
        System.out.println(hi.charAt(2));
        System.out.println(hi);
        System.out.println(hi.length());
        String hi2 = hi.toUpperCase();
        System.out.println(hi2);


        String hi3 = hi + " " + hi2;
        String hi3_2 = hi.concat(" " + hi2);

        System.out.println(hi3);
        System.out.println(hi3_2);
    }
}
