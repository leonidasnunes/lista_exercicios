import java.util.Scanner;

public class ProgramaSoma {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Variáveis

    int A;
    int B;

    System.out.println("Digite um valor A!");
    A = input.nextInt();

    System.out.println("Digite o valor B");
    B = input.nextInt();

    System.out.println("Se seu número A for maior iremos somar mais o número B. Caso seu número B for maior mutiplicaremos pelo número A.");

    int soma = A + B;
    int multi = B * A;

    if (A >= B){
        System.out.println("O número maior informado foi A então valor total é: "+soma);
            
    }else{
        System.out.println("O número maior informado foi B então valor total é: "+multi);    
        
    }

        input.close();
    }
}
