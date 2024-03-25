import day1.Actividad1;
import day1.Day1;
import day2.Day2;
import day3.Cronometro;
import day3.CuentaBancaria;
import day3.Day3;
import day4.Day4;
import day4.ListaCompra;
import day4.Producto;
import day5.day5;
import day7.Day7;
import day7.TestDay7;

public class Main {
    public static void main(String[] args) {

//                Day1.day1();
//        Actividad1.actividad1();

//        Day2 day2 = new Day2();
//        day2.day2();

//        CuentaBancaria cuentaBancaria = new CuentaBancaria("Ivan","1234");
//        cuentaBancaria.mostrarSaldo();
//        cuentaBancaria.agregarSaldo(3000);
//        cuentaBancaria.retirarSaldo(6000);
//        cuentaBancaria.retirarSaldo(1000);
//        cuentaBancaria.agregarSaldo(7000);


//        Cronometro cronometro = new Cronometro();
//        cronometro.iniciar();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        cronometro.detener();


//        Day3.loops();

//        Day4.learningArray();
//        Day4.learningArrayList();

//        Main.probandoListas();

//        day5.funcionSuma(100);

//        day5.arrayDeArrays();


        TestDay7.lowerAndHigher();
    }


    public static void probandoListas() {
        Producto producto1 = new Producto("Camisa", 2000);
        Producto producto2 = new Producto("Zapatillas", 5000);
        Producto producto3 = new Producto("Celular", 1000);
        Producto producto4 = new Producto("Computador", 2500);
        Producto producto5 = new Producto("Televisor", 3000);
        Producto producto6 = new Producto("Pantalón", 3000);
        Producto producto7 = new Producto("Auriculares", 8000);
        Producto producto8 = new Producto("Libro", 5000);

        ListaCompra miLista = new ListaCompra();

        miLista.agregar(producto1);
        miLista.agregar(producto2);
        miLista.agregar(producto3);
        miLista.agregar(producto4);
        miLista.agregar(producto5);
        miLista.agregar(producto6);
        miLista.agregar(producto7);
        miLista.agregar(producto8);

        miLista.calcularPrecioTotal();

        miLista.eliminar(producto2);
        miLista.eliminar(producto2);
        miLista.eliminar(producto7);

        miLista.calcularPrecioTotal();
    }
}


