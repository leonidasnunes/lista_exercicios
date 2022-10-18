import java.util.Scanner;


public class Somasimples {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        int primeiro_valor;
        int segundo_valor;
       
        System.out.println("Digite um primeiro valor para fazermos uma soma");
        primeiro_valor = input.nextInt();

        System.out.println("Digite agora um segundo valor para fazermos a soma");
        segundo_valor = input.nextInt();

        int soma = primeiro_valor + segundo_valor;


        System.out.println("O valor total é: "+soma );


        input.close();
    }
}
