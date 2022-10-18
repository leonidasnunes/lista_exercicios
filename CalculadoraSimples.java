import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int operacao;
        
        System.out.println("Digite o primeiro número");
        numero1 = input.nextInt();

        System.out.println("Digite o segundo número");
        numero2 = input.nextInt();

        System.out.println("Escola qual operação você vai querer fazer. Digite 1-Soma, 2- Subtração, 3- Multiplicação e 4-Divisão");
        operacao = input.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        if( operacao == 1){
            System.out.println("Você escolheu a opção de Soma, então o valor total é: "+soma);

        }else if(operacao == 2){
            System.out.println("Você escolheu a opção de Subtração, então o valor total é: "+subtracao);
            
        }else if(operacao == 3){
            System.out.println("Você escolheu a opção de Multiplicar, então o valor total é: "+multiplicacao);
            
        }else{
            System.out.println("Você escolheu a opção de Multiplicar, então o valor total é: "+divisao);
            
        }
        



        input.close();
    }
}
