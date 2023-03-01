import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite os elementos da sua matriz");
        
        int [][] A = new int [3][3];
        
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                A[i][j] = in.nextInt();
            }
        }
        
        for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               if(A[i] == A[j]){
                   System.out.print(A[i][j]);
               }
           }
           System.out.println();
        }
   
    }
}