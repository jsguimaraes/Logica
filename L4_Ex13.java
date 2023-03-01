import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite as 3 notas do aluno:");
        
        float n1, n2, n3, media;
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        n3 = in.nextFloat();
        media = 0;
        
        if(n1 >= n2 && n1 >= n3 && n2 >= n3){
            media = (n1 + n2) / 2;
            
        }
        if(n1 >= n3 && n1 >= n2 && n3 >= n2){
            media = (n1 + n3) / 2;
            
        }
        if(n2 >= n3 && n2 >= n1 && n3 >= n1){
            media = (n2 + n3) / 2;
            
        }
        
        System.out.printf("A media entre as duas maiores notas é:%.2f ", media);
    }
}