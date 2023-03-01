import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite as dimensões do retangulo (base e altura)");
        
        float base, altura, area, perimetro;
        
        base = in.nextFloat();
        altura = in.nextFloat();
        area = base * altura;
        perimetro = (base + altura) * 2;
        
        System.out.printf("Area: %.1f\nPerimetro:: %.1f\n", area, perimetro);
        
        in.close();
        
    }
}