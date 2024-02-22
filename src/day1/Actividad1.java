package day1;
import java.util.Scanner;

public class Actividad1 {
    public static void actividad1() {

        double n1;
        double n2;

        System.out.println("Ingrese los valores");
        Scanner a = new Scanner(System.in);

        n1 = a.nextDouble();
        n2 = a.nextDouble();

        System.out.println("Los valores ingresados son: "+ n1 + " y "+ n2);

        double sumar = n1 + n2;
        double restar = n1 - n2;
        double multiplicaar = n1 * n2;
        double dividir = n1 / n2;

        System.out.println("Operaciones");
        System.out.println("--------------------------------------- ");
        System.out.println("La suma es: "+ sumar);
        System.out.println("La resta es: "+ restar);
        System.out.println("la multiplicacion es: "+ multiplicaar);
        System.out.println("La division es: "+ dividir);
        System.out.println("--------------------------------------- ");
        System.out.println("Conversion de temperatura farengeit a celsius");
        System.out.println("--------------------------------------- ");

        Conversion conversion = new Conversion();
        conversion.convertir();
        System.out.println("--------------------------------------- ");
        System.out.println("              Persona");
        System.out.println("--------------------------------------- ");
        Persona p = new Persona();

        p.nombrar();

        System.out.println("Tu nombre es: "+ p.nombre + " " + p.apellido);
    }
}


class Conversion{
    double c;
    double f;

    public Conversion() {
        this.c = c;
        this.f = f;
    }

    public void convertir(){
        Scanner grados = new Scanner(System.in);
        f = grados.nextDouble();
        System.out.println("La temperatura en grados Farengeit es: " + f);
        double c = (f - 32) * ((double) 5.0 / 9);
        System.out.println("La temperatura en grados celsius es: " + c);
    }
}

class Persona{
    String nombre;
    String apellido;
    public void nombrar(){
        System.out.println("Dame tu nombre: ");
        Scanner name = new Scanner(System.in);
        nombre = name.nextLine();
        System.out.println("Dame tu apellido: ");
        Scanner ap = new Scanner(System.in);
        apellido = ap.nextLine();
    }
}
