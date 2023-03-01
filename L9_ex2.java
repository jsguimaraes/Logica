import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da sua matriz: ");
        int tamanho = in.nextInt();
        
        int [][] matriz = new int [tamanho][tamanho];
        
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                if((i%2) == 0 && (j%2) == 0 || (i%2) == 1 && (j%2) == 1){
                    matriz[i][j] = 1;
                }
            }
        }
        
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                System.out.print(matriz [i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}