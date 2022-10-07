import java.util.Scanner;
public class salarioDesconto {
    public static void main(String[] Args){
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário
        no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        salário bruto.
        quanto pagou ao INSS.
        quanto pagou ao sindicato.
        o salário líquido.
        calcule os descontos e o salário líquido, conforme a tabela abaixo:*/

        Scanner ler = new Scanner(System.in);
        System.out.println("Diga seu salario por hora ");
        double salarioHora = ler.nextDouble();
        System.out.println("Diga a quantidade de horas trabalhadas ");
        double Horas = ler.nextDouble();
        double salario = salarioHora*Horas;
        // agora os descontos
        double IR = salario*11/100;
        double INSS = salario*8/100;
        double SIND = salario*5/100;
        double salarioLiquid = salario - IR - INSS - SIND;

        System.out.println("seu salário bruto é "+salario +" R$");
        System.out.println("Descontos");
        System.out.println("IR(11%): "+IR);
        System.out.println("INSS(8%):"+INSS+" R$");
        System.out.println("SIND(5%) "+SIND+" R$");
        System.out.println("Seu salario liquido é "+salarioLiquid+" R$");

    }
}
