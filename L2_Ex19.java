import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        float comprimento, largura, altura, caixaAzulejo, totalCaixa;
        
        System.out.println("Digite o comprimento, largura e altura de sua cozinha:");
        comprimento = in.nextFloat();
        largura = in.nextFloat();
        altura = in.nextFloat();
        
        caixaAzulejo = 1.5f;
        
        totalCaixa = ((comprimento * altura) * 2 + (largura * altura) * 2) / caixaAzulejo;
        
        System.out.println("A quantidade necessárias de caixas para colocar azulejos em todas as paredes é: " + totalCaixa);
        
        in.close();
    }
}