package day2;

import java.util.Scanner;

class CuentaBancaria{
    private String titular;
    private String numeroCuenta;
    private long saldo;
    private long retiro;

    public void agregarSaldo (){
        System.out.println("Ingrese cantidad que desea añadir a la cuenta bancaria: ");
        System.out.print("$");
        Scanner agregar = new Scanner(System.in);
        saldo = agregar.nextLong();
        System.out.println("Usted agrego a la cuenta: $" + saldo);

    }
    public void retirarSaldo(){
        System.out.println("Ingrese la cantidad que desea retirar: ");
        System.out.print("$");
        Scanner retirar = new Scanner(System.in);
        retiro = retirar.nextLong();
        saldo = saldo - retiro;
        System.out.println("Ha retirado correctamente de su cuenta: " + retiro );
    }
    public void mostrarSaldo(){
        System.out.println("Su saldo actual es: " + saldo);
    }
}

class Cronometro{
    private long tiempoInicio;
    private long tiempoFin = 0;
    private boolean estaCorriendo;

    public void Iniciar() throws InterruptedException {
        for (tiempoInicio = 1000 ;tiempoInicio>= 0; tiempoInicio--){
            Thread.sleep(1000);
            mostrarTiempoTranscurrido();
        }
        estaCorriendo = true;
        System.out.println(estaCorriendo);
    }
    public void Detener(){
        if (tiempoInicio == tiempoFin){
            System.out.println("El conteo finalizo");
            estaCorriendo = false;
            System.out.println(estaCorriendo);
        }
    }
    private void mostrarTiempoTranscurrido() throws InterruptedException {
        for (tiempoFin = 0; tiempoFin < 1000; tiempoFin++) {
            Thread.sleep(1000);
            System.out.println(tiempoFin);
        }
    }
}
