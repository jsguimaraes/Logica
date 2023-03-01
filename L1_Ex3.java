import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int a, b;
        
        a = in.nextInt();
        b = a * a;
        
        System.out.println("O quadrado do numero digitao é: " + b);
        
        in.close();
         
    }
}