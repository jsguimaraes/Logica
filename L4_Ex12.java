import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um valor para saber se é multiplo de 5");
        
        int valor, contador;
        float div;
        
        valor = in.nextInt();
        
        while((valor%5) !=0){
            System.out.println("Digite digite outro valor");
            valor = in.nextInt();
            
            if((valor%5) == 0){
                System.out.println("O valor digitado é multiplo de 5: " + valor);
            }
        }
        
    }
}