import java.util.Scanner;
public class exerc11 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o ano de nascimento:");
    int anoNasc = entrada.nextInt();

    System.out.println("Digite o ano atual:");
    int anoAtual = entrada.nextInt();

    int idadeAtual = anoAtual - anoNasc;
    int idade2030 = 2030 - anoNasc;

    System.out.println("A idade atual é: " + idadeAtual + " anos.");
    System.out.println("Em 2030, essa pessoa terá: " + idade2030 + " anos.");
    
    entrada.close();
    }
}