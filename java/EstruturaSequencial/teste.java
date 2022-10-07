import java.util.Scanner;
public class teste{
    public static void main(String[] args) {
        for(int i = 1; i<=10;i++){
            for (int j = 1; j <= 10;j++) {
                int p = i*j;
                System.out.println(i+"x"+j+"=" +p);
                
            }
        }
       try (Scanner ler = new Scanner(System.in)) {
        int a = ler.nextInt();
           System.out.println(a);
    }
    }

}