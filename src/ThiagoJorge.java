
import java.util.Scanner;



public class ThiagoJorge {

   

    public static void main(String[] args) {
        
        double n;
        double p;
        double c;
        
      Scanner scan = new Scanner(System.in);
      
        System.out.print("Digite um n�mero: ");
        n = scan.nextDouble();
        System.out.print("Digite outro n�mero: ");
        p = scan.nextDouble();
        
        c = p+n;
        
        System.out.println("A SOMA DOS DOIS N�MEROS � :" +c);
    }
    
}
