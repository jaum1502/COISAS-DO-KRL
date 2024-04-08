import java.util.Scanner;

public class App14 {
public App14(){
Scanner entrada = new Scanner(System.in);
System.out.println("Digite o dia: ");
int dia = entrada.nextInt();
System.out.println("Digite o mês: ");
int mes = entrada.nextInt();
System.out.println("Digite o ano: ");
int ano = entrada.nextInt();
if (dia>0&&dia<32&&mes>0&&mes<13&&ano>0) {
if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) {
    System.out.println("VÁLIDA");
}else if(mes!=2&&dia<31){
    System.out.println("VÁLIDA");
}else if (mes==2&&dia<29) {
    System.out.println("VÁLIDA");
}else if (dia == 29&&ano%4==0&&!(ano%100==0&&ano%400!=0)) {
    System.out.println("VÁLIDA");
}else{
    System.out.println("NÃO VALIDA"); 
}
}else{
    System.out.println("NÃO VALIDA");
}
entrada.close();
}
public static void main(String[] args) {
    new App14();
}
}
