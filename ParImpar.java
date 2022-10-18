import java.util.Scanner;

public class ParImpar {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

    int numero;

    System.out.println("Digite qual quer número para irformamos se ele é um número par ou impar!");
    numero = input.nextInt();

    if ( numero % 2 == 0){
        System.out.println("Parabéns o numero que você digitou é um numero par!");

    }else{ 
        System.out.println("Seu número é ímpar!");
    }
    
        input.close();
    }
}
