package day3;

public class Day3 {

    public static void testingConditionals(int age) {
        if (age >= 25) {
            System.out.println("Puede manejar.");
        } else {
            int edadFaltante = 25 - age;
            System.out.println("Te faltan" + edadFaltante + " años para manejar");
        }
    }

    public static void dayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia no valido");
        }

    }

    public static void loops() {
        // i++ -> i = i + 1 -> i += 1

        /*
        *
        * 4 / 2
        *
        * */

//        for (int i = 10; i <= 130; i += 3) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 130; i >= 10; i -= 3) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla);

            for (int i = 1; i <= 10; i++) {
               System.out.println(tabla + " * " + i + " = " + tabla * i);
            }

        }
    }
}
