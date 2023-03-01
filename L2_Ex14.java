import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o ano Atual, logo em seguida seu ano de Nascimento");
        int aAtual, aNascimento, idade;
        
        aAtual = in.nextInt();
        aNascimento = in.nextInt();
        idade = (aAtual - aNascimento);
        
        if (idade < 16){
            System.out.printf("Sua idade é:%d Não pode votar", idade);
        }else if(idade >= 16 && idade < 18){
            System.out.printf("Sua idade é:%d Não é Obrigatório, mas você ja pode votar", idade);
        }else {
            System.out.printf("Sua idade é:%d É Obrigatorio, e você ja pode votar ", idade);
        }
        in.close();
    }
}