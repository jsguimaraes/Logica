import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        
        int [][] A = {
            {0, 1, 2},
            {4, 0, 1}
        };
        
        int [][] B = {
            {4, 2, 3},
            {3, 5, 9}
        };
        
        int [][] SOMA = new int [2][3];
        
        for(int i = 0; i < 2; i++){
            for( int j = 0; j < 3; j++){
                SOMA[i][j] = A[i][j] + B[i][j];
            }
        }
        
        for(int i = 0; i < 2; i++){
            for( int j = 0; j < 3; j++){
                System.out.print(SOMA [i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}