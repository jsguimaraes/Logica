import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int tamanhoL = 2;
        int tamanhoC = 3;
        int [][] mA = new int [tamanhoL][tamanhoC];
        int [][] mB = new int [tamanhoL][tamanhoC];
        
        
        System.out.println("Digite os valores de sua matriz A 3x3: ");
        for(int i = 0; i < mA.length; i++){
            for(int j = 0; j < mA[i].length; j++){
                mA[i][j] = in.nextInt();
                
            }
        }
        
        System.out.println("Digite os valores de sua matriz B 3x3: ");
        for(int i = 0; i < mB.length; i++){
            for(int j = 0; j < mB[i].length; j++){
                mB[i][j] = in.nextInt();
                
            }
        }
        
        int [][] somaM = new int [tamanhoL][tamanhoC];
        
        for(int i = 0; i < somaM.length; i++){
            for(int j = 0; j < somaM[i].length; j++){
                somaM[i][j] = mA[i][j] + mB[i][j];
            }
        }
        
        for(int i = 0; i < somaM.length; i++){
            for(int j = 0; j < somaM[i].length; j++){
                System.out.print(somaM[i][j] + " ");
            }
            System.out.println();
        }
    }
}