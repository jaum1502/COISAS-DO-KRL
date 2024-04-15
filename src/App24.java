import java.util.Scanner;

public class App24 {

    public App24() {
        Scanner entrada = new Scanner(System.in);
        /*Dados 3 valores, escreva um algoritmo que os informe
        em uma determinada ordem a partir de um menu de opções:*/

        System.out.println("Insira três valores: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        System.out.println("Escolha uma das Opções: \n1 - Ordem Crescente \n2 - Ordem Descrescente \n3 - Maior Valor no Meio");
        int opcao = entrada.nextInt();

        int maximo = 0;
        int meio = 0;
        int minimo = 0;

        entrada.close();
        
        if (a>b && a>c) {
            maximo = a;
        } else if (b>a && b>c) {
            maximo = b;
        } else if (c>a && c>b) {
            maximo = c;
        }

        /*if (a<b && a>c || a<c && a>b) {
            meio = a;
        } else if (b<a && b>c || b<c && b>a) {
            meio = b;
        } else if (c<a && c>b || c<b && c>a) {
            meio = c;
        }*/

        if (a<b && a<c) {
            minimo = a;
        } else if (b<a && b<c) {
            minimo = b;
        } else if (c<a && c<b) {
            minimo = c;
        }

        if (a!=maximo && a!=minimo) {
            meio = a;
        } else if (b!=maximo && b!=minimo) {
            meio = b;
        } else if (c!=maximo && c!=minimo) {
            meio = c;
        }


        switch (opcao) {
            case 1:
            System.out.println();
            System.out.println(minimo+"\n"+meio+"\n"+maximo);
                break;
            case 2:
            System.out.println();
            System.out.println(maximo+"\n"+meio+"\n"+minimo);
                break;
            case 3:
            System.out.println();
            System.out.println(meio+"\n"+maximo+"\n"+minimo);
                break;
            default:
                break;
        }

    }

    public static void main(String[] args) {
        new App24();
    }

}