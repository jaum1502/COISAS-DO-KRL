import java.util.Scanner;

public class App12 {
    public App12() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o comprimento do lado 1: ");
        double lado1 = entrada.nextDouble();
        System.out.println("Entre com o comprimento do lado 2: ");
        double lado2 = entrada.nextDouble();
        System.out.println("Entre com o comprimento do lado 3: ");
        double lado3 = entrada.nextDouble();
        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("é equilatero");
            } else {
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("é isóceles");
                } else {
                    System.out.println("é escaleno");
                }
            }
        } else {
            System.out.println("Não formam um triângulo");
        }
        entrada.close();
    }

    public static void main(String[] args) {
        new App12();
    }
}
