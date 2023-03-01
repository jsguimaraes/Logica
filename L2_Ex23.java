import java.util.Scanner;

public class L2_Ex23 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a Quantidade atual do estoque, a Qt Máxima e Minima");
        int qtAtual, qtMaxima, qtMinima, qtMedia;
        qtAtual = in.nextInt();
        qtMaxima = in.nextInt();
        qtMinima = in.nextInt();
        qtMedia = (qtMaxima + qtMinima) / 2;

        if (qtAtual >= qtMedia){
            System.out.println("Não efetuar Compra");
        } else{
            System.out.println("Efetuar compra");
        }
        in.close();
    }    
}
