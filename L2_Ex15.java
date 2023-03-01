import java.util.Scanner;

public class L2_Ex15{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a hora e minuto de inicio e termino do jogo");

        int horaInicio, horaFinal, tempoJogo;
        horaInicio = in.nextInt();
        horaFinal = in.nextInt();
        

        if (horaInicio > horaFinal){
            tempoJogo = (24 - horaInicio) + horaFinal;
        }else{
            tempoJogo = horaFinal - horaInicio;
        }
        
        System.out.println("A duração do jogo foi de " + tempoJogo + "h");
        in.close();

    }
}