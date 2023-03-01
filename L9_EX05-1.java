import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        Random r = new Random();
        
        int [][] M = new int[4][4];
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                int numero = r.nextInt(100);
                M[i][j] = numero;
            }
        }
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                if(i > j){
                    System.out.print(M[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}