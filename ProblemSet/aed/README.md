# Problem Sets UT0

## Ejecutar

Desde `ProblemSet/aed`:

```bash
mvn test
```


## Ejercicio 4

Clase: `UtilMath` y demo `Ejercicio4`.

Pruebas manuales:

| Entrada | Salida esperada |
| --- | --- |
| `factorial(0)` | `1` |
| `factorial(1)` | `1` |
| `factorial(5)` | `120` |
| `factorial(-1)` | `-1` |
| `factorial(13)` | `-1` |
| `isPrime(7)` | `true` |
| `isPrime(8)` | `false` |
| `conditionalSum(7)` | `12` |
| `conditionalSum(8)` | `16` |

Decisiones: `factorial` devuelve `-1` para negativos y mayores que 12 porque el resultado no cabe en `int`. La primalidad solo prueba divisores hasta `n / divisor` para evitar calculos innecesarios y overflow.

## Ejercicio 5

Clases: `DispositivoMedico`, `Marcapasos`, `Desfibrilador`, `DemoDispositivos`.

Memoria simplificada de `Marcapasos`: `int` id = 4 bytes, referencia `String` codigo = 4 u 8 bytes segun JVM, `short` latidos = 2 bytes, `byte` bateria = 1 byte. No se cuentan cabeceras de objeto, padding ni memoria interna del `String`.

El contador `static` esta en `DispositivoMedico` para contar todos los subtipos. `equals` y `hashCode` usan `idDispositivo` y `codigoFabricante`; con esa regla, dos subtipos con igual identidad representan el mismo dispositivo registrado.

`idDispositivo` y `codigoFabricante` no tienen setter porque forman la identidad del dispositivo y no deberian cambiar despues de construido.

## Ejercicio 6

Clase: `Multsuma`.



Ejemplos: `[1,2,3]` y `[4,5,6]` devuelve `32`. Arreglos de distinto largo lanzan `IllegalArgumentException`.

## Ejercicio 7

Clase: `StringsI`.

Observacion: `String` es inmutable; cada transformacion como `replaceAll` o `toLowerCase` produce otro `String`. Para palindromos se limpia puntuacion y mayusculas antes de comparar con la cadena invertida.

## Ejercicio 8

Clase: `StringsII`.

`StringBuilder` sirve para modificar texto sin crear un `String` nuevo en cada operacion. `==` compara referencias; `equals` compara contenido. `intern()` puede hacer que dos referencias apunten al mismo literal del string pool.

## Ejercicio 9

Clases: `ProcesadorTexto`, `ContadorPalabras`, `ContadorPalabrasSinPuntuacion`, `ResultadoAnalisis`.

`ContadorPalabras` implementa la interfaz y sobrecarga `contarPalabras` para `String` y `String[]`. `ContadorPalabrasSinPuntuacion` demuestra herencia, polimorfismo y sobreescritura.

Glosario: clase es un molde; objeto es una entidad creada desde una clase; atributo es estado; metodo es comportamiento; instancia es un objeto concreto; herencia reutiliza una clase base; polimorfismo permite usar implementaciones distintas con el mismo tipo; encapsulamiento oculta detalles internos; abstraccion modela lo esencial.

## Ejercicio 10

Clase: `ContadorPalabras`.

`obtenerLineas` lee archivo y ante error devuelve arreglo vacio. `palabrasComunes` resuelve con arreglos y ciclos; `palabrasComunesConColeccion` usa `Set`. Arreglos es mas manual; colecciones reducen codigo y evitan duplicados naturalmente.

## Ejercicio 11

Clase: `Principal`.

Archivo de ejemplo: `src/main/resources/entrada-ej11.txt`. Si se pasa ruta por argumentos, lee archivo. Si no hay argumentos, lee radio desde teclado y calcula area y perimetro.

## Ejercicio 12

Clase: `DepuracionErrores`.

Casos corregidos: division por cero, `String null` e indice invalido de arreglo. En cada caso la version segura valida antes de operar y falla de forma controlada con mensaje claro o valor definido.

## Ejercicio 13

Clases: `TipoCaracter`, `AnalizadorCaracteres`.

El enum mejora legibilidad porque evita codigos magicos para vocal, consonante, digito u otro. `values()` permite recorrer todos los tipos.

## Ejercicio 14

Clase: `TransformadorT9`. Tests: `TransformadorT9Test`.

Incluye conversion T9, conversion con texto invertido y transformacion archivo a archivo. La suite JUnit 5 tiene test basico, parametrizado, excepcion y timeout. Evidencia: `mvn test` termina con `BUILD SUCCESS`.
