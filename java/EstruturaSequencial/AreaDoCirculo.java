import java.util.Scanner;
public class AreaDoCirculo {
    public static void main(String[] args) {
        /*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.*/
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Digite o raio do circulo");
        double raio = teclado.nextDouble();
        double area = pi*Math.pow(raio, 2);
        System.out.println("A área do circulo é: "+area+" ua");
    }
    
}
