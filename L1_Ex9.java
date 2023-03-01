import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
       float homens, mulheres, criancas, total;
       
       System.out.println("Digite o numero homens, mulheres e crianças a serem convidados:");
       
       homens = in.nextFloat();
       mulheres = in.nextFloat();
       criancas = in.nextFloat();
       
       total = ((homens * 0.40f) + (mulheres * 0.32f) + (criancas * 0.20f)) * 1.2f;
      
       
       System.out.printf("O total de carne a ser comprado é:%.2fKG%s", total);
       
        in.close();
         
    }
}