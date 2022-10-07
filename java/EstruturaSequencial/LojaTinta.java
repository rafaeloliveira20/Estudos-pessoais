import java.util.Scanner;
public class LojaTinta {
    public static void main(String[] args) {
        /*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área
        a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta
        é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta
        a serem compradas e o preço total.*/

        Scanner ler = new Scanner(System.in);
        System.out.println("Diga o tamanho em metros da área a ser pintada ");
        double area = ler.nextDouble();
        double litrosGastos = area/3;
        final double precoLata = 80;
        final double litroLata = 18;
        double nlitros = area/3;
        double nlatas = (int) nlitros/18;
        if(nlitros%18 >0){
           nlatas = nlatas + 1;
           System.out.println("O número de latas será "+nlatas+" unidades");
           System.out.println("O preço total será de "+nlatas*precoLata+" R$");
        }else{
            System.out.println("O número de latas será "+nlatas);
            System.out.println("O preço total será de "+nlatas*precoLata+" R$");
        }
        //System.out.println(nlatas);
        //System.out.println("o Preço é " +nlatas*80+" R$");
    }
    
}
