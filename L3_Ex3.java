import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite 3 valores quaisquer, desde que sejam diferentes:\n");
        
        int a, b, c, soma;
        
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        if (a > b && b > c){
            soma = a + b;
            System.out.println("A soma dos maiores é: " + soma);
        } else if(a > b && c > b){
            soma = a + c;
            System.out.println("A soma dos maiores é: " + soma);
        } else if(c > a && b > a){
            soma = c + b;
            System.out.println("A soma dos maiores é: " + soma);
        }
        in.close();
    }
}