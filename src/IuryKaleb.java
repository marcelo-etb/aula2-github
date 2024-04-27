
import java.util.Scanner;

public class IuryKaleb {

        public static void main(String[] args) {
            double ano, copa=2026;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Vamos saber quantos anos restam para a prómica Copa do Mundo?");
            System.out.println("Insira aqui o ano vigente: ");
            ano = entrada.nextDouble();
            System.out.println("Aqui está o resultado: " + (copa-ano));
            
    }

}
