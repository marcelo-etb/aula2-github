import java.util.Scanner;
public class DanielVasconcelos {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double a1, a2, a3, media; 
        
        System.out.println("Saiba a m�dia das suas notas do Curso t�cnico em Inform�tica !");
        System.out.println("Informe as suas notas ");
        System.out.print("Nota A1: ");
        a1 = leia.nextDouble();
        System.out.print("Nota A2: ");
        a2 = leia.nextDouble();
        System.out.print("Nota A3: ");
        a3 = leia.nextDouble();
       
        a2 = a2 * 2;
        a3 = a3 * 2;
        media = (a1 + a2 + a3) / 5;
        
        if (media < 6.0) {
            System.err.println("Sua m�dia final foi: "+media);
            System.err.println("VOC� FOI REPROVADO !");
        } else {
            System.out.println("Sua m�dia final foi: "+media);
            System.out.println("VOC� EST� APROVADO !");
        }
        
    }
}
