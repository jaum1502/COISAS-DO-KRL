import java.util.Scanner;

public class App1 {
    public App1() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com as horas trabalhadas no mês: ");
        double horasMes = entrada.nextDouble();
        System.out.print("Entre com o valor pago por hora: ");
        double horasValor = entrada.nextDouble();
        double salarioTotal = horasMes * horasValor;
        if (horasMes > 160) {
            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }
        System.out.println("O salário é: " + salarioTotal);
        entrada.close();
    }

    public static void main(String[] args) throws Exception {
        new App1();
    }
}
