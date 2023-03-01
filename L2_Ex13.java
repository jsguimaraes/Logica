import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite as notas das Avalicões 1 e 2");
        
        float av1, av2, media;
        
        av1 = in.nextFloat();
        av2 = in.nextFloat();
        media = (av1 + av2) / 2;
        
        if (media >= 6){
            System.out.printf("A sua média é:%.2f APROVADO\n", media);
        } else {
            System.out.printf("A sua média é:%.2f REPROVADO\n", media);
        }
        in.close();
    }
}