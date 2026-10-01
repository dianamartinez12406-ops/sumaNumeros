import java.util.Scanner;

public class SumaDel1AlN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int n = entrada.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma del 1 al " + n + " es: " + suma);
    }
}   
    


