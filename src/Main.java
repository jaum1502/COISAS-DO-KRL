import java.util.Scanner;

public class Main {
    public Main(){
        Scanner entrada = new Scanner(System.in);
        int hora = entrada.nextInt();
        int horaFim = entrada.nextInt();
        int horas = 0;
        int dia=24;

        if (hora>horaFim) {
            horas = hora-horaFim;
        } else if (horaFim>hora) {
            horas = dia-(horaFim-hora);
        }
    
        System.out.println(dia-horas);
        entrada.close();
}

    public static void main(String[] args) {
        new Main();
    }
}
