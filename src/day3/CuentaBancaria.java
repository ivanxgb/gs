package day3;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private long saldo;

    public CuentaBancaria(String titular, String numeroCuenta){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public void agregarSaldo(long saldoAIngresar){
        this.saldo = this.saldo + saldoAIngresar;
        System.out.println("Tu nuevo saldo es: " + this.saldo);
    }

    public void retirarSaldo(long saldoARetirar){
        long nuevoSaldo = this.saldo - saldoARetirar;

        if (nuevoSaldo >= 0) {
            this.saldo = nuevoSaldo;
            System.out.println("Tu nuevo saldo es: " + this.saldo);
        } else {
            System.out.println("Retiro no exitoso, monto a retirar supera el total");
        }
    }

    public void mostrarSaldo(){
        System.out.println("El saldo actual es: $" + this.saldo);
    }
}

