import java.util.Scanner;

public class EJERCICIO7 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        float resultado;
        System.out.println("Que quieres calcular?    1. Volumen cilindro     2. Volumen prisma rectangular");
        System.out.print("Introduce la opcion: ");
        int opcion = sc.nextInt();
        if (opcion == 1)
        {
            System.out.print("Introduce el radio del cilindro: ");
            int radio = sc.nextInt();
            System.out.print("Introduce la longitud el cilindro: ");
            int longitud = sc.nextInt();
            resultado = volumenCilindro(radio, longitud);
        }
        else
        {
            System.out.print("Introduce la longitud de la primera arista: ");
            int arista1 = sc.nextInt();
            System.out.print("Introduce la longitud de la segunda arista: ");
            int arista2 = sc.nextInt();
            System.out.print("Introduce la longitud de la tercera arista: ");
            int arista3 = sc.nextInt();
            resultado = volumenPrismaRectangular(arista1, arista2, arista3);
        }
        System.out.println("El volumen es de " + resultado + " centimetros cubicos.");
    }
    static float volumenCilindro(int r, int l)
    {
        return  (float) (Math.PI * r * r * l);
    }
    
    static float volumenPrismaRectangular(int lado1, int lado2, int lado3)
    {
        return  lado1 * lado2 * lado3;
    }
}
