import java.util.Scanner;

public class App18 {

    public App18() {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite o dia do vencimento até dia 10: ");
        int diaVencimento = s.nextInt();
        System.out.print("Digite o dia do pagamento: ");
        int diaPagamento = s.nextInt();
        System.out.print("Digite o valor da prestação: R$");
        float valorPrestacao = s.nextFloat();

        float valorPago = 0;

        if (diaPagamento <= diaVencimento) {
      
            valorPago = valorPrestacao - (valorPrestacao * (10/100f));
            System.out.println("Pagamento em dia");
        } else if (diaPagamento <= (diaVencimento + 5)) {
            valorPago = valorPrestacao;
        } else {
     
            int diasAtraso = diaPagamento - diaVencimento; //-5 
            valorPago = valorPrestacao + ((valorPrestacao * 0.02f) * diasAtraso);
        }
        System.out.println("Valor pago: R$ " + valorPago);

        s.close();
    }

    public static void main(String[] args) {
        new App18
    ();
    }
}