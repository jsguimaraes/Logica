import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite a idade do Nadador");
        
        int idade;
        
        idade = in.nextInt();
        
        if (idade < 9 ){
            System.out.println("Categoria Mirim");
        }else if (idade >= 9 && idade < 14){
            System.out.println("Categoria Infantil");
        }else if (idade >= 14 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }
        
        in.close();
    }
}