public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o primeiro número");
    int n1 = entrada.nextInt();
    
    System.out.println("Digite o segundo número");
    int n2 = entrada.nextInt();
    
    System.out.println("digite o terceiro número");
    int n3 = entrada.nextInt();

    System.out.println("Digite o quarto número");
    int n4 = entrada.nextInt();

    int soma = n1 + n2 + n3 + n4;

    System.out.println("A soma dos quatro números é: " + soma);
        
    entrada.close();
    }