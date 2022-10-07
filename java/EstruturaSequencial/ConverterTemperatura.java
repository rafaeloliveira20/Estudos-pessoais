import java.util.Scanner;
import java.text.DecimalFormat;
public class ConverterTemperatura {
    public static void main(String[] args) {
       /*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
        C = 5 * ((F-32) / 9).*/ 
        System.out.println("Diga a temperatura em graus Fahrenheit ");
        Scanner ler = new Scanner(System.in);
        double F = ler.nextDouble();
        double C = 5*((F-32)/9);
        System.out.println("Convertendo para Celsius fica: ");
        System.out.println(C);

        DecimalFormat arredondar = new DecimalFormat("0.00"); // Arredondar números, importe o java.text.DecimalFormat;
        System.out.println(arredondar.format(C));

    }
    
}
