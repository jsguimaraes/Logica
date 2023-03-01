import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int codUsuario, senhaUsuario, digitarCod, digitarSenha;
        
        System.out.println("Digite seu codigo de Usuário");
        
        codUsuario = 1234;
        senhaUsuario = 9999;
        digitarSenha = 0;
        digitarCod = in.nextInt();
        
        if(digitarCod == codUsuario){
            System.out.println("Digite sua Senha de Acesso");
            digitarSenha = in.nextInt();
            
            if(digitarSenha == senhaUsuario){
            System.out.println("Acesso Permitido");
            } else if(digitarSenha != senhaUsuario){
            System.out.println("Senha Incorreta");
            } 
        } else{
            System.out.println("Usuario inválido");
        }
        
        in.close();
    }
}