import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] M = new int[3][3];
        
        System.out.println("Informe os valores da sua matriz 5x5:");
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Informe um valor X qqlqer: ");
        
        int valorX = in.nextInt();
        
        
        for(int i = 0; i < M.length; i++){
            int soma = 0;
            for(int j = 0; j < M[i].length; j++){
                soma = soma + M[i][j];
                
            }
            if(valorX == soma){
                System.out.println("A Soma dos elementos da linha " + i + " É o mesmo do Valor X Informado: " + valorX);
            }else{
                System.out.println("Nenhuma Linha Soma o Valor Informado ");
            }
        }
        
        
    }
}