import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        int [][] M = new int[5][5];
        
        M[2][3] = 5;
        int posL = 2;
        int posC = 3;
        
        
        
        while(true){
            
            for(int i = 0; i < M.length; i++){
                for(int j = 0; j < M[i].length; j++){
                    System.out.print(M[i][j] + " ");
                }
                System.out.println();
            }
            
            
            
            System.out.println("Digite uma das letras W A S D para mover o 5: ");
            char letra = in.next().charAt(0);
            
            
           switch(letra){
                case 'W':
                    M[posL][posC] = 0;
                    posL = posL -1;
                    if(posL == -1){
                        posL = 4;
                    }
                     M[posL][posC] = 5;
                     break;
                    
                case 'A':
                    M[posL][posC] = 0;
                    posC = posC -1;
                    if(posC == -1){
                        posC = 4;
                    }
                     M[posL][posC] = 5;
                     break;
                    
                case 'S':
                    M[posL][posC] = 0;
                    posL = posL +1;
                    if(posL == +1){
                        posL = 0;
                    }
                     M[posL][posC] = 5;
                     break;
                     
                case 'D':
                    M[posL][posC] = 0;
                    posC = posC +1;
                    if(posC == +1){
                        posL = 0;
                    }
                     M[posL][posC] = 5;
                     
                     break;
                
                    
                    
            }    
            
            
            
        }
    }
}