import java.util.Scanner;

public class ProgramaCompra {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int produto = 1000;
        int opcao;
        double quantidade;

        System.out.println("Olá estamos vendendo essa lindo artigo de decoração por R$1.000.");
        
        System.out.println(" Queria saber qual será a forma de pagamento? 1- PIX, À vista ou Cartão Débito; 2- Crédito À vista; 3- Crédito parcelado ");
        opcao = input.nextInt();

        System.out.println("Se você escolheu a opção parcelado digite a quantidade de parcelas desejadas. Se caso não escolheu essa opção digite 0 para continuar");
        quantidade = input.nextDouble();

        int pix = produto-100;
        int credito = produto;
        double parcelado = (produto*0.010)* quantidade + produto;
        

        if( opcao == 1){
            System.out.println("Nessa forma de pagamento temos um desconto de 10%. Seu produto fica por R$ "+pix+" Reais");

        }else if(opcao == 2){
            System.out.println("Nessa forma de pagamento infelizmente não consigo aplicar nenhum desconto, ele vai ficar por R$ "+credito+" Reais");
            
        }else{
            System.out.println("Podemos sim parcelar, o valor do produto ficará por R$ "+parcelado+"0 Reais"); 
        }


        
        input.close();
        }

    }
    

