import java.util.Scanner;

public class ProgramaMedia {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;

        System.out.println("Por favor enserir a sua Nota 1!");
        nota1 = input.nextInt();

        System.out.println("Por favor enserir a sua Nota 2!");
        nota2 = input.nextInt();

        System.out.println("Por favor enserir a sua Nota 3!");
        nota3 = input.nextInt();

        double media = (nota1 + nota2 + nota3) /3;

        if( media >= 9.0){
            System.out.println("Parabéns você foi aprovado e tirou uma nota A!");

        }else if(media >= 7.5 && media <= 9.0){
            System.out.println("Parabéns você foi aprovado e tirou uma nota B!");
            
        }else if(media >= 6.0 && media <= 7.5){
            System.out.println("Parabéns você foi aprovado e tirou uma nota C, estudar mais da próxima vez!");
            
        }else if(media <= 4.0 && media <= 6.0){
            System.out.println("Infelizmente você foi reprovado e tirou a no D, estudar mais da próxima vez!");
            
        }else{
            System.out.println("Infelizmente você foi reprovado e tirou a no E, estudar mais da próxima vez!");
            
        }

        input.close();
    }
}
