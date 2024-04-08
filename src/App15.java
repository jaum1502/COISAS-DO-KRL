import java.text.DecimalFormat;
import java.util.Scanner;

public class App15 {
public App15(){
Scanner entrada  = new Scanner(System.in);
DecimalFormat df= new DecimalFormat("0.00");
System.out.println("Digite o valor do salário: ");
double salario = entrada.nextDouble();
System.out.println("Digite a quantos meses o funcionário está na empresa: ");
int meses= entrada.nextInt();
double salarioBruto = salario*meses;
double salarioN = 0;
if (meses>12 && meses<48) {
    salarioN= salarioBruto+(salarioBruto*0.07);
}else if (meses>=0 && meses<=12) {
    salarioN= salarioBruto+(salarioBruto*0.05);
}
System.out.println("O salário do funcionário, com reajuste, é de: R$"+df.format(salarioN));
entrada.close();
}
public static void main(String[] args) {
new App15();
}
}
/*5% de reajuste para o funcionário que for admitido há até de 12 meses. 
admitido entre 13 e 48 meses, irá conceder 7% de reajuste. */