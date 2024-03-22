# Complejidad Algorítmica en Arrays

Un array organiza sus items de forma secuencial, es decir, uno al lado del otro en memoria.

Cada posición en el array tiene un index, iniciando en 0.

Existen dos tipos de arrays:

- Array Estático = tamaño no varía
- Array Dinámico = su tamaño es variable.


## Cheat Table

| Operacion                      | Costo |
|--------------------------------|-------|
 | Creación                       | O(N)  |
| Get (Un index)                 | O(1)  |
 | Update (En un index)           | O(1)  |
| Insert (En cualquier pos)      | O(N)  |
| Append (Insert al final)       | O(1)  |
| Delete (En cualquier pos)      | O(N)  |
| Pop (Eliminar elemento final)  | O(1)  |
| Traversing (Recorrer el array) | O(N)  | 


## Creación

Tiene una complejidad `O(N) ST` dado que desconocemos el tamaño del mismo.

- S Space: tamaño ocupado en memoria
- T Time: Cantidad de operaciones a ejecutar.

```java
int[] arr = new int[100]; // O(N) ST
```

## Obtención de un Elemento (Get) y Modificación (Put)

Obtener un elemento en un array tiene una complejidad `O(1)`

```java
arr[index]

arr[3]; // O(1) T

arr[3] = 1997; // O(1) ST
```

## Inserción

Insertar un nuevo elemento en un array tiene una complejidad `O(N) ST`
dado que toca movilizar todos los elementos que estén en esa posición y siguiente hacia el lado.

- Excepción: Cuando se quiere agregar un elemento al final (**append**) la compeljidad es O(1)


## Delete - Eliminación

Eliminar un elemento en una array tiene una complejidad `O(N) ST` porque toca movilizar todos 
los elementos que estén al lado una posición menos para ocupar el espacio librerado

- Exepción: Cuando el elemento está en la última posición, tiene una complejidad `O(1)` dado que no debe hacerse
*shifting* sobre los elementos existentes.

## Recorrer - Iterar

Iterar un array tiene una complejidad `O(N) T`.


