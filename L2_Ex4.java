import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Digite dois valores distintos");
    int a, b;
    
    a = in.nextInt();
    b = in.nextInt();
    
    if(a > b){
        System.out.println("A variável a é: " + a);
        
    }else{
        System.out.println("A variável b é: " + b);
    }
    
    in.close();
    
    }
}