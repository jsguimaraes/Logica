import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite dois valores:");
        
        float a, b, soma;
        
        a = in.nextFloat();
        b = in.nextFloat();
        soma = a + b;
        
        if (soma > 20){
            soma = soma + 8;
            System.out.println("O valor da soma somando-se 8 é:" + soma);
        } else {
            soma = soma - 10;
            System.out.println("O valor da soma diminuindo 10 é:" + soma);
        }
        in.close();
    }
}