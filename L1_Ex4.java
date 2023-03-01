import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        float base, altura, area;
        
        base = in.nextFloat();
        altura = in.nextFloat();
        area = (base * altura) / 2;
        
        System.out.println("A Area total dO triangulo é: " + area);
        
        in.close();
         
    }
}