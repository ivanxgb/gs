package day2;

public class Day2 {

    public void day2() {
        System.out.println(multiplicarDos(6));
        System.out.println(saludar("Dan"));
        System.out.println(hello("Panda"));
        System.out.println(reloj(12));

        String[] nombres = {"Ivan", "Dan", "Pipe"};

        int[] horas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

//        for (String n : nombres) {
//            System.out.println(saludar(n));
//        }
//
//        for (int h: horas) {
//            System.out.println(reloj(h));
//        }

        Celular miCelular = new Celular("negro", 6.48);
        miCelular.enviarMsj(3238952055L);
        miCelular.verVideo("HOLA");
        miCelular.describeCelular();

        miCelular.owner = "Ivan";
    }


    /**
     * Función: acción a ejecutar en el código de forma modular
     * */
    // modificador de acceso - return type - nombre - parámetros recibidos - cuerpo
    public void funcionDummy(int arg1, String arg2, float arg3) {
        System.out.println("Entero duplicado es: " + arg1 * 2);
        System.out.println("Logitud de texto: " + arg2.length());
        System.out.println("El decimal es es: " + arg3);
    }

    private int multiplicarDos(int n1) {
        return n1 * 2;
    }

    private String saludar(String nombre) {
        return "hola " + nombre;
    }


    /**
     * Pipe: Función  que reciba un string y retorne la longitud del mismo diciendo "La palabra tiene N caracteres" donde N es el número de caracteres
     *
     *
     * Dan: Función que reciba un entero con la hora y retorne un string diciendo "La hora es H" donde H es la hora recibida
     *
     *
     * */

    // Pipe
    private String hello(String nombre) {
        return "La palabra tiene: " + nombre.length() + " caracteres";
    }


    // Dan
    private String reloj ( int hora) {
        return "La hora es: " + hora;
    }
}


class Celular {

    private String cellColor;
    private double cellSize;
    public String owner;

    public Celular(String color, double size) {
        this.cellColor = color;
        this.cellSize = size;
    }

    /**
     * En el constructor tú recibes TODA la información necesaria para poder crear el objeto.
     *
     * En el caso del celular, tú necesitas saber cuál es su tamaño y su color ANTES de crearlo. O sea, es información necesaria
     * para poder crearla.
     *
     * Al celular tú le puedes cambiar el dueño, pero no le puedes cambiar el tamaño.
     *
     * o sea, seria tipo funcion?
     * en el sentido de, con el contructor tu creas la cLASEa pero no obligatoriamente tienes que definirle
     * los atributos, sino, que se lo puedes definir en cualquier "momento"?
     *
     * // Ejemplo: Una casa
     * puedes definir atributos como el color en cualquier momento, pero NO puedes definir en otro momento con qué
     * material lo vas a construír.
     *
     * Constructor: Crea una casa de ladrillo rojo (lo defines cuando vas a construír) =
     * Atributo: Pinta la casa azul (lo defines y cambias en cualquier momento)
     *pero, entonces con el constructor lo defines enseguida, y no se podria modificar?
     * podrías con getter y setter (para la otra sesión), pero... A ver, digamos que en el constructor defines TODOS los
     * atributos que son necesarios para que el objeto funcione.
     *
     * Por eso los defines en el constructor, para que al momento de crear ese objeto ya tenga esos atributos "obligatorios" definidos.
     *
     *
     * Siguiendo el ejemplo de la casa, digamos que puedes tumbar la pared y levantarla con block en vez de ladrillo rojo. Puedes modificarlo después, pero
     * necesitas que definirlo desde que lo vas a construír.
     * aja, entonces, no se podria modificar. O sea, seria como la base de todo? sí, es eso, la base necesaria para poder crear (construír). De ahí
     * que su nombre sea `Constructor` y para asi poder usar el objeto? sí. No puedes usar una casa que no tiene cimientos.
     *
     * ya te queda claro? Nuevamente
     *
     * Constructor: información (atributos) necesarios desde el primer momento para poder usar el objeto
     * atributos normales: no necesarios y que puedes cambiar sobre la marcha
     *
     * en el **constructor** es que defines que tipo de material vas a usar..? sí
     * y en el objeto? cuando le pasas el "nombre" de esos atributos? no los estas dediniendo?
     *
     * cuando quieras y necesites. supón el color de la pintura, no lo defines enseguida y puedes tener una casa en obra gris.
     * contructor = MATERIALES
     * atributo = TIPO
     *
     *
     * Objeto: Instancia de la clase (la casa)
     * Constructor: Lo que necesitas para construir el objeto (material)
     * Atributos: las características del objeto (tipo de puerta, etc)
     *
     *
     ** miCasa.colorPintura = blanco
     * miCasa.colorPintura = negro
     * miCasa.colorPintura = rojo

     * */


    public void describeCelular() {
        System.out.println("El celular es de color " + this.cellColor);
        System.out.println("El celular mide " + this.cellSize + " pulgadas");
    }

    public void verVideo(String nombre) {
        System.out.println("Reproduciendo video " + nombre);
    }

    public void enviarMsj (long num) {
        System.out.println("Enviando mensaje... " + num);
    }
}
