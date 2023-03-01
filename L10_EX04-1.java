import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int numeroL = 0;
        while(true){
            System.out.println("Digite o numero de linhas da sua matriz minimo 1 maximo 10");
            numeroL = in.nextInt();
            
            if(numeroL > 0 && numeroL < 11){
                break;
            }
        }
        
        int numeroC = 0;
        while(true){
            System.out.println("Digite o numero de colunas da sua matriz minimo 1 maximo 10");
            numeroC = in.nextInt();
            
            if(numeroC > 0 && numeroL < 11){
                break;
            }
        }
        
        int [][] M = new int[numeroL][numeroC];
        
        System.out.println("Digite os numeros da sua matriz:");
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = in.nextInt();
            }
        }
        
        int [] SL = new int[numeroL];
        int [] SC = new int[numeroC];
        
        for(int i = 0; i < M.length; i++){
            int somaL = 0;
            for(int j = 0; j < M[i].length; j++){
                somaL += M[i][j];
            }
            SL[i] = somaL;
        }
        
        for(int j = 0; j < M[0].length; j++){
            int somaC = 0;
            for(int i = 0; i < M.length; i++){
                somaC += M[i][j];
            }
            SC[j] = somaC;
        }
        
        for(int i = 0; i < SL.length; i++){
            System.out.print(SL[i] + " ");
        }
        for(int i = 0; i < SC.length; i++){
            System.out.print(SC[i] + " ");
        }
        
    }
}