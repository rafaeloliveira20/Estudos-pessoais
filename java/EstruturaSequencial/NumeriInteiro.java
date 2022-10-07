import java.util.Scanner;
public class NumeriInteiro {
    public static void main(String[] args) {
        /*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
            o produto do dobro do primeiro com metade do segundo .
            a soma do triplo do primeiro com o terceiro.
            o terceiro elevado ao cubo.*/
            System.out.println("diga o valor de dois números inteiros");
            Scanner ler = new Scanner(System.in);
            int a = ler.nextInt();
            int b = ler.nextInt();
            System.out.println("E agora o valor de um número real");
            double c = ler.nextDouble();
            double A = 2*a + (double)b/2;
            System.out.println(A);
            double B = 3*a + c;
            System.out.println(B);
            System.out.println(Math.pow(c,3));

            //mais tarde concerto o código
    }
    
}
