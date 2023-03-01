import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] A = new int [3][3];
        int [][] B = new int [3][3];
        int [][] SOMA = new int [3][3];
        
        System.out.println("Digite o os numeros da matriz A 3x3: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                A [i][j] = in.nextInt();
            }
        }
        
        System.out.println("Digite o os numeros da matriz B 3x3: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                B [i][j] = in.nextInt();
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                SOMA[i][j] = A [i][j] + B[i][j];
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(SOMA [i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
    