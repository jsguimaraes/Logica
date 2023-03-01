import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] A = new int[3][5];
        int [][] B = new int[3][5];
        int [][] S = new int[3][5];
        int [][] D = new int[3][5];
        
        System.out.println("Digites os valores da matriz A 3x5: ");
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                
                A[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Digites os valores da matriz B 3x5: ");
        
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B[i].length; j++){
                
                B[i][j] = in.nextInt();
            }
        }
        
        for(int i = 0; i < S.length; i++){
            for(int j = 0; j < S[i].length; j++){
                
                S[i][j] = A[i][j] + B[i][j];
                D[i][j] = A[i][j] - B[i][j];
            }
        }
        
        for(int i = 0; i < S.length; i++){
            for(int j = 0; j < S[i].length; j++){
                
                System.out.print(S[i][j] + " ");
                
            }
            System.out.println();
        }
        
        for(int i = 0; i < D.length; i++){
            for(int j = 0; j < D[i].length; j++){
                
                System.out.print(D[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}