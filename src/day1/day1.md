# Día 1. Primitive Types (Tipos Primitivos) y No Primitives

## Ejercicio / Tarea


1. Crear un programa que pida al usuario dos números Double y realice las operaciones básicas (suma, resta, multiplicación, división)

2. Escribir un programa que convierta grados Fahrenheit a Celsius. La fórmula es: C = (F - 32) * 5/9 -> Double
 
3. Escribir un programa que pida al usuario nombre y apellido por separado, luego concatenarlos en un único String con espacio en medio 
y mostrar el nombre completo y su longitud en consola.



## Sintaxis de una variable

*type* *name* *=* *value*

`byte edad = 18`


## Primitives
Tipos de datos construídos en el núcleo (core) de Java como lenguaje. 

Byte: conjunto de 8 bits. Valor máximo: 256


| 1     | 1   | 1   | 1   | 1   | 1   | 1   | 1   |
|-------|-----|-----|-----|-----|-----|-----|-----|
| 2 ^ 1 | 2^2 | 2^3 | 2^4 | 2^5 | 2^6 | 2^7 | 2^8 |
| 2     | 4   | 8   | 16  | 32  | 64  | 128 | 256 |


 
| Type   | Bytes | Range                                       |
|--------|-------|---------------------------------------------|
| byte   | 1     | [-128, 127] [-2^7, 2^7 -1]                  |
| short  | 2     | [-32k, 32k]                                 |
| int    | 4     | [-2B, 2B] ==> 7553245 == 7_553_245          |
| long   | 8     | [-2^63, 2^63 -1] ==> 7553245L == 7_553_245L |
| float  | 4     | 1.63F                                       |
| double | 8     | 1.63                                        |

| Type    | Bytes | Range                               |
|---------|-------|-------------------------------------|
| char    | 2     | 'A', 'a', 'á' // char ==> Character |
| boolean | 1     | true / false                        |


### Casting Numeric Conversion

```
    byte -> short -> int -> float -> double
                      |
                     long                    
```

Los primitivos numéricos se convierten al siguiente en la tabla de orden.
Así, pues, un byte puede convertirse a short, short a int, etc.

Si hacemos lo inverso `short to byte`, corremos el riesgo que se pierda información
al castearlo. Pues, supongamos

``` java

short cows = 200;
byte cowsAsBytes = cows; // dará un error, ya que 200 está fuera de rango de `byte`
```


## No Primitives

Tipos de datos creados a partir de los primitivos

- Class
- Object
- String
- Array
- Interface

```
String hi = "hola"; // => ['h', 'o', 'l', 'a'] -> Array de chars (Char Array)
```
