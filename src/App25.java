import java.util.Scanner;

public class App25 {
    public App25() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite T para calcular a área de um triângulo de base b e altura h");
        System.out.println("Digite Q para calcular a área de um quadrado de lado l");
        System.out.println("Digite R para calcular a área de um retângulo de base b e altura h");
        System.out.println("Digite C para calcular a área de um círculo de raio r");
        String numero = entrada.nextLine();
        char letra = numero.toUpperCase().charAt(0);
//---------------------------------------------------------------------------------------------------------
        switch (letra) {
            case 'T':
System.out.println("Calculando a área de um triângulo:");
System.out.print("Digite o comprimento da base: ");
int base = entrada.nextInt();
System.out.println("Digite a altura da base: ");
int alt = entrada.nextInt();
double area = 0.5*base*alt;
System.out.println("a área da base é = " +area);

                break;
// -------------------------------------------------------------------------------------------------------
            case 'Q':
            System.out.println("Calculando a área de um quadrado:");
            System.out.print("Digite o comprimento de um dos lados: ");
            int quad = entrada.nextInt();
            float areaQuad= quad*quad;
            System.out.println("a área total do quadrado é de: "+ areaQuad);
                break;
// -------------------------------------------------------------------------------------------------------
            case 'R':
            System.out.println("Calculando a área de um retângulo:");
            System.out.print("Digite o comprimento: ");
            int comp = entrada.nextInt();
            System.out.print("Digite o largura: ");
            int larg = entrada.nextInt();
            int areaRet = comp*larg;
            System.out.println("a área total do retângulo é de: "+ areaRet);
                break;
// -------------------------------------------------------------------------------------------------------
            case 'C':
            System.out.println("Calculando a área de uma circunferência: ");
            System.out.println("Digite o valor do raio: ");
            double raio = entrada.nextInt();
            double pi = Math.PI;
            double areaCirc = pi*(raio*raio);
            System.out.println("A circunferência total é de: "+ (areaCirc));
                break;
 // -------------------------------------------------------------------------------------------------------
        }
entrada.close();
    }

    public static void main(String[] args) {
        new App25();
    }
}
