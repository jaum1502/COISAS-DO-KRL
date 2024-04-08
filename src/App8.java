import java.util.Scanner;

public class App8 {
    public App8() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a letra: ");
        char letra = entrada.next().toLowerCase().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É vogal");


        }else{
            System.out.println("Não é vogal");
        }
        entrada.close();
    }

    public static void main(String[] args) {
new App8();
    }
}
