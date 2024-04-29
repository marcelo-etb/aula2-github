
import java.util.Scanner;
public class LaísIvana {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double numero1 = entrada.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double numero2 = entrada.nextDouble();
        
        System.out.println("Escolha a operação:");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Produto (multiplicação) entre os números digitados");
        System.out.println("3 - Divisão do primeiro pelo segundo");
        System.out.println("4 - Diferença do maior pelo menor");
        
        int escolha = entrada.nextInt();
        
        switch (escolha) {
            case 1:
                double media = (numero1 + numero2) / 2;
                System.out.println("A média entre os números é: " + media);
                break;
            case 2:
                double produto = numero1 * numero2;
                System.out.println("O produto entre os números é: " + produto);
                break;
            case 3:
                if (numero2 != 0) {
                    double divisao = numero1 / numero2;
                    System.out.println("A divisão do primeiro pelo segundo é: " + divisao);
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;
            case 4:
                double diferenca = Math.abs(numero1 - numero2);
                System.out.println("A diferença do maior pelo menor é: " + diferenca);
                break;
            default:
                System.out.println("Erro: Opção inválida");
        }
       
        entrada.close();
    }
}
