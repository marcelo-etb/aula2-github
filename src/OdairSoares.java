import java.util.Scanner;
public class OdairSoares {

    public static void main(String[] args) {
      //Entrada
      Scanner entrada = new Scanner(System.in);
      System.out.println("digite 1: para me liberar.");
      System.out.println("digite 2: para ir sem autoriza�a�.");
      System.out.println("digite 3: porque eu vou de qualquer jeito.");
      System.out.println("escolha agora:");
      int opcao = entrada.nextInt();
      switch (opcao){
        case 1: System.out.println("pode");break;
        case 2: System.out.println("n�o autorizo");break;
        case 3: System.out.println("v�");break;
       default: System.err.println("op�ao ivalida");break;
    }
    }
    
}
