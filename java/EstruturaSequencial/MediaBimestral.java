import java.util.Scanner;
public class MediaBimestral {
    public static void main(String[] args) {
        /*Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite as notas");
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();
        double n4 = ler.nextDouble();
        double media = (n1+n2+n3+n4)/4;
        System.out.println("a média das notas bimestrais é: "+media);
        
    }
}
