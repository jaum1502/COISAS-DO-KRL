import java.util.Scanner;

public class App21 {
public App21(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a sua altura: ");
    float altura = entrada.nextFloat();
    System.out.println("Digite o seu peso: ");
    float peso= entrada.nextFloat();
    float IMC = peso/(altura*altura);
    if (IMC<18.5) {
        System.out.println("MAGREZA");
    }else if (IMC<=24.9) {
        System.out.println("SAUDÁVEL");
    }else if (IMC<=29.9) {
        System.out.println("SOBREPESO");
    }else if (IMC<=34.9) {
        System.out.println("OBESIDADE GRAU I");
    }else if (IMC<=39.9) {
        System.out.println("OBESIDADE GRAU II");
    }else if (IMC>=40) {
        System.out.println("OBESIDADE GRAU III");
    }
    entrada.close();
}
public static void main(String[] args) {
    new App21();
}
}
