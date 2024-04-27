
import java.util.Scanner;



public class ThiagoJorge {

   

    public static void main(String[] args) {
        
        double n;
        double p;
        double c;
        
      Scanner scan = new Scanner(System.in);
      
        System.out.print("Digite um número: ");
        n = scan.nextDouble();
        System.out.print("Digite outro número: ");
        p = scan.nextDouble();
        
        c = p+n;
        
        System.out.println("A SOMA DOS DOIS NÚMEROS É :" +c);
    }
    
}
