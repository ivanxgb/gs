# Práctica HashMap y HashSet


Tenemos un array con 6 elementos y un hashset sin elementos

```java
int[] numArr = new int[] {4, 2, 12, 3, 4, 15};
HashSet<Integer> numSet = new HashSet<>();
```
<img src="https://i.ibb.co/YtmB0xJ/Screenshot-2024-03-28-at-6-33-50-PM.png">


Agregamos los elementos del array en el set

```java
for(int i = 0; i < numArr.length; i++) {
    numSet.add(numArr[i]);
}
```

Se agregan los elementos. Ahora el set tiene tamaño 5

<img src="https://i.ibb.co/HD7kKrz/Screenshot-2024-03-28-at-6-34-18-PM.png">


Podemos verificar si un elemento existe en el set con `.contains(elemento)`

```java
numSet.contains(4); // => return true
numSet.contains(40); // => return false
```


## Tarea

### Romano a Entero

Los números romanos están representados por 7 símbolos diferentes: `I`, `V`, `X`, `L`, `C`, `D` y `M`.

| Symbol | Value |
|--------|-------|
| `I`    | 1     |
| `V`    | 5     |
| `X`    | 10    |
| `L`    | 50    |
| `C`    | 100   |
| `D`    | 500   |
| `M`    | 1000  |


Los números romanos generalmente se escriben de mayor a menor de izquierda a derecha. 
Sin embargo, el numeral para `4` no es `IIII`. 
En cambio, el número cuatro se escribe como `IV`. 
Dado que el **1** está antes del **5**, lo restamos, 
resultando en 4. 

El mismo principio se aplica al número 9, que se escribe como `IX`. 

`I` puede colocarse antes de `V` (5) y `X` (10) para hacer 4 y 9.   
`X` puede colocarse antes de `L` (50) y `C` (100) para hacer 40 y 90.   
`C` puede colocarse antes de `D` (500) y `M` (1000) para hacer 400 y 900.

Dado un número romano, conviértelo a un entero.

### Ejemplo 1:

**Input**: `s = "III"`  
**Output**: `3`   
**Explanation**: `III = 3`

### Ejemplo 2:

**Input**: `s = "LVIII"`  
**Output**: `58`   
**Explanation**: `L = 50`, `V = 5`, `III = 3`

### Ejemplo 3

**Input**: `s = "MCMXCIV"`  
**Output**: `1994`   
**Explanation**: `M = 1000`, `CM = 900`, `XC = 90` y `IV = 4`




