import java.util.Scanner;

public class NumerosIncremento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        int num2;
        do {
            System.out.print("Introduce un segundo número entero distinto al primero: ");
            num2 = scanner.nextInt();
        } while (num1 == num2);

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("Números enteros comprendidos entre " + menor + " y " + mayor + " (incrementando de 7 en 7):");

        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }

        scanner.close();
    }
}
