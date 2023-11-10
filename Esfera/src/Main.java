import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

//          Declarando variáveis
        double num = 4.0/3;
        double pi = 3.14159;
        double num2 = entrada.nextDouble();

//           Calculo
        double area = num * pi * num2 * num2 * num2;

        System.out.printf("VOLUME = %.3f\n " ,area);
    }
}

