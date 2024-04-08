import java.util.Scanner;

public class App20 {
    public App20(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as notas do aluno: ");
        int nota1 = entrada.nextInt();
        int nota2 = entrada.nextInt();
        int nota3 = entrada.nextInt();
float media= (nota1+nota2+nota3)/3;
if (media>=9) {
    System.out.println("ALUNO NOTA: A (APROVADO)");
}else if (media<=9&&media>=7) {
    System.out.println("ALUNO NOTA: B (APROVADO)");
}else if (media>=6&&media<=7.5) {
    System.out.println("ALUNO NOTA: C (APROVADO)");
}else if (media<=6&&media>=4) {
    System.out.println("ALUNO NOTA: D (REPROVADO)");
}else if (media<4) {
    System.out.println("ALUNO NOTA: E (REPROVADO)");
}
entrada.close();
    }
public static void main(String[] args) {
    new App20();
}
}
