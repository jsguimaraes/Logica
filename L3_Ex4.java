import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite 3 valores quaisquer, desde que sejam diferentes:\n");
        
        int a, b, c;
        
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        if (a < b && b < c){
            System.out.printf("A ordem crescente é: %d %d %d", a, b, c);
        } else if(a < c && c < b){
            System.out.printf("A ordem crescente é: %d %d %d", a, c, b);
        } else if(b < a && a < c){
            System.out.printf("A ordem crescente é: %d %d %d", b, a, c);
        } else if(b < c && c < a){
            System.out.printf("A ordem crescente é: %d %d %d", b, c, a);
        } else if(c < a && a < b){
            System.out.printf("A ordem crescente é: %d %d %d", c, a, b);
        } else {
            System.out.printf("A ordem crescente é: %d %d %d", c, b, a);
        }
        in.close();
    }
}