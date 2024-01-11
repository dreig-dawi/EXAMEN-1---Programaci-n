# EXAMEN-1---Programacion
Programing test from past years (in Spanish)

# EXAMEN 1 - Programacion

## Temario incluido:
- Conceptos basicos.
- Condicionales.
- Bucles.
- Funciones.

#### Bloque 1

### Ejercicio 1 - (1 pt)
Haz una función **decimalBinario** que reciba por parámetro un número entero decimal y lo enseñe en la pantalla en binario.  Con una cifra por linea y puede estar invertido.  Asume que el número que se pasa por el parametro siemrpe es positivo.

#### Pseudocódigo:
```
funcion decimalBinario(int numero)
{
    bool fin = false;
    int respuesta;
    while (!fin)
    {
        respuesta = numero % 2;
        println(respuesta);
        numero /= 2;
        if (numero == 0)
        {
            println("0");
            fin = true;
        }
    }
}
```
#### Java:
```
static void decimalBinario(int decimal)
{
    boolean fin = false;
    int binario;
    while (!fin)
    {
        binario = decimal % 2;
        System.out.println(binario);
        decimal /= 2;
        if (decimal == 0)
        {
            System.out.println("0");
            fin = true;
        }
    }
}
```

### Ejercicio 2 - (1 pt)
Haz una función **binarioDecimal** que reciba por parámetro un número entero binario (tipo _long_) y enseñe en la pantalla el número decimal.  Para pasar de binario a decimal se ha multiplicar cada termino por 2<sup>_n_</sup> donde _n_ es la posicion que ocupa el dígito (de derecha a izquierda y comenzando por 0) y sumar el resultado de todas las multiplicaciones.

#### Pseudocódigo:
```
funcion void binarioDecimal (long binario)
{
    int longitud = 0;
    int digito = 0;
    long respuesta = 0;
    long copia = binario;
    do
    {
        copia /= 10;
        longitud++;
    } while (copia > 0)
    for (int i = 0; i < longitud; i++)
    {
        digito = binario % 10;
        digito = digito * Math.pow(2, i);
        respuesta += digito;
    }
    println(respuesta);
}
```
#### Java:
```
static void binarioDecimal(long binario)
{
    int longitud = 0;
    double digito = 0;
    long respuesta = 0;
    long copia = binario;
    do
    {
        copia /= 10;
        longitud++;
    } while (copia > 0);
    for (int i = 0; i < longitud; i++)
    {
        digito = binario % 10;
        digito = digito * Math.pow(2, i);
        binario /= 10;
        respuesta += digito;
    }
    System.out.println(respuesta);
}
```

### Ejercicio 3 - (1 pt)
Haz una función **esPar** que reciba por parámetro un número entero y devuelva un buleano **true** si es par o un buleano **false** si no lo es.
#### Pseudocódigo:
```
funcion bool esPar (int numero)
{
    return (numero % 2 == 0) ? true : false;
}
```
#### Java:
```
static boolean esPar(int dato)
{
    return (dato % 2 == 0) ? true : false;
}
```

### Ejercicio 4 - (1 pt)
Haz una función primerosNumerosPares que reciba por parámetro un numero entero **n** y muestre por pantalla todos los numeros pares entre 0 (inlcuido) y **n** (incluido, si es necesario).  Asume que el numero **n** que se pasa por parámetro siempre es positivo.
#### Pseudocódigo:
```
funcion void primerosNumerosPares(int n)
{
    for(int i = 0; i <= n; i++)
    {
        if (i % 2 == 0)
        {
            println(i);
        }
    }
}
```
#### Java:
```
static void primerosNumerosPares(int n)
{
    for (int i = 0; i <= n; i++)
    {
        if (i % 2 == 0)
        {
            System.out.println(i);
        }
    }
}
```

