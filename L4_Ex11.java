import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite dois valores:");
        
        int contador;
        float n1, n2, div;
        
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        
        while(n2 == 0){
            System.out.println("Digite outro valor para para segunda entrada:");
            
            n2 = in.nextFloat();
        }
        
        div = (n1 / n2);
        
        System.out.println("A divisão do primeiro valor pelo segundo valor é: " + div);
        
        
    }
}