
import java.text.DecimalFormat;
import java.util.Scanner;

public class App17 {
    public App17() {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Digite o valor da renda mensal: R$");
        double rendaMensal = entrada.nextDouble();
        System.out.println("Digite o número de dependentes: ");
        int dependentes = entrada.nextInt();
        double rendaAnual = rendaMensal * 12;
        double depends = 0.02;

        if (rendaMensal >= 2000 || rendaMensal <= 5000) {
            rendaAnual = rendaAnual - (rendaAnual * 0.05);
        } else if (rendaMensal >= 5000 || rendaMensal < 10000) {
            rendaAnual = rendaAnual - (rendaAnual * 0.1);
        } else if (rendaMensal > 10000) {
            rendaAnual = rendaAnual - (rendaMensal * 0.15);
        }
        double rendaAnual2 = rendaAnual - ((rendaAnual * depends) * dependentes);
        System.out.println("RENDA ANUAL: " + df.format(rendaAnual2));
        entrada.close();
    }

    public static void main(String[] args) {
        new App17();
    }
}
