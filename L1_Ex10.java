import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
       float valorIngresso, socios, menoresde10, pagantesInteira, totalEvento, rendaTotal, valorPerdido;
       
       System.out.println("Digite o valor do ingresso, N° Sócios, Crianças, Pagantes sem desconto:");
       
       valorIngresso = in.nextFloat();
       socios = in.nextFloat();
       menoresde10 = in.nextFloat();
       pagantesInteira = in.nextFloat();
       
       totalEvento = socios + menoresde10 + pagantesInteira;
       rendaTotal = (pagantesInteira * valorIngresso) + (valorIngresso - (valorIngresso * 0.3f)) * socios;
       valorPerdido = ((valorIngresso * 0.3f) * socios) + (menoresde10 * valorIngresso);
       
      
       
       System.out.printf("O publico total do evento é:%.0f\n  Renda Total do Evento:%.2f\n Valor ñ arrecadado por desconto e isenção:%.2f", totalEvento, rendaTotal, valorPerdido);
       
        in.close();
         
    }
}