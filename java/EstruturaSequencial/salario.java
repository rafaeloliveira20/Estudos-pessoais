import java.util.Scanner;
public class salario {
    public static void main(String[] Args){
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês*/
        Scanner ler = new Scanner(System.in);
        System.out.println("Diga o quanto você ganha por hora ");
        int S = ler.nextInt();
        System.out.println("Diga a quantidade de horas trabalhadas por mês");
        int t = ler.nextInt();
        int salario = S*t;
        System.out.println("Seu salário mensal é: "+salario+" Reais");
    }
}