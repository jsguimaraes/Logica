import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
       float distancia, velocidade, tempo;
       
       System.out.println("Digite a distância, seguido a velocidade media:");
       
       distancia = in.nextFloat();
       velocidade = in.nextFloat();
       tempo = (distancia / velocidade) * 60;
       
       System.out.println("O tempo de viagem em minutos é: " + tempo);
       
        in.close();
         
    }
}