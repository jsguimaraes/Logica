import java.util.Scanner;

public class L4_Ex04{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma opção: (a) consultar saldo, (b) saque, (c) depósito ou (d) sair");

        char escolha;
        float saldo, valorSaque, valorDeposito;

        saldo = 0.00f;
        escolha = in.next().charAt(0);

        while(escolha != 'd'){
            System.out.println("Escolha uma opção: (a) consultar saldo, (b) saque, (c) depósito ou (d) sair");
            escolha = in.next().charAt(0);
            
            if(escolha == 'a'){
                saldo = saldo;
            } else if(escolha == 'b'){
                System.out.println("Digite o falor do seu saque:");
                valorSaque = in.nextFloat();
                saldo = saldo - valorSaque;
            } else if(escolha == 'c'){
                System.out.println("Digite o valor do seu depósito");
                valorDeposito = in.nextFloat();
                saldo = saldo + valorDeposito;
            }

            System.out.println("Seus saldo é: R$" + saldo);
        }
        
    }
}