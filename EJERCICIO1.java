import java.util.Scanner;

public class EJERCICIO1
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        decimalBinario(numero);
    }

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
}