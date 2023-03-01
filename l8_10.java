import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int [] v1 = new int[10];
        int [] v2 = new int[10];
        
        System.out.println("digite os 10 valores de v1");
        for( int i = 0; i < v1.length; i++){
            System.out.println("informe o " + i + " valor");
            v1[i] = in.nextInt();
            v2[i] = v1[i] + v2[i];
        }
        for(int i = 1; i < v1.length; i++){
            v2[i] = v2[i - 1] + v1[i];
        }
        
        for(int i = 0; i < v2.length; i++){
            System.out.print(v2[i] + " ");
        }
    }
}