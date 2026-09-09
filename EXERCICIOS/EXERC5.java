import java.util.Scanner;

public class EXERC5 {
public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a primeira nota:");
    double n1 = entrada.nextDouble();

    System.out.println("Digite a segunda nota:");
    double n2 = entrada.nextDouble();

    System.out.println("Digite a terceira nota:");
    double n3 = entrada.nextDouble();

    double media = (n1 + n2 + n3) / 3;

    System.out.println("A média aritmética é: " + media);
    entrada.close();
}

}
