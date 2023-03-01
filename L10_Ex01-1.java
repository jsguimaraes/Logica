import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        
        int [][] M = new int [4][4];
        
        System.out.println("Digite os elementos de sua matriz 4x4: ");
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j <M[i].length; j++){
                
                M[i][j] = in.nextInt();
                
            }
        }
        
        int somaL = 0;
        int somaC = 0;
        int Dp = 0;
        int Ds = 0;
        int somaTotal = 0;
        
        for(int i = 0; i < M.length; i++){
            somaL += M[1][i];
            somaC += M[i][0];
            Dp += M[i][i];
            Ds += M[i][3 - i];
        }
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                
                somaTotal += M[i][j];
            }
        }
        
        System.out.println("A soma da segunda linha da matriz é: " + somaL);
        System.out.println("A soma da primeira coluna da matriz é: " + somaC);
        System.out.println("A soma da Diagonal Principal da matriz é: " + Dp);
        System.out.println("A soma da Diagonal Secundaria da matriz é: " + Ds);
        System.out.println("A soma TOTAL da matriz é: " + somaTotal);
    }
}