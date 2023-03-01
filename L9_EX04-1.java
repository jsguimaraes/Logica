import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        Random r = new Random();
        
        int [][] m = new int [10][10];
            
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                int numero = r.nextInt(100);
                m[i][j] = numero;
                
            
            }
        }
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(i < j){
                    System.out.print(m[i][j] + " ");
                }
                
            }
            System.out.println();
        }
        
        
    }
}