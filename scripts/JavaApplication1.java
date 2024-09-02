package javaapplication1;
import java.util.Scanner;
/*
Conversor de numeros en bases diferentes.
 * El siguiente código tiene la funciolidad de convertir un número a una base 
 * 2,8, 16,18, ect.
 * @Funcioanlidad: Usted como usuario debe ingresar el número a convertir,
 * luego ingresar la base de número y por último ingresar la base a la que desea
 * convertir. 
 * @párametros: num1=10 || base=10 || base a convertir =2
 * @returns: numConvertido= 1010
 -Alumna:Gonzalez Lita Daisy.
*/
public class JavaApplication1{
    // Método para convertir un número de una base a decimal
    public static long convertToDecimal(String number, int base) {
        return Long.parseLong(number, base);
    }
    // Método para convertir un número decimal a otra base
    public static String convertFromDecimal(long number, int base) {
        return Long.toString(number, base).toUpperCase();
    }
    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero a convertir:");
        String number = scanner.nextLine();

        System.out.println("Ingrese la base del numero (2, 8, 10, 16,18, etc.):");
        int fromBase = scanner.nextInt();

        System.out.println("Ingrese la base a la que desea convertir (2, 8, 10, 16):");
        int toBase = scanner.nextInt();

        // Convertir el número de la base original a decimal
        long decimalNumber = convertToDecimal(number, fromBase);

        // Convertir el número decimal a la base deseada
        String convertedNumber = convertFromDecimal(decimalNumber, toBase);

        System.out.println("El numero convertido es: " + convertedNumber);
    }
}

