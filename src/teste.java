import java.util.Scanner;

public class teste {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um valor:");
    String numero = entrada.nextLine();
    char num1=numero.charAt(0);
    char num2=numero.charAt(1);
    char num3=numero.charAt(2);
   entrada.close();

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
}
}
