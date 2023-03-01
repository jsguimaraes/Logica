import java.util.Scanner;

public class L2_Ex21{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int  pista, numVoltas, numReabastecimento; 
        float  consumoCarro, pistaKm, numeMinimo;
        System.out.print("Digite o Comprimento da pista em metros, o numero de voltas, o numero de reabastecimentos obrigatorios e o consumo do carro\n");
        pista = in.nextInt();
        numVoltas = in.nextInt();
        numReabastecimento = in.nextInt();
        consumoCarro = in.nextFloat();
        pistaKm = pista / 1000f;
        
        numeMinimo = ((numVoltas / numReabastecimento) * pistaKm) / consumoCarro;
        
        System.out.printf("O numero mínimo em Litos para percorrer até o Primeiro reabestimento é: %.2f L\n ", numeMinimo);

        in.close();
    }
}