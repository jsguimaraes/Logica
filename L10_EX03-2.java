import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] M = new int[5][5];
        
        System.out.println("Digite os numeros da sua matriz 5x5: ");
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = in.nextInt();
            }
        }
        
        int numero = 0;
        
        while(true){
            System.out.println("Digite um numero qualquer: \nCaso Digite um valor negativo voce finalizara o programa.");
            
            numero = in.nextInt();
            
            if(numero < 0){
                System.out.println("voce encerrou o programa");
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
                System.out.println("TEM NA MATRIZ ");
            } else {
                System.out.println("NÃO TEM NA MARIZ ");
            }
        }
    }
}