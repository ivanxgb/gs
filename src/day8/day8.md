# Map y Set (HashMap y HashSet)


## Complejidad Algorítmica

- Insert: O(1) ST *
- Delete: O(1) ST *
- Search: O(1) ST *

| Op     | Worst | Average |
|--------|-------|---------|
| Insert | O(N)  | O(1)    |
| Delete | O(N)  | O(1)    |
| Search | O(N)  | O(1)    |

Como industria hemos estandarizado que para `Maps` y `Set` NO usamos la **peor** complejidad sino la **promedio**

## Como funciona el Hasheo

<img src="https://i.ibb.co/n8dskcz/Screenshot-2024-03-25-at-7-19-08-PM.png">

## Maps - HashMap

Es un tipo de estructura de datos cuya particularidad es funcionar como
`clave - valor` (Key - Value) o conocidos en otros lenguajes de programación como diccionarios.

```java

Atlantico => Barranquilla
Antioquia => Medellin
Cundinamarca => Bogota

// Ejercicio con arrays
String[] departamentos = ["atlantico","antioquia","cundinamarca"];
String[] capitales = ["barranquilla","medellin","bogogta"];
// Para buscar la capital tendríamos que encontrar el index de un dpto y
// con ese mismo index obtenerlo de capitales. Lo cual tendría una complejidad
// O(N)


// Ejercicios con Maps
HashMap<String, String> departamentos = new HashMap<>();
departamentos.put("atlantico", "barranquilla");
departamentos.put("antioquia", "medellin");
departamentos.put("cundinamarca", "bogota");

String capital = departamentos.get("atlantico"); // barranquilla
// Para encontrar un elemento en un map tenemos una complejidad O(1).
```

## Set - HashSet

Es un tipo de estructura de datos cuya particularidad es almacenar elementos únicos.

```java

import java.util.HashSet;

String[] ciudades = ["Barranquilla", "Barranquilla", "Bogota", "Bogota"]
HashSet<String> ciudadSet = new HashSet<>();

for(int i = 0; i < ciudades.length; i++) {
    ciudadSet.add(ciudades[i]);    
}

// ciudadSet => {"Barranquilla", "Bogota"};

```
