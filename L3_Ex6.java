import java.util.Scanner;

public class L3_Ex6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome dos times:");
        String timeA, timeB;
        timeA = in.next();
        timeB = in.next();
        
        System.out.println("Digite a quantidade de gols para cada time:");
        int golA, golB;
        golA = in.nextInt();
        golB = in.nextInt();

        if(golA > golB){
            System.out.println("O time vencedor é: " + timeA);
        } else if(golA < golB){
            System.out.println("O time vencedor é: " + timeB);
        } else{
            System.out.println("EMPATE");
        }

        in.close();

    }    
}
