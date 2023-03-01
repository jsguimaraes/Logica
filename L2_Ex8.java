import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o numero de eleitores do municipio, logo em seguida Qtd de votos brancos, nulos e validos");
        int eleitores, brancos, nulos, validos; 
        float percBranco, percNulo, percValido;
        
        eleitores = in.nextInt();
        brancos = in.nextInt();
        nulos = in.nextInt();
        validos = in.nextInt();
        
        percBranco = (brancos * 100f) / eleitores;
        percNulo = (nulos * 100f) / eleitores;
        percValido = (validos * 100f) / eleitores;
        
        System.out.printf("O percentual de cada tipo de voto em relação ao total de eleitores é:\n Votos em Branco: %f\nVotos Nulos: %f\nVotos Validos: %f\n", percBranco, percNulo, percValido);
        
        in.close();
        
        
    }
}