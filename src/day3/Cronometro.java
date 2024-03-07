package day3;

public class Cronometro {
    private long inicio;

    public void iniciar() {
        this.inicio = System.currentTimeMillis();
        System.out.println("Se ha iniciado el cronometro");

    }

    public void detener() {
        long fin = System.currentTimeMillis();
        long transcurrido = (fin - this.inicio) / 1000;
        System.out.println("El tiempo transcurrido es: " + transcurrido);

    }

}
