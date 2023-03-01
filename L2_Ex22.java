import java.util.Scanner;

public class L2_Ex22 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero da conta, saldo, débitos e créditos:");
        float numConta, saldo, debito, credito, saldoAtual;

        numConta = in.nextFloat();
        saldo = in.nextFloat();
        debito = in.nextFloat();
        credito = in.nextFloat();
        saldoAtual = saldo - debito + credito;
        System.out.println("Seu saldo é: R$" + saldoAtual);
        if( saldoAtual >= 0){
            System.out.println("Saldo POSITIVO");
        } else {
            System.out.println("Saldo NEGATIVO");
        }
        in.close();


    }    
}
