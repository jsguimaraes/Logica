import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] M = new int [4][4];
        
        System.out.println("Digite os elementos da sua matriz");
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                M[i][j] = in.nextInt();
            }
        }
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i >= j){
                    System.out.print(" ");
                } else{
                    System.out.print(M[i][j]);
                }
            }
            System.out.println();
        }
        
    }
}