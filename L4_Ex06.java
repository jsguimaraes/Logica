import java.util.Scanner;

public class L4_Ex06 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor:");

        float valor, novoValor;
        valor = in.nextFloat();
        while(valor < 1 || valor > 10){
            System.out.println("Digite outro valor: ");
            novoValor = in.nextFloat();
            valor = novoValor;
            if(novoValor >= 1 && novoValor <= 10){
                System.out.println("O valor esta entre 1 e 10: " + novoValor);
            }
        }
     
    }
}
