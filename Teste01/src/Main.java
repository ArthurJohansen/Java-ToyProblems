import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double codigo = scanner.nextDouble();
        double qntd = scanner.nextDouble();

        if (codigo == 1) {
            System.out.println("Total: R$ " + String.format("%.2f", 4 * qntd));
        } else if (codigo == 2) {
            System.out.println("Total: R$ " +String.format ("%.2f", 4.50 * qntd));
        } else if (codigo == 3) {
            System.out.println("Total: R$ " +String.format ("%.2f", 5.00 * qntd));
        }    else if (codigo == 4) {
            System.out.printf("Total: R$ %n", ("%.2f" + 2.00 * qntd));
        }        else{
            System.out.println("Total: R$ " +String.format ("%.2f", 1.50 * qntd));

        }


    }
}