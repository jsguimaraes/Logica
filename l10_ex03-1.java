import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] M = {
            {1, 2, 3, 5, 6},
            {55, 66, 33, 88, 44},
            {45, 2, 55, 84, 12},
            {21, 33, 1, 23, 5},
            {3, 2, 5, 8, 9}
        };
        
        int numero = 0;
        
        while(true){
            
            System.out.println("Digite um numero: \nCaso digite um numero NEGATIVO voce encerrara o programa." );
            
            numero = in.nextInt();
            if(numero < 0){
                System.out.println("VC FINZALIZOU O PROGRAMA");
                break;
            }
            
            boolean achou = false;
            
            for(int i = 0; i < M.length; i++){
                for(int j = 0; j < M[i].length; j++){
                    
                    if(numero == M[i][j]){
                        achou = true;
                    }
                    
                }
            }
            
            if(achou){
                System.out.println("TEM NA MATRIZ");
            } else {
                System.out.println("NÃO TEM NA MATRIZ");
            }
            
            
        }
        
        
    }
}