import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        float custoFabrica, distribuidor, impostos, consumidor;
        
        System.out.println("Digite o preço de Fabrica do veiculo:");
        custoFabrica = in.nextFloat();
        distribuidor = custoFabrica * 0.28f;
        impostos = custoFabrica * 0.45f;
        consumidor = custoFabrica + distribuidor + impostos;
        
        System.out.println("O preço do veiculo para o Consumidor é: R$" + consumidor);
        
        in.close();
        
    }
}