import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int linhas = 0;
        int colunas = 0;
        
        
        while(true){
            System.out.println("Digite o numero de linhas da sua matriz (minimo 1 e maximo 10");
            linhas = in.nextInt();
            
            if(linhas > 0 && linhas < 10){
                break;
            }
                
        }
        
        while(true){
            System.out.println("Digite o numero de colunas da sua matriz (minimo 1 e maximo 10");
            colunas = in.nextInt();
            
            if(colunas > 0 && colunas < 10){
                break;
            }
                
        }
        
        int [][] M = new int[linhas][colunas];
        
        System.out.println("Digite os numeros de sua matriz");
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length;j++){
                M[i][j] = in.nextInt();
            }
        }
        
        int valor = 0;
        
        while(true){
            System.out.println("Digite um valor qualquer : \nCaso Digite um valor NEGATIVO voce irá encerrar o programa.");
            valor = in.nextInt();
            if(valor < 0){
                System.out.println("VOCE ENCERROU O PROGRAMA");
                break;
            }
            
            boolean achou = false;
            
            for(int i = 0; i < M.length; i++){
                for(int j = 0; j < M[i].length;j++){
                    if(valor == M[i][j]){
                        achou = true;
                        break;
                    }
                }
            }
            
            
            if(achou){
                System.out.println("TEM NA MATRIZ");
            } else{
                System.out.println("NÃO TEM NA MATRIZ");
            }
            
        }
    }
}