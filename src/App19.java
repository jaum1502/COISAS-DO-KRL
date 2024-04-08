import java.util.Scanner;

public class App19 {
    public App19() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("X= ");
        double x = entrada.nextDouble();
        System.out.print("Y= ");
        double y = entrada.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("QUADRANTE ZERO");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("QUADRANTE UM");
            } else {
                if (x > 0 && y < 0) {
                    System.out.println("QUADRANTE DOIS");
                } else {
                    if (x < 0 && y < 0) {
                        System.out.println("QUADRANTE TRÊS");
                    } else {
                        if (x < 0 && y > 0) {
                            System.out.println("QUADRANTE QUATRO");
                        }
                    }
                }
            }
        }
        entrada.close();
    }

    public static void main(String[] args) {
        new App19();
    }
}
