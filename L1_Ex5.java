import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        float F, temperatura;
        
        F = in.nextFloat();
        temperatura = (F - 32) *5/9;
        
        System.out.println("A temperatura de °F convertida para °C é: " + temperatura);
        
       
        in.close();
         
    }
}