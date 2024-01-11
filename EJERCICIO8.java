import java.util.Scanner;

public class EJERCICIO8 
{
    static Scanner sc = new Scanner(System.in);
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
            tamano = volumenPrismaRectangular(arista1, arista2, arista3);
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

    static float volumenCilindro(int r, int l)
    {
        return  (float) (Math.PI * r * r * l);
    }
    
    static float volumenPrismaRectangular(int lado1, int lado2, int lado3)
    {
        return  lado1 * lado2 * lado3;
    }
}