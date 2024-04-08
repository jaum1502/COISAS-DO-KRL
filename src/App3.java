import java.util.Scanner;

public class App3 {
    public App3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = entrada.nextInt();
        if (valor1>valor2) {
            System.out.println("O valor mais alto é o "+ valor1);
            
        }else{
            System.out.println("O valor mais alto é o "+valor2);
        }
        entrada.close();
    }
public static void main(String[] args) {
    new App3();
}
}
