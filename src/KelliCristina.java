
import java.util.Scanner;
public class KelliCristina {

    public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
        
     
        System.out.println("Digite o sal�rio do funcion�rio:");
        double salario = entrada.nextDouble();
        
        if (salario >= 1000.00) {
           
            salario += 100.00;
        } else {
           
            salario += 50.00;
        }
        
        System.out.println("Novo sal�rio: R$" + salario);
        
      
        entrada.close();
    }
}
