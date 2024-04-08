import java.util.Scanner;

public class App5 {
    public App5(){
Scanner entrada = new Scanner(System.in);
System.out.println("A cor é azul?");
String cor = entrada.nextLine().toLowerCase(); // ToLowerCase faz com que a saída da string se transforme em letra minúscula (UpperCase para o contrário)
if (cor.equals("sim")) {    
    System.out.println("A cor é azul!!!");
}else{
    System.out.println("A cor não é azul!!!");
}
entrada.close();
    }
public static void main(String[] args) {
    new App5();
}
}
