import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        float a, b;
        
         a = in.nextFloat();
         b = (a * 0.20f) + a;
         
         System.out.println("Valor atualizado com os 20%: " + b);
         
         in.close();
         
    }
}