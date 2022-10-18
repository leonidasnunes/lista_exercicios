import java.util.Scanner;

public class ProgramaDobroTriplo {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número positivo ou negativo. Caso seu número seja negativo iremos triplicar ele, e caso seja positivo iremos dobrar o valor.");
        numero = input.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;

	if (numero < 0) {
        System.out.println("O valor digitado foi Negativo! Então o tripo dele é: "+triplo);
	
	} else {
        System.out.println("O valor digitado foi Positivo! Então o dobro dele é: "+dobro);
	}


        input.close();
    }
}
