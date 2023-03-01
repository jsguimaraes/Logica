import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] M = new int[10][10];
        
        M[4][5] = 5;
        int posL = 4;
        int posC = 5;
        
        
        
        while(true){
            
            for(int i = 0; i < M.length; i++){
                for(int j = 0; j < M[i].length; j++){
                    System.out.print(M[i][j] + " ");
                }
                System.out.println();
            }
            
            
            
            System.out.println("Digite uma das letras W A S D para mover o 5: ");
            String letra = in.next().toUpperCase();
            
            M[posL][posC] = 0;
            
            switch(letra){
                case "W":
                    
                    posL = posL -1;
                    if(posL == -1){
                        posL = 9;
                    }
                     
                     break;
                    
                case "A":
                    
                    posC = posC -1;
                    if(posC == -1){
                        posC = 9;
                    }
                     
                     break;
                    
                case "S":
                   
                    posL = posL +1;
                    if(posL == +1){
                        posL = 0;
                    }
                     
                     break;
                     
                case "D":
                    
                    posC = posC +1;
                    if(posC == +1){
                        posL = 0;
                    }
                     
                     
                     break;
            }
            
            M[posL][posC] = 5;
            
            
            
        }
    }
}