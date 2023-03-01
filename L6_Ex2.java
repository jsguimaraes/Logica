import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro POSITIVO");
        
        int inteiro = in.nextInt();
        int pares = 0;
        
        if (inteiro <= 0){
            for(inteiro = 0 ; inteiro <= 0 ; ){
                System.out.println("Digite Novamente");
                inteiro = in.nextInt();
            }   
            
        }
        for(int i = 1 ; i < inteiro ; i++){
            if(i %2 == 0){
                pares = i;
                System.out.println("Os numeros pares são: " + i); 
            }
            
        }
        
        
    }
}