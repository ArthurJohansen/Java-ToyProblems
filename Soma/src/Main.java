import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

//      Declarando variáveis
        int num = entrada.nextInt();
        int num1 = entrada.nextInt();

//      Calculando Soma
        int soma = num + num1;

//      Saída
        System.out.printf("SOMA = %d\n", soma);
    }
}