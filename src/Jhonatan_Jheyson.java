
import java.util.Scanner;



public class Jhonatan_Jheyson {
 
    String modelo;
    String marca;
    int ano;
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println(" Ol� Marcelo ! ");
        System.out.println(" Jhonatan Jheyson ");
        System.out.println(" Salve e me envie o resultado!"); 
        System.out.println(" Fazer um teste ");
        System.out.println(" Quero acerta esse trem ");
        Jhonatan_Jheyson jj=new Jhonatan_Jheyson();
        jj.solicitarInfo();
        jj.exibirInfo();
    }
    
    void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("--------------------");
}
    void solicitarInfo() {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a marca do ve�culo: ");
        marca = leia.nextLine();
        System.out.print("Digite o modelo: ");
        modelo = leia.nextLine();
        System.out.print("Digite o ano: ");
        ano = leia.nextInt();  
}
}