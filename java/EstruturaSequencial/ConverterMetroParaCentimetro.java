import java.util.Scanner;
public class ConverterMetroParaCentimetro {
    public static void main(String[] args) {
        /*Faça um Programa que converta metros para centímetros.*/
        Scanner ler = new Scanner(System.in);
        double metro = ler.nextDouble();
        double centimetro = metro*100;
        System.out.println(metro+"m = "+centimetro+"cm");
    }
}
