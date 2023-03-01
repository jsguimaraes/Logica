import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Digite em metros para obter em centimetros");
    
    float metro, centimetro;
    
    metro = in.nextFloat();
    centimetro = metro * 100;
    
    System.out.printf("%.1f cm\n", centimetro);
    in.close();
    
    }
}