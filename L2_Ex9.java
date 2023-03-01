import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o Raio da Circunferencia");
        
        float raio, diametro, comprimento, area, pi;
        
        raio = in.nextFloat();
        pi = 3.141692f;
        diametro = (2 * raio);
        comprimento = (2 * pi * raio);
        area = (pi * raio * raio);
        
        System.out.printf("Diamentro: %.2f\nComprimento: %.2f\nArea: %.2f\n", diametro, comprimento, area);
        
        in.close();
    }
}