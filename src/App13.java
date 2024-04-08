import java.util.Scanner;

public class App13 {
    public App13() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 3 cartas: ");
        int carta1 = entrada.nextInt();
        int carta2 = entrada.nextInt();
        int carta3 = entrada.nextInt();
        int qCartasBoas = 0;
        if (carta1 == 1 || carta1 == 2 || carta1 == carta3) {
            qCartasBoas += 1;
            if (carta2 == 1 || carta2 == 2 || carta2 == carta3) {
                qCartasBoas = qCartasBoas + 1;
                if (carta2 == 1 || carta2 == 2 || carta2 == carta3) {
                    qCartasBoas = qCartasBoas + 1;
                    if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
                        qCartasBoas++;
                        if (qCartasBoas == 1) {
                            System.out.println("TRUCO");
                        } else {
                            if (qCartasBoas == 2) {
                                System.out.println("SEIS");
                            }
                        }
                    }
                } else {
                    if (qCartasBoas == 3) {
                        System.out.println("NOVE");
                    }
                }
            }

        }

        entrada.close();
    }

    public static void main(String[] args) {
        new App13();
    }
}
