import java.util.Scanner;

public class App4 {
    public App4() {Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        float valor = entrada.nextFloat();
        if (valor % 1 != 0 ) {
            System.out.println("Foram digitadas casas decimais!!!");
        }else{
            System.out.println("Não foram digitadas casas decimais!!!");
        }
        entrada.close();
    }

    public static void main(String[] args) {
        new App4();
    }
}
