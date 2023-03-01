import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
       float votosTotal, votosValido, votosBranco, votosNulo, porValido, porBranco, porNulo;
       
       System.out.println("Digite o numero total de votos, seguigo os votos válidos, brancos e nulos:");
       
       votosTotal = in.nextFloat();
       votosValido = in.nextFloat();
       votosBranco = in.nextFloat();
       votosNulo = in.nextFloat();
       
       porValido = (votosValido * 100) / votosTotal;
       porBranco = (votosBranco * 100) / votosTotal;
       porNulo = (votosNulo * 100) / votosTotal;
       
       
       
       System.out.printf("A Porcentagem de votos Validos é: %.1f\nA Porcentagem de votos em Branco é: %.1f\nA Porcentagem de votos Nulos é: %.1f\n ", porValido, porBranco, porNulo);
       
        in.close();
         
    }
}