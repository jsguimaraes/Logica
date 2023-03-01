import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        float [] v = new float[10];
        
        System.out.println("Digite os valores do seu veotr");
        for(int i = 0; i < v.length; i++){
            v[i] = in.nextFloat();
        }
        System.out.println("vetor ficou assim");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println("calculando a media dos valores imputados");
        float media = 0f;
        for( int i = 0; i < v.length; i++){
            media += v[i];
        }
        media /= 10;
        System.out.println("media" + media);
    }
}