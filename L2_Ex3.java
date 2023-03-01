import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite qualquer valor:");
        
        int valor;
        valor = in.nextInt();
        
        if(valor >= 0){
            System.out.printf("%d O valor digitado é POSITIVO\n", valor);
        } else{
            System.out.printf("%d O valor digitado é NEGATIVO\n", valor);
        }
        in.close();
    }
}