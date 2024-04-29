
import java.util.Scanner;
public class La�sIvana {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro n�mero:");
        double numero1 = entrada.nextDouble();
        
        System.out.println("Digite o segundo n�mero:");
        double numero2 = entrada.nextDouble();
        
        System.out.println("Escolha a opera��o:");
        System.out.println("1 - M�dia entre os n�meros digitados");
        System.out.println("2 - Produto (multiplica��o) entre os n�meros digitados");
        System.out.println("3 - Divis�o do primeiro pelo segundo");
        System.out.println("4 - Diferen�a do maior pelo menor");
        
        int escolha = entrada.nextInt();
        
        switch (escolha) {
            case 1:
                double media = (numero1 + numero2) / 2;
                System.out.println("A m�dia entre os n�meros �: " + media);
                break;
            case 2:
                double produto = numero1 * numero2;
                System.out.println("O produto entre os n�meros �: " + produto);
                break;
            case 3:
                if (numero2 != 0) {
                    double divisao = numero1 / numero2;
                    System.out.println("A divis�o do primeiro pelo segundo �: " + divisao);
                } else {
                    System.out.println("Erro: divis�o por zero");
                }
                break;
            case 4:
                double diferenca = Math.abs(numero1 - numero2);
                System.out.println("A diferen�a do maior pelo menor �: " + diferenca);
                break;
            default:
                System.out.println("Erro: Op��o inv�lida");
        }
       
        entrada.close();
    }
}
