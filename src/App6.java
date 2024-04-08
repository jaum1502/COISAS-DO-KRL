import java.util.Scanner;

public class App6 {
    public App6() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite M para masculino, e F para feminino (I para não informado)");
        String sexo = entrada.nextLine().toLowerCase();
        if (sexo.equals("m")) {
            System.out.println("MASCULINO");

        } else {
            if (sexo.equals("f")) {
                System.out.println("FEMININO");
            } else {
                if (sexo.equals("i")) {
                    System.out.println("NÃO INFORMADO");

                }
            }
        }
        entrada.close();
    }

    public static void main(String[] args) {
        new App6();
    }
}
