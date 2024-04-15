import java.util.Scanner;

public class App25 {

    public App25() {
        Scanner entrada = new Scanner(System.in);

        System.out.println(
                "Escolha uma opção: \n1 - Soma de dois números;\n2- Diferença entre dois números;\n3 - Produto entre dois números.\n4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = entrada.nextInt();
        double valor1 = 0;
        double valor2 = 0;

        switch (opcao) {
            case 1:
                System.out.println("Insira dois números para o cálculo: ");
                valor1 = entrada.nextDouble();
                valor2 = entrada.nextDouble();
                System.out.println("Soma: " + (valor1 + valor2));
                break;
            case 2:
                System.out.println("Insira dois números para o cálculo: ");
                System.out.print("Maior valor:");
                valor1 = entrada.nextDouble();
                System.out.print("Menor valor:");
                valor2 = entrada.nextDouble();
                if (valor1 < valor2) {
                    System.out.println("Inválido");
                } else {
                    System.out.println("Diferença: " + (valor1 - valor2));
                }
                break;
            case 3:
                System.out.println("Insira dois números para o cálculo: ");
                valor1 = entrada.nextDouble();
                valor2 = entrada.nextDouble();
                System.out.println("Produto: " + (valor1 * valor2));
                break;
            case 4:
                System.out.println("Insira dois números para o cálculo: ");
                System.out.print("Numerador:");
                valor1 = entrada.nextDouble();
                System.out.print("Denominador:");
                valor2 = entrada.nextDouble();
                if (valor2 != 0) {
                    System.out.println("Divisão: " + (valor1 / valor2));
                } else {
                    System.out.println("Inválido");
                }
                break;
            default:
                System.out.println("Insira uma opção válida.");
                break;
        }

        entrada.close();
    }

    public static void main(String[] args) {
        new App25();
    }

}