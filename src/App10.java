import java.util.Scanner;

public class App10 {
    public App10() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade de Marquinhos");
        int marq = entrada.nextInt();
        System.out.println("Digite a idade de Zezinho");
        int zezin = entrada.nextInt();
        System.out.println("Digite a idade de Luluzinha");
        int lulu = entrada.nextInt();
        int cacula = Math.min(Math.min(marq, lulu), zezin); // o math min escolhe o menos valor das variáveis escritas
                                                            // (max 2)
        if (cacula == marq) {
            System.out.println("O mais novo é o marquinhos");
        } else if (cacula == lulu) { // else if = e se
            System.out.println("O mais novo é a Luluzinha");
        } else if (cacula == zezin) {
            System.out.println("O mais novo é o Zezinho");
            entrada.close();
        }

    }

    public static void main(String[] args) {
        new App10();
    }
}