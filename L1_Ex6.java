import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
       float a, b, media;
       
       System.out.println("Digite as duas notas do aluno");
       
       a = in.nextFloat();
       b = in.nextFloat();
       media = (a + b)/2;
       
       System.out.println("A media do aluno é: " + media);
       
        in.close();
         
    }
}