### Ejercicio 5 - (1 pt)
Haz una función **menu** que muestre el siguiente menú por pantalla y devuelva la opción escogida por el usuario en formato número entero:
```
    Escoge una de las siguientes opciones:
    1. Decimal a binario
    2. Binario a decimal
    3. Es par?
    4. Calcular pares de 0 a n
    0. Salir
```
#### Pseudocódigo:
```
funcion int menu()
{
    println("Escoge una de las siguientes opciones:");
    println("1. Decimal a binario");
    println("2. Binario a decimal");
    println("3. Es par?");
    println("4. Calcular pares de 0 a n");
    println("0. Salir");
    int respuesta = input();
    return respuesta;    
}
```
#### Java:
```
static int menu()
{
    System.out.println("Escoge una de las siguientes opciones:");
    System.out.println("1. Decimal a binario");
    System.out.println("2. Binario a decimal");
    System.out.println("3. Es par?");
    System.out.println("4. Calcular pares de 0 a n");
    System.out.println("0. Salir");
    int respuesta = sc.nextInt();
    return respuesta; 
}
```

### Ejercicio 6 - (1 pt)
Implenta el **main**, que consiste en:
    a) Muestra el **menu** principal, si el usuario introduce un 0, el programa termina, si introduce una opción inválida se le informa y se le vuelve a mostrar el menú.
    b) Pide los datos necesarios para ejecutar la función que corresponde haciendo uso de los ejercicios anteriores.
    c) Vuelve a mostrar el **menu** principal.
#### Pseudocódigo:
```
void main()
{
    int camino;
    int entrada;
    do
    {
        camino = menu();
    switch (camino)
    {
            case 1:
                println("Introduce un numero: ");
                entrada = input();
                decimalBinario(entrada1);
                break;
            case 2:
                println("Introduce un numero en binario: ");
                entrada = input();
                binarioDecimal();
                break;
            case 3:
                println("Introduce un numero: ");
                entrada = input();
                if (esPar(entrada))
                {
                    println("El numero es par");
                }
                else
                {
                    println("El numero es impar");
                }
                break;
            case 4:
                println("Introduce un numero: ");
                entrada = input();
                primerosNumerosPares(entrada);
                break;
        }
        if (camino != 0)
        {
            camino = 5;
        }
    }while (camino < 0 || camino > 4);
}
```
#### Java:
```
public static void main(String[] args)
{
    int camino;
    int entrada;
    do
    {
        camino = EJERCICIO5.menu();
        switch (camino)
        {
            case 1:
                System.out.println("Introduce un numero: ");
                entrada = sc.nextInt();
                EJERCICIO1.decimalBinario(entrada);
                break;
            case 2:
                System.out.println("Introduce un numero en binario: ");
                entrada = sc.nextInt();
                EJERCICIO2.binarioDecimal(entrada);
                break;
            case 3:
                System.out.println("Introduce un numero: ");
                entrada = sc.nextInt();
                if (EJERCICIO3.esPar(entrada))
                {
                    System.out.println("El numero es par");
                }
                else
                {
                    System.out.println("El numero es impar");
                }
                break;
            case 4:
                System.out.println("Introduce un numero: ");
                entrada = sc.nextInt();
                EJERCICIO4.primerosNumerosPares(entrada);
                break;
        }
        if (camino != 0)
        {
            camino = 5;
        }
    }while (camino < 0 || camino > 4);
}
```

#### Bloque 2

Una empresa de transportes no ha encargado un programa que le ayude a hacer algunos cálculos.  La empresa suele transportar líquidos o materias primeras como tierra, grava arena o similares, es decir, miden el trasporte según el volumen del material a transportar.  Quiere que el programa le determine cuantos viajes le hacen falta para completar cada encargo.
### Ejercicio 7 - (2 pt)
Haz dos funciones para calcular las capacidades de los camiones.  Los camiones pueden ser cisterna (cilíndricos) o de tipo caja (prisma rectangular).  Por tanto:
    a) Define la función **volumenCilindro** que recibirá como parámetros el radio y la longitud (siempre positivos) del depósito en centímetros y devolverá el volumen en centímetros cúbicos.  _V = $\pi$ · r<sup> 2</sup> · l_
    b) Define la función **volumenPrismaRectangular** que recibirá como parámetros las medidas de las aristas en centímetros (positivos) y devolverá el volumen en centímetros cúbicos. _V = lado1 · lado2 · lado3_
#### Pseudocódigo:
```
funcion float volumenCilindro(int r, int l)
{
    return = pi * r * r * l;
}

funcion float volumenPrismaRectangular(int lado1, int lado2, int lado3)
{
    return = lado1 * lado2 * lado3;
}
```
#### Java:
```
static float volumenCilindro(int r, int l)
{
    return  (float) (Math.PI * r * r * l);
}

static float volumenPrismaRectangular(int lado1, int lado2, int lado3)
{
    return  lado1 * lado2 * lado3;
}
```

### Ejercicio 8 - (2 pt)
Haz un **main** que:
    a) Pide al usuario si el transporte sera de líquidos o sólidos.  Si la opción que introduce no es válida, ha de volver a hacer la pregunta
    b) Pide al usuario el volumen que se ha de transportar, en metros cúbicos.
    c) Calcula cuantos viajes ha de hacer.
#### Pseudocódigo:
```
void main()
{
    int transporte;
    float tamano;
    int cubicos;
    while (true)
    {
        print("Que has de transportar?  1. Liquidos  2. Solidos");
        transporte = input();
        if (transporte == 1 || trasnporte == 2)
        {
            break;
        }
        println("No es una opcion valida");
    }
    if (transporte == 1)
    {
        print("Introduce los centimetros de radio de la cisterna: ");
        int radio = input();
        print("Introduce los centimetros de longitud de la cisterna: ");
        int longitud = input();
        tamano = volumenCilindro(radio, longitud);
    }
    else
    {
        print("Introduce la longitud de la primera arista: ");
        int arista1 = input();
        print("Introduce la longitud de la segunda arista: ");
        int arista2 = input();
        print("Introduce la longitud de la tercera arista: ");
        int arista3 = input();
        tamano = volumenPrismaRectangular(arista1, arista2, arista2);
    }
    print("Cuantos metros cubicos hemos de tranportar? ");
    cubicos = input();
    for(int viajes = 0; cubicos > 0; viajes++)
    {
        cubicos -= tamano;
    }
    println("El camion tiene una capacidad de " + tamano + "centimetros cubicos");
    println("Caben " + (tamano / 1000000) + " metros cubicos");
    println("Has de hacer " + viajes + " viajes");
}
```
#### Java:
```
public static void main(String[] args)
{
    int transporte;
    float tamano;
    int cubicos;
    int viajes;
    while (true)
    {
        System.out.println("Que has de transportar?  1. Liquidos  2. Solidos");
        transporte = sc.nextInt();
        if (transporte == 1 || transporte == 2)
        {
            break;
        }
        System.out.println("No es una opcion valida");
    }
    if (transporte == 1)
    {
        System.out.print("Introduce los centimetros de radio de la cisterna: ");
        int radio = sc.nextInt();
        System.out.print("Introduce los centimetros de longitud de la cisterna: ");
        int longitud = sc.nextInt();
        tamano = volumenCilindro(radio, longitud);
    }
    else
    {
        System.out.print("Introduce la longitud de la primera arista: ");
        int arista1 = sc.nextInt();
        System.out.print("Introduce la longitud de la segunda arista: ");
        int arista2 = sc.nextInt();
        System.out.print("Introduce la longitud de la tercera arista: ");
        int arista3 = sc.nextInt();
        tamano = volumenPrismaRectangular(arista1, arista2, arista2);
    }
    System.out.print("Cuantos metros cubicos hemos de transportar? ");
    cubicos = sc.nextInt();
    for(viajes = 0; cubicos > 0; viajes++)
    {
        cubicos -= tamano;
    }
    System.out.printf("El camion tiene una capacidad de %.2f centimetros cubicos\n", tamano);
    System.out.printf("Caben %.2f metros cubicos\n", (tamano / 1000000));
    System.out.println("Has de hacer " + viajes + " viajes");
}
```
