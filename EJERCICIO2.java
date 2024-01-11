import java.util.Scanner;

public class EJERCICIO2 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero en binario: ");
        long numero = sc.nextLong();
        binarioDecimal(numero);
    }

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
}
