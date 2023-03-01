import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int umReal, centavo50, centavo25, centavo10, centavo5;
        float valorReal, valorProduto;
        
        System.out.print("Digite o valor do produto em reais: ");
        valorProduto = in.nextFloat();
        
        System.out.print("Digite o numero de modes de 1Real, 50centavos, 25centavos, 10centavos e 5centavos:\n");
        umReal = in.nextInt();
        centavo50 = in.nextInt();
        centavo25 = in.nextInt();
        centavo10 = in.nextInt();
        centavo5 = in.nextInt();
        
        valorReal = (centavo50 * 0.50f + centavo25 * 0.25f + centavo10 * 0.10f + centavo5 * 0.05f + umReal);
        
        if (valorReal >= valorProduto){
            System.out.printf("Voce pode comprar o Produto, pois seu cofre possui: R$%.2f \nE o produto custa: R$%.2f\n", valorReal, valorProduto);
        } else{
            System.out.printf("Desculpe voce nao pode comprar o poduto, pois seu cofre possui: R$%.2f \nE o produto custa: R$%.2f\n", valorReal, valorProduto);
        }
        
        in.close();
    }
}