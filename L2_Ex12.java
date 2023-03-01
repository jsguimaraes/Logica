import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o numero de maças compradas:");
        
        float a;
        a = in.nextFloat();
        
        if ( a < 12) {
            a = a * 1.50f;
        } else {
            a = a *1.30f;
        }
        System.out.printf("O custo total da compra foi: R$%.2f\n ", a);
        
        in.close();
    }
}