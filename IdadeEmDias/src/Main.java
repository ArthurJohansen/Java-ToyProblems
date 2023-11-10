import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dias = entrada.nextInt();

        int calculoano = dias / 365;
        int calculomes = (dias % 365) / 30;
        int calculodia = (dias % 365) % 30;


        System.out.println(calculoano + " ano (s)");
        System.out.println(calculomes + " mes (es)");
        System.out.println(calculodia + " dia (s)");
    }
}