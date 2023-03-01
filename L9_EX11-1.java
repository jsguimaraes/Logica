import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        float [][] M = new float[4][2];
        
        System.out.println("Digite os valores de vendas semanais 4 semanas durante os 12 meses do ano.");
        
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                
                M[i][j] = in.nextFloat();
                
            }
        }
        
        
        
        float somaAno = 0;
        
        for(int i = 0; i < M.length; i++){
            float somaMes = 0;
            for(int j = 0; j < M[i].length; j++){
                
                somaMes += M[i][j];
                
            }
            System.out.println("A soma do mes " + i + " em reais foi R$ " + somaMes);
        }
        
        for(int j = 0; j < M.length; j++){
            float somaSemana = 0;
            for(int i = 0; i < M[i].length; i++){
                
                somaSemana += M[i][j];
                
            }
            System.out.println("A soma da Semana " + j + " em todo o ano em reais foi R$ " + somaSemana);
        }
        
        
        
    }
}