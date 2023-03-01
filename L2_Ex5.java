import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite dois valores Reais");
        
        float a, b, divisao;
        
        a = in.nextFloat();
        b = in.nextFloat();
        divisao = a / b;
        
        
        if(b != 0){
            System.out.println("O resultado é: " + divisao);
            
        } else{
            System.out.println("ERRO");
        }
        in.close();
        
    }
}