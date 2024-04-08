import java.util.Scanner;

public class App11 {
    public App11() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento do primeiro irmão: ");
        int irmao1 = entrada.nextInt();
        System.out.println("Digite o ano de nascimento do primeiro irmão: ");
        int irmao2 = entrada.nextInt();
        System.out.println("Digite o ano de nascimento do primeiro irmão: ");
        int irmao3 = entrada.nextInt();

        if (irmao1 == irmao2 && irmao2 == irmao3) {
            System.out.println("TRIGÊMEOS");
        } else if (irmao1 == irmao2 || irmao3 == irmao2 || irmao3 == irmao1) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("São apenas irmãos");
        }
        entrada.close();

    }

    public static void main(String[] args) {
        new App11();

    }
}
