import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int linhas = 0;
        int colunas = 0;
        
        while(true){
            System.out.println("Digite o numero de linhas da sua matriz minimo 1 maximo 10");
            linhas = in.nextInt();
            
            if(linhas > 0 && linhas < 11){
                break;    
            }    
        }
        
        while(true){
            System.out.println("Digite o numero de colunas da sua matriz minimo 1 maximo 10");
            colunas = in.nextInt();
            
            if(colunas > 0 && colunas < 11){
                break;    
            }    
        }
        
        int [][] M = new int[linhas][colunas];
        
        System.out.println("Digite os numeros da sua matriz:");
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = in.nextInt();
            }
        }
        
        int [] V = new int[linhas];
        
        
        for(int i = 0; i < M.length; i++){
            int eMaior = 0;
            for(int j = 0; j < M[i].length; j++){
                if(M[i][j] >= eMaior){
                    eMaior = M[i][j];
                }
            }
            V[i] = eMaior;
        }
        for(int i = 0; i < V.length; i++){
            System.out.print(V[i] + " ");
        }
    }
}