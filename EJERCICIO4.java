import java.util.Scanner;

public class EJERCICIO4
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        primerosNumerosPares(numero);
    }

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
}