import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] M = new int[5][5];
        
        System.out.println("Digite os valores da sua matriz 5x5: ");
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = in.nextInt();
            }
        }
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                if(i == j){
                    M[i][j] = 0;
                }
            }
        }
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}