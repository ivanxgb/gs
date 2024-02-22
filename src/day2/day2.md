
## Tarea

1. **Cuenta Bancaria**: Diseña una clase `CuentaBancaria` que tenga atributos para el nombre del titular, el número de cuenta y el saldo. Incluye métodos para depositar y retirar dinero, además de un constructor para inicializar el titular y el número de cuenta (el saldo puede iniciar en cero).

2. **Cronómetro**: Desarrollar una clase `Cronometro` que simule el funcionamiento básico de un cronómetro, iniciar, detener, y mostrar el tiempo transcurrido.
   
   - Atributos:
     - `long tiempoInicio` 
     - `long tiempoFin`
     - `boolean estaCorriendo`
     
   - Constructor:
   No necesitas parámetros para el constructor. Solo inicializa `tiempoInicio` y `tiempoFin` en **0** y `estaCorriendo` en `false`.
   
   - Métodos:
     - `public iniciar()`: Guarda el tiempo actual en `tiempoInicio` y establece `estaCorriendo` a `true`. 
     Si el cronómetro ya está corriendo, este método puede mostrar un mensaje indicando que ya se ha iniciado.
     
     - `public detener()`: Guarda el tiempo actual en `tiempoFin` y establece `estaCorriendo` a `false`. 
       Llama al método privado `mostrarTiempoTranscurrido` e imprime el tiempo. Si el cronómetro no está corriendo, indica que debe iniciarse primero.
     
     - `private mostrarTiempoTranscurrido()`: Muestra el tiempo transcurrido desde que el cronómetro se inició hasta que se detuvo, o el tiempo actual si aún está corriendo.

  Para obtener el tiempo actual usa la función interna de java `System.currentTimeMillis();` la cual devuelve el tiempo en milisegundos. NO es necesaria su conversión a segundos/minutos/etc


# Funciones, Clases

## Funciones

- Modificador de acceso: => **public**, **private**, **protected** 

- Tipo de dato de retorno: => *primitives*, *no primitives**

  - `void` => que la función no retorna nada. 
  - `Float`, `Double`: => Retorna decimales
  - `Persona` => objeto del tipo `Persona`

- nombre: nombre de la función 
- parámetros recibidos: recibes *primitives* y *no primitives*
- cuerpo de la función: Todo lo que está dentro del BLOQUE de la función, o sea, todo dentro de `{}`


```java

public void saludar() {
    System.out.println("Hola mundo");
}

public void saludar2(String nombre){
    System.out.println("Hola " + nombre);
}

public float suma (int num){
    return num;
}

```

## Clases 


Es un plano o una plantilla que define las características (*atributos*) y el comportamiento (*métodos*) de un elemento.

- **Atributos** => Caracteríscticas: Descripción (adjetivos) de un elemento. Ejemplo: Color de un celular
- **Métodos** => Comportamiento: Lo que puede hacer. Ejemplo: Un celular puede TOMAR FOTOS.

## Sintaxis

- Modificador de Acceso: `public`, `private`, `protected`. 
- Definición: palabra reservada `class` + Nombre
- Atributos: Modificador de acceso + Tipo de Dato + nombre 
- Constructor: modificador de acceso + Clase + Argumentos recibidos => 
- Métodos: modificador de acceso + tipo de dato de retorno + nombre del metodo + parametros recibidos + cuerpo 

```java 

public class Celular() {
    
    private String cellColor;
    private double cellSize;
    
    public Celular(String color, double size) {
        this.cellColor = color;
        this.cellSize = size;
    }
    
    public void verVideo(String nombre) {
        System.out.println("Reproduciendo video " + nombre);
    }
    
    public void enviarMsj (int num) {
        System.out.println("Enviando mensaje... " + num);
    }
}
```

### Objetos
A la instancia creada de una clase se le llama `objeto`. Podemos crear un nuevo objeto de la siguiente forma:

- Nombre de la clase: `Celular`
- Nombre de la variable (nombre del objeto): `miCelular`
- Instancia de la clase: palabra reservada `new` + Instancia de la clase

```java

Celular miCelular = new Celular();
```


# Bonus

## Encapsulamiento (Modificadores de Acceso)
El encapsulamiento es como poner una cerca alrededor de los datos y funciones de una clase para controlar quién puede acceder o modificarlos. Usamos public, private, y protected para manejar este acceso:

- public hace que todos puedan ver y usar esa parte de tu clase.
- private es como tener algo solo para ti, nadie más fuera de tu clase puede acceder a ello.
- protected es un punto intermedio, donde tú y tus "clases hijas" pueden acceder a ello, pero otros no.


Este concepto ayuda a:

Mantener en secreto cómo funciona algo por dentro, mostrando solo lo necesario. Esto hace todo menos complicado y más seguro.
Asegurar que solo se puedan hacer cambios en tus datos de formas que tú has previsto, evitando errores.
Hacer tu código más fácil de manejar y actualizar, ya que cambios internos no afectan a quienes usan tu clase.
En resumen, el encapsulamiento ayuda a mantener tu código ordenado, seguro y fácil de manejar.

## Importancia de los Parámetros en Métodos y Constructores

Los parámetros en métodos y constructores son esenciales para la flexibilidad y reutilización del 
código en Java. Permiten que los métodos y constructores reciban datos externos o configuraciones en 
el momento de la invocación o la creación de un objeto, respectivamente.


- **Métodos**:

Cuando hablamos de métodos, los parámetros te permiten reutilizar la misma función para diferentes datos sin tener que escribirla de nuevo. 

Por ejemplo, un método para sumar dos números puede recibir esos números como parámetros y devolver su suma.

```java
public int sumar(int num1, int num2) {
    return num1 + num2;
}
```


- **Constructores**

En el caso de los constructores, los parámetros te permiten crear objetos a medida, 
cada uno con su propia configuración desde el inicio. Esto es útil porque puedes crearse muchos objetos de la misma clase, 
pero cada uno con su propia personalidad desde el momento en que nace. Piensa en crear diferentes libros, cada uno con su propio título y autor:


```java
public class Libro {
  private String titulo;
  private String autor;

  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }
}
```


## Constructores vs Atributos
Imagina que estás armando un robot. 

El **constructor** de tu robot es como la lista de cosas esenciales que 
necesitas desde el principio para que el robot pueda siquiera existir. Es decir, cosas como el motor, el esqueleto, y el sistema operativo básico. Sin estas partes, tu robot no es un robot; es solo un montón de piezas sueltas.

Ahora, los **atributos** son como las características personalizables de tu robot que puedes cambiar, mejorar o añadir más tarde. Por ejemplo, el color de la pintura, si lleva sombrero o no, o qué tipo de herramientas puede sostener en sus manos. Estas son cosas que puedes decidir y cambiar en cualquier momento después de que el robot ya está "vivo".

Entonces, en resumen:

- Constructor: Es como decir, "Para que este robot empiece a funcionar, NECESITO estas cosas específicas desde el inicio". No hay vuelta atrás; una vez que el robot está construido con esas partes, esas son sus bases. Aunque, claro, siempre puedes hacerle upgrades o cambios significativos, pero el esfuerzo es mayor, como reemplazar completamente el motor por uno mejor.

- Atributos: Son más flexibles. Después de construir tu robot, puedes pensar, "Hmm, creo que se vería genial en azul", y simplemente pintarlo de nuevo. O decidir que ahora quieres que pueda sostener una taza de café y añadirle esa función. Son cambios y adiciones que no afectan el funcionamiento básico del robot, pero sí cómo lo usas o cómo se ve.
