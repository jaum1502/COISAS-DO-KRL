import java.util.Scanner;

public class App7 {
public App7(){
Scanner entrada = new Scanner(System.in);
System.out.println("Entre com o peso da carta: ");
float peso = entrada.nextFloat();
float valorPagar=0;
if (peso<=50) {
        valorPagar=0.45f;   
}else{
    float pesoExcedido=peso-50;
    float qtAdicional= (pesoExcedido/20)+1;
    valorPagar= 0.45f+0.45f*qtAdicional;
}
System.out.println("Custo do selo: R$"+valorPagar);
entrada.close();
}
public static void main(String[] args) {
    new App7();
}
}
