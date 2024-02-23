# Control de flujos (Condicionales) y Bucles 

El control de flujo es una parte fundamental de la programación que permite controlar el orden
en que se ejecutan las instrucciones de un programa. En Java, existen diferentes estructuras de
control de flujo que permiten tomar decisiones y ejecutar diferentes acciones en función de
diferentes condiciones.

## Condicionales

Las estructuras condicionales permiten ejecutar diferentes bloques de código en función del
valor de una expresión booleana. Las estructuras condicionales más comunes son:

### If - `if`

La sentencia `if` permite ejecutar un bloque de código si una condición específica es verdadera. 
Puedes ampliar esto con `else` para ejecutar un bloque diferente si la condición es falsa.

```java
if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```


### Switch - `switch`

Permite ejecutar un bloque de código en función del valor de una variable. Dicho de otra forma,
te permite elegir entre diferentes opciones, como en un menú.

```java
int dia = 1;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Día no válido");
}
```


## Bucles (For, While, Do While, For Each)

Los bucles permiten ejecutar un bloque de código repetidamente bajo ciertas condiciones, 
lo que es útil para tareas como iterar sobre arrays o colecciones, o ejecutar una tarea 
hasta que se cumpla una condición.

### For - `for`

Ideal para cuando sabes cuántas veces quieres que se ejecute el bucle. Puedes iterar sobre 
rangos de valores o directamente sobre elementos de una colección.

Sintaxis:

- Inicialización de variable iteradora: `int idx = 0;`
- Condición: `idx <= 10;`
- Incremento: `idx = idx + 1` o `idx++` 

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i + "¡Otra vez!");
}
// for que aumenta su valor en uno.
```
```java
for (int i = 100; i >= 0; i = i - 2) {
    System.out.println(i + "¡Otra vez!");
}
// for que reduce su valor de 2 en 2
```

### While - `while`

Ejecuta un bloque de código mientras una condición específica sea verdadera. Es útil cuando 
no sabes cuántas veces necesitarás iterar.

```java
int i = 0;
while (i < 10) {
    System.out.println(i + "¡Aún no llegamos a 10!");
    i++;
}
```

### Do While -`do ... while`

Similar al `while`, pero este bucle garantiza que el bloque de código se ejecute al menos una vez, 
y luego continúa la ejecución mientras la condición sea verdadera.

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
```


### For-Each - `for-each`

Se utiliza para recorrer un conjunto de datos y ejecutar un bloque de código para cada elemento
del conjunto.

```java
String[] nombres = {"Juan", "María", "Pedro"};
for (String nombre : nombres) {
    System.out.println(nombre);
}
```
