import java.util.Scanner;

public class App9 {
public App9(){
    Scanner entrada = new Scanner(System.in);
System.out.println("Digite o primeiro valor: ");
int valor1 = entrada.nextInt();
System.out.println("Digite o segundo valor: ");
int valor2 = entrada.nextInt();
if (valor1 % valor2 == 0) {
    System.out.println("É múltiplo");
}else{
    System.out.println("Não é múltiplo");
}
entrada.close();
}
public static void main(String[] args) {
    new App9();
}
}
