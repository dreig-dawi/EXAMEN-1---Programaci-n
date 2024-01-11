import java.util.Scanner;

public class EJERCICIO3
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        if (esPar(numero))
        {
            System.out.println("Tu numero es par");
        }
        else
        {
            System.out.println("Tu numero es impar");
        }
    }

    static boolean esPar(int dato)
    {
        return (dato % 2 == 0) ? true : false;
    }
}