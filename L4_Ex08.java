import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o N° total de mercadorias:");
        
        int nTotalMerc, contador;
        float valorMerc, valorTotal, media;
        
        nTotalMerc = in.nextInt();
        valorTotal = 0;
        contador = 0;
        
        while(contador < nTotalMerc){
            System.out.println("Digite o valor do produto:");
            valorMerc = in.nextFloat();
            valorTotal = valorTotal + valorMerc;
            contador ++;
        }
        
        media = (valorTotal/nTotalMerc);
        System.out.printf("O valor total em mercadorias no estoque é: R$ %.2f \nE a média de valores das mercadorias é: R$ %.2f", valorTotal, media);
        
    }
}