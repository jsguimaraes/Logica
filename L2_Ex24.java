import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int homemVelho, homemNovo, mulherVelha, mulherNova, somatorio, produto;
        System.out.print("Digite a Idade do Homem mais velho, apos o mais novo, A mulher mais velha e apos a mais nova:\n");
        
        homemVelho = in.nextInt();
        homemNovo = in.nextInt();
        mulherVelha = in.nextInt();
        mulherNova = in.nextInt();
        
        somatorio = (homemVelho + mulherNova);
        produto = (homemNovo * mulherVelha);
        
        System.out.printf("O somatorio é: %d\nO produto é: %d\nMulher mais nova: %dAnos \nMulher mais velha: %dAnos \nHomem mais novo: %dAnos \nHomem mais velho: %dAnos\n", somatorio, produto, mulherNova, mulherVelha, homemNovo, homemVelho);
        
        in.close();
    }
}