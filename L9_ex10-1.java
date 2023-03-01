import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] M = new int[5][5];
        
        System.out.println("Digite os numeros da sua matriz 10x10: ");
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = in.nextInt();
            }
        }
        
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        int [] guardaLinha = new int[5];
        int [] guardaColuna = new int[5];
        int [] guardaDiagonal = new int[5];
        
        
        for(int j = 0; j < M.length; j++){
            guardaLinha[j] = M[1][j];
            M[1][j] = M[3][j];
            M[3][j] = guardaLinha[j];
            
        }
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < M.length; i++){
            guardaColuna[i] = M[i][0];
            M[i][0] = M[i][2];
            M[i][2] = guardaColuna[i];
            
        }
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < M.length; i++){
            guardaDiagonal[i] = M[i][i];
            M[i][i] = M[i][4 - i];
            M[i][4 - i] = guardaDiagonal[i];
        }
    }
}