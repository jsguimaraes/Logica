import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] m = new int [10][10];
        
        System.out.println("Digite os Valores de sua matriz 10x10: ");
        
         for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = in.nextInt();
            }
        }
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i] == m[j]){
                    System.out.print("-");
                }else{
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}