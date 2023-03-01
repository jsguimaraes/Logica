import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o valor de n:");
        int n, soma, contador;
        n = in.nextInt();
        soma = 0;
        contador = 1;
        
        while (contador <= n){
            soma = soma + contador;
            contador++;
            System.out.println("A soma é: " + soma);
        }
        
        in.close();
        
    }
}