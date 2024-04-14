import java.util.Scanner;

public class App26 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("T: Calcular a área de um triangulo de base b e altura h");
        System.out.println("Q: Calcular a área de um quadrado de lado L");
        System.out.println("R: Calcular a área de um retângulo de base b altura");
        System.out.println("C: Calcular a área de um circulo de raio r");
        char valor = entrada.next().toUpperCase().charAt(0);
        switch (valor) {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo:");
                float base = entrada.nextFloat();
                float altura = entrada.nextFloat();
                System.out.println("área do triângulo =" + (base * altura) / 2);

                break;
            case 'Q':
                System.out.println("Digite o lado:");
                float lado = entrada.nextFloat();
                System.out.println("Área do quadrado = " + lado * lado);

                break;
            case 'R':
                float b = entrada.nextFloat();
                float h = entrada.nextFloat();
                System.out.println("Área do retângulo = " + b * h);

                break;
            case 'C':
                System.out.println("Digite o raio:");
                float r = entrada.nextFloat();
                System.out.println("Área do circulo = " + Math.PI * Math.pow(r, 2));

                break;
                default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
        entrada.close();
    }
}
