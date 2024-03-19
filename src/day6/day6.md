# Big O Notation

## Algoritmo

Un algoritmo es una serie de pasos (o procedimientos) usados para
resolver un problema.

En programación, es una serie de pasos efectuadas en código que permite resolver un
problema.

## Complejidad Algorítmica

Es una medida que nos indica la eficiencia de una solución de código.
La eficiencia es la medida de **TIEMPO** y **ESPACIO** (memoria) que un código requiere
para producir una solución. 

El *tiempo* lo medimos en función de la cantidad de **operaciones** que requiere para ejecutarse.

El *espacio* lo medimos en función del input (**N**)


```java
function imprimirElementos(int[] arr) {
    for(i = 0; i < N; i++) {
        print(arr[i]);
    }
}

O(N); -> Complejidad Temporal
O(1); -> Complejidad Espacial
```


- O(1)
- O(log N)
- O(N)
- O(N log N)
- O(N^2)
- O(2^N)
- O(N!)

### O(1) Ejecución Constante

```java
function holaMundo() {
    print("Hola");
}
O(1) -> Complejidad Temporal
O(1) -> Complejidad Espacial

O(1) ST
```


```java
function holaHermanos() {
    print("Hola Pipe");
    print("Hola Dan");
    print("Hola Ivan");
}

O(3) -> O(1)
```

### O(log N)

`log(100000) = 5`

Si bien la entrada N es un número grande, la cantidad de operaciones que ejecuta 
es logarítmica, haciendo que sean pocas las operaciones comparadas a la entrada.


### O(N)

Las operaciones realizadas es proporcional a la cantidad de datos entrantes.

```java
function sumaArray(int[] arr) {
    int suma = 0; // 1
    for(int i = 0; i < arr.length; i++) {
        suma += arr[i]; // N
    }
    
    return suma;
}

O(1 + N) => Eliminamos la constante (1) => O(N)
```

```java
function multiplicaSuma(int[] arr1, int[] arr2) {
    int suma1 = 0; // 1
    for(int i = 0; i < arr1.length; i++) {
        suma1 += arr[i]; // N
    }

    int suma2 = 0; // 1
    for(int i = 0; i < arr2.length; i++) {
        suma2 += arr[i]; // M
    }
    
    return suma1 * suma2; // 1
}

O(1 + N + 1 + M + 1) => O(3 + N + M) 
Eliminamos Constantes

O(N + M)
```

### O(N logN)

O(N logN) es el resultado de N operaciones que multiplica a logN.
N = 1000;

O(N logN) => 1000000 log(100.000) => 500.000


### O(N^2) -> Operaciones cuadráticas

Es cuadrático cuando la cantidad de operaciones es el cuadrado del input (N);

```java

function sumaYMulti(int[] arr) {
    int suma = 0; // 1
    for(int i = 0; i < arr.length; i++) {
        suma += arr[i]; // N
        
        for(int j = 0; j < arr.length; j++) {
            suma += arr[i] * arr[j]; // N^2
        }
    }
}

O(1 + N + N^2) => Eliminamos constantes => 
O(N + N^2) => Toma el peor
O(N^2)
```

### O(2^N) 

La cantidad de operaciones ejecutadas es 2 con potencia N.

N = 10;

2 ^ 10 => 1024


### O(N!) -> N Factorial

Una operación factorial es la multiplicación de todos los números desde N hasta 1.

5! => 5 * 4 * 3 * 2 * 1

N = 10;

10! = 3.628.800;



<img src="https://www.europeanvalley.es/noticias/wp-content/uploads/2022/12/51957970066_dd5fd167f6_c.jpeg">
