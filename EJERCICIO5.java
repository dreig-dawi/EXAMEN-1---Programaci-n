import java.util.Scanner;

public class EJERCICIO5 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        menu();
    }

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
}
