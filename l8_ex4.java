import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println(" Digite 10 valores:");
        
        int [] v = new int[10];
        
        for(int i = 0; i < v.length; i++){
            v[i] = in.nextInt();
        }
        System.out.println();
        
        System.out.println("VALORES PAR DO SEU VETOR");
        for(int i = 0; i < v.length; i++){
            if(v[i] %2 == 0){
               System.out.print(v[i] + " "); 
            }
        }
        System.out.println();
        
        System.out.println("VALORES IMPAR DO SEU VETOR");
        for(int i = 0; i < v.length; i++){
            if(v[i] %2 != 0){
               System.out.print(v[i] + " "); 
            }
        }
    }
}