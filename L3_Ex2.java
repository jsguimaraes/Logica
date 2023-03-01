import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite 3 valores quaisquer, desde que sejam diferentes:\n");
        
        int a, b, c;
        
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        if (a > b && a > c){
            System.out.println("O maior valor é: " + a);
        } else if(b > a && b > c){
            System.out.println("O maior valor é: " + b);
        } else{
            System.out.println("O maior valor é: " + c);
        }
        in.close();
    }
}