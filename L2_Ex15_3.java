import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int horaInicio, horaFim, tempoJogo;
        System.out.println("Digite a hora inicial do Jogo:");
        horaInicio = in.nextInt();
        
        System.out.println("Digite a hora inicial do Jogo:");
        horaFim = in.nextInt();
        
        if (horaInicio > horaFim) {
            tempoJogo = 24 - horaInicio + horaFim;
        } else {
            tempoJogo = horaFim - horaInicio;
        }
        
        System.out.printf("A duração do jogo foi:%d h", tempoJogo);
        
        in.close();
        
        
    }
}