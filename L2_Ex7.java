import java.util.Scanner;

public class L2_Ex7{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite qual valor da sua hora trabalhada, e quantas horas trabalhou no mês:");

        float valorHora, horaMes, totalBruto, totalLiq, descontos;

        valorHora = in.nextFloat();
        horaMes = in.nextFloat();
        totalBruto = valorHora * horaMes;
        
        System.out.println("O seu salário bruto é R$:" + totalBruto);
        
        System.out.println("Digite o valor do desconto no mês");
        descontos = in.nextFloat();
        
        totalLiq = totalBruto - (totalBruto * (descontos / 100));
        System.out.println("O seu salário líquido é R$:" + totalLiq);
        
        in.close();


        
    }
}