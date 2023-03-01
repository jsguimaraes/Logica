import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        String tipoCombustivel;
        float nLitros, valorGasolina, valorAlcool, desconto, total;
        
        System.out.println("Escolha seu tipo de Combustivel: A para alcool e G para gasolina. E quantos LITROS deseja.");
        tipoCombustivel = in.next();
        nLitros = in.nextFloat();
        valorGasolina = 4.30f;
        valorAlcool = 3.90f;
        
        if (tipoCombustivel.equals("A") && nLitros <= 20){
            desconto = 0.97f;
            total = (valorAlcool * nLitros * desconto);
        } else if(tipoCombustivel.equals("A") && nLitros > 20) {
            desconto = 0.95f;
            total = (valorAlcool * nLitros * desconto);
        } else if(tipoCombustivel.equals("G") && nLitros <= 20) {
            desconto = 0.96f;
            total = (valorGasolina * nLitros * desconto);
        } else {
            desconto = 0.94f;
            total = (valorGasolina * nLitros * desconto);
        }
        
        System.out.println("O total a ser pago é: R$" + total);
        in.close();
    }
}