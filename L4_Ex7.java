import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite sua senha");
        
        int senha, senhaCorreta,contador;
        
        senhaCorreta = 12345;
        senha = in.nextInt();
        contador = 1;
        
        while(senha != senhaCorreta){
            System.out.println("Senha Incorreta. Digite Novamente");
            senha = in.nextInt();
            contador ++;
        }
        
        System.out.printf("Senha Correta\nSuas tentativas de acertar a sua senha foram: %d" , contador);
    }
}