import java.util.Scanner;

public class EJERCICIO6 
{
    static Scanner sc = new Scanner(System.in);
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
}
