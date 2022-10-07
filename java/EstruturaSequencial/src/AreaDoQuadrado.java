package src;
import java.util.Scanner;
public class AreaDoQuadrado {
    public static void main(String[] Args){
        /*Faça um Programa que calcule a área de um quadrado,
        em seguida mostre o dobro desta área para o usuário.*/
        Scanner ler = new Scanner(System.in);
        System.out.println("Diga o valor do lado de um quadrado ");
        double l = ler.nextDouble();
        double A = Math.pow(l,2);
        System.out.println("Como a Area do quadrado é " +A+" Seu dobro será: "+2*A);
    }
}
