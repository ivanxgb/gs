# Array y ArrayList

## Tarea

Para la resolución de esta tarea, ***LEE*** todo.

Unos métodos iniciales fueron creados en el archivo `TareaDay4.java` para los puntos _1_ y _2_. 

Al final de la tarea encontrarás una lista de números y ciudades que puedes usar para probar la tarea solicitada.


1. Suma de elementos de un array: El método `sumArray` recibe por parámetro un array de números enteros `Int`
   - Recorre el array y suma todos sus elementos
   - Imprime y retorna la suma total

2. Buscar un elemento en un array: El método `findCity` recibe por parámetro un array de `Strings` con las ciudades
y un segundo parámetro con el nombre de una ciudad a buscar
   - Busca el string en el array y, si lo encuentra, retorna su posición, si no, retorna `-1`.
   - Al hacer la búsqueda no debe discriminar por mayúsculas. Así pues, si la lista tiene "BOGOTA" pero recibe "bogota",
   debe imprimirse la posición. Para esto puedes ayudarte del método de Strings `equalsIgnoreCase` [Ignore Case](https://www.w3api.com/Java/String/equalsIgnoreCase/)

3. Implementar una clase que represente una lista de compra: 
   - Crea una clase que represente una lista de compra, y una clase que represente Productos.
   - La clase de productos debe recibir por constructor el nombre del producto y un precio.
   - La clase de lista de copmra debe tener atributo que represente la lista de productos
   - La clase debe tener métodos para agregar productos a la lista, eliminar productos de la lista, 
   calcular el precio total de la lista y mostrar la lista por pantalla.

     
**Listado de números**: 20, 1200, 14, 36, 11, 74, -199, 1300, 25, 23, 1, -5, 1000, -500. El resultado de la suma anterior es: 3000

**Listado de ciudades** : Bogota, Nueva York, Roma, El Cairo, Londres, Paris, Tokio, 
Pekin, Delhi, Mumbai, Buenos Aires, Manizales, Kolkata, Manila, Osaka, 
Moscu, Karachi, Dhaka, Bangkok, Madrid, Seul, Yakarta, Johannesburgo, Lagos, Berlin, Toronto,
Santiago, Minsk



## Array vs ArrayList

- Array:
    Es una estructura de datos que almacena una colección de valores del mismo tipo.

- ArrayList:
    Es una estructura de datos que almacena una colección de objetos.

## Diferencias

- Array: 
  - Permite valores primitivos
  - Son de tamaño fijo. Una vez que se ha creado no se puede modificar el mismo o eliminar datos.
  - Son más eficientes para tipos de datos primitivos
- Listas: 
  - Almacena CUALQUIER tipo de objeto, incluso objetos personalizados (clases creadas por nosotros)
  - Son de tamaño dinámico, o sea, se pueden agregar o eliminar elementos en cualuqier momento.
  - Pueden ser más lentos al ser dinámico dado que podemos estar superando su capacidad y debe efectuarse
  la copia de sus datos hacia un nuevo array para no quedarnos sin espaico.

  

## Array

Sintaxis:
- Tipo de dato + []
- nombre
- inicialización del array seteando el tamaño -> `new int[]`

```java

// Inicialización con el tamaño
int[] arrayUno = new int[3];

// Elemento con index `i` se le asigna el valor de N
arrayUno[0] = 25;
arrayUno[1] = 6;
arrayUno[2] = 27;

// Inicialización con los datos. 
int[] arrayDos = {25, 6, 27};

// Accediendo a los elementos -> [] 
System.out.println(arrayUno[1]);

// Para obtener el tamaño de un array, usamos `.length`
System.out.println(arrayDos.length) // 3

arrayUno[2] = 31;
```

## Listas

### ArrayList

Sintaxis:
- Keyword `ArrayList<TipoDeDato>`
- Nombre
- Inicialización -> `new ArrayList<>()`

```java
// Inicialización sin Datos
ArrayList<String> nombres = new ArrayList<>();

// Inicialización CON datos
ArrayList<String> nombres2 = new ArrayList<>() {
    {
        add("Ivan");
        add("Esteban");
        add("Daniel");
    }  
};


// Añadir Datos `.add(value)` recibe el dato a agregar. 
nombres.add("Ivan");
nombres.add("Esteban");
nombres.add("Daniel");

// Acceder a elemento en posición. `.get(index)`
nombres.get(2); // Daniel

// Obtener tamaño: Se usa el método `size()` el cual NO toma ningún parámetro y retorna un valor
nombres.size();

// Modificar: Para modificar un valor existente se usa el método `set()` el cual recibe index y el valor
// `.set(index, nuevoValor);`
nombres.set(0, "Van"); // Antes era "Ivan", ahora es "Van"

// Eliminar: Para un elemento se usa el método `remove(index)`
nombres.remove(1); // La lista queda como ["Van", "Daniel"] dado que "Esteban" fue eliminado
```
