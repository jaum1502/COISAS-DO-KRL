import java.util.Scanner;

public class App2 {
public App2(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com um valor inteiro maior de 0: ");
    int valor = entrada.nextInt();
    if (valor%2==0) {
        System.out.println("Número é par");
    }else{
        System.out.println("Numero é impar");
    }
    entrada.close();
}
public static void main(String[] args) {
    new App2();
}
}
