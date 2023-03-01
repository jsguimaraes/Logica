import java.util.Scanner;

public class L4_Ex05{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int contador;
        float nota, media;

        contador = 0;
        nota = 0;
        media = 0;

        while( contador < 5){
            System.out.println("Digite a nota do Aluno:");
            nota = in.nextFloat();
            media = media + nota;
            contador ++;
            
        }
        media = media / 5;
        System.out.println("A media é: " + media);
    }
}