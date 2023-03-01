import java.util.Scanner;
public class Media {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float av1, av2, av3, trab, media;

        System.out.println("Informe as notas das avaliações");

        av1 = in.nextFloat();
        av2 = in.nextFloat();
        av3 = in.nextFloat();
        trab = in.nextFloat();

        media = (av1 + av2 + av3 + trab)/4;

        System.out.println(" Média do aluno é: " + media);
        
    }
}
