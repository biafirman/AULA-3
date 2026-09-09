import java.util.Scanner;
public class exerc12 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
 
    System.out.println("Digite um número:");
    double num = entrada.nextDouble();

    double quadrado = Math.pow(num, 2);
    double cubo = Math.pow(num, 3);
    double raiz = Math.sqrt(num);
    double potencia10 = Math.pow(num, 10);

    System.out.println("Número ao quadrado: " + quadrado);
    System.out.println("Número ao cubo: " + cubo);
    System.out.println("Raiz quadrada: " + raiz);
    System.out.println("Número elevado a 10: " + potencia10);


    entrada.close();
    }
}