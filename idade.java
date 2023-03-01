import java.util.Scanner;
public class idade {
    public static void main(String[] args){
        //Incluir o scanner como uma variavel de nome in
        //Escaneia a entrada padrão do sistema (System.in)
        // entrada padrado =  teclado
        Scanner in = new Scanner(System.in);
        int idade;

        System.out.println("Qual a sua idade?");
        
        //Ler o valor do proximo inteiro da entrada 
        // e atribui na variavel idade
        idade = in.nextInt();
        
        int IdadeDaqui10anos = idade + 10;
        System.out.println("Daqui a 10 anos voce tera " + IdadeDaqui10anos);
        
        System.out.println("Qual a idade da sua mae?");
        int IdadeMae = in.nextInt();

        int IdadeMaeQdNasci = IdadeMae - idade;
        System.out.println("Sua mae tinha" + IdadeMaeQdNasci + "quando voce nasceu");

    }
}
