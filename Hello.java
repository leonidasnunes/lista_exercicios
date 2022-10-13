import java.util.Scanner;

public class Hello {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //variaveis

        String nome_completo;
        int mes_aniversario;
        int dia_aniversario;
        int ano_aniversario;
        int ano_atual = 2022;

        System.out.println("Olá usuário, por favor informe seu nome");
        nome_completo = input.nextLine();

        System.out.println("Qual é o dia do seu nascimento");
        dia_aniversario = input.nextInt();

        System.out.println("Digite seu mês aniversário");
        mes_aniversario = input.nextInt();

        System.out.println("Digite seu ano do nascimento");
        ano_aniversario = input.nextInt();

        int idade = ano_atual - ano_aniversario;

        System.out.println("Seja bem vindo "+nome_completo);
        System.out.println(" Você tem "+idade+" anos!");
        



        input.close();
    }
}
