import java.util.Scanner;

public class L3_Ex5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Digite as cordenadas A, B e C:"); 
        float a, b, c, somaAB, somaBC, somaAC;

         a = in.nextFloat();
         b = in.nextFloat();
         c = in.nextFloat();

         somaAB = a + b;
         somaBC = b + c;
         somaAC = a + c;

         if ( a < somaBC && b < somaAC && c < somaAB){
            System.out.println("É um triangulo");
         } else {
            System.out.println("Não é um triangulo");
         }

         in.close();
    }    
}
