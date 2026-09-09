import java.util.Scanner;

public class EXERC3 {
    public static void main (int[] args) {
   
        Scanner entrada = new Scanner(System.in);
    
    
        System.out.println("Digite o primeiro número inteiro");
        int num1 = entrada.nextInt();
    
        System.out.println("Digite o segundo número inteiro");
        int num2 = entrada.nextInt();
    
        int produto = num1 * num2;
        
        System.out.println("O produto é: " + produto);
        entrada.close();
}
}
