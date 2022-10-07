import java.util.Scanner;
import java.text.DecimalFormat;
public class pesoIdeal {
    public static void main(String[] args) {
        /*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58*/

        Scanner ler = new Scanner(System.in);
        DecimalFormat arredondar = new DecimalFormat("0.00");

        System.out.println("Diga sua altura ");
        double altura = ler.nextDouble();
        double peso = (72.7*altura)-58;
        System.out.println("Seu peso ideal é: ");
        System.out.println(arredondar.format(peso)+" Kg");

    }
    
}
