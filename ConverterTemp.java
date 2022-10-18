import java.util.Scanner;

public class ConverterTemp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double Celsius;
        double Fahrenheit;
        double Kelvin;

        System.out.println("Seja bem-vindos vamos converter algumas temperaturas!");

        System.out.println("Informe uma temperatura em Celsius para convertermos para Fahrenheit.");
        Celsius = input.nextDouble();

        Fahrenheit = ( Celsius * 9/5) + 32;

        System.out.println("Sua temperatura convertida em Fahrenheit é de: "+Fahrenheit);

        System.out.println("Informe uma temperatura em Kelvin para convertermos para Celsius.");
        Kelvin = input.nextDouble();

        Celsius = Kelvin - 273.15;

        System.out.println("Sua temperatura convertida em Celsius é de: "+Celsius);

        System.out.println("Informe uma temperatura em Fahrenheit para convertermos para Kelvin.");
        Fahrenheit = input.nextDouble();

        Kelvin = (Fahrenheit * 9/5) + 32;

        System.out.println("Sua temperatura convertida em Kelvin é de: "+Kelvin);

       


        input.close();
        }
    }