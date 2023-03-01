import java.util.Scanner;

public class L2_Ex15_2{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a hora e minuto de inicio");

        int horaInicio, horaFinal, minutoInicial, minutoFinal, horaTotal, minutoTotal, tempoJogo;
        
        horaInicio = in.nextInt();
        minutoInicial = in.nextInt();
        
        System.out.println("Digite a hora e minuto do termino");
        horaFinal = in.nextInt();
        minutoFinal = in.nextInt();

        horaTotal = horaFinal - horaInicio;
        minutoTotal = minutoFinal - minutoInicial;

        if (horaTotal < 0 ){
            horaTotal = horaTotal + 24;
        }
        if(minutoTotal < 0){
            minutoTotal = minutoTotal +60;
            horaTotal = horaTotal - 1;
        }
        in.close();

    }
}