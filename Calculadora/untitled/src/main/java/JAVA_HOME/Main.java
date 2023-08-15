package JAVA_HOME;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Calculadora!\n");


        int num1 = 10;
        int num2 = 2;
        int sum = 0;
        int res = 0;
        int mult = 0;
        int div = 0;
        Scanner scanner = new Scanner(System.in);//se declara un objeto llamado scanner de tipo escanner

        System.out.println("Ingresa que quieres hacer: 1: suma, 2: resta, 3: multiplicacion, 4:division");
        int lectura = scanner.nextInt(); //se crea variable tipo numero para lectura datos(usar metodos del objeto escaner)

        if (lectura == 1) {
            sum = num1 + num2;
            System.out.println("La suma es:" + sum);
        } else if (lectura == 2) {
            res = num1 - num2;
            System.out.println("La resta es:" + res);
        } else if (lectura == 3) {
            mult = num1 * num2;
            System.out.println("La multiplicacion es:" + mult);
        } else if (lectura == 4) {

            div = num1 / num2;
            System.out.println("La division es:" + div);
        } else {
            System.out.println("Ingrese un valor valido");
        }
        /*if (num2 <= num1) {
            res = num1 - num2;
            System.out.println("La resta es:" + res);
        } else {
            System.out.println("La resta es:" + res);
        }*/
    }
}