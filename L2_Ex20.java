import java.util.Scanner;
public class L2_Ex20 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int odometroInicial, odometroFinal, diferencaOdometro;
        float litrosPordia, recebidoPassageiros, valGastoComb, mediaConsumo, lucro;
        
        System.out.println("Digite o seu Odometro inicial e o Final. Logo após os listros gastos no dia. E o valor recebido pelos passageiros.");

        odometroInicial = in.nextInt();
        odometroFinal = in.nextInt();
        litrosPordia = in.nextFloat();
        recebidoPassageiros = in.nextFloat();
        diferencaOdometro = odometroFinal - odometroInicial;
        mediaConsumo = (diferencaOdometro/litrosPordia);
        valGastoComb = (litrosPordia * 4.599f);
        lucro = (recebidoPassageiros - valGastoComb);

        System.out.printf("A média do consumo é: %.2fkm/l \nO seu Lucro é: %.2f", mediaConsumo, lucro);


    }
    
}
