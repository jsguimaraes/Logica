import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        float prestacao, salario, emprestimo, numDePrestacao, porcSalario;
        
        System.out.println("Digite o Valor do Salário:");
        salario = in.nextFloat();
        
        System.out.println("Digite o Valor do Emprestimo Solicitado, e em quantas vezes deseja Parcelar:");
        emprestimo = in.nextFloat();
        numDePrestacao = in.nextFloat();
        
        prestacao = (emprestimo / numDePrestacao);
        porcSalario = salario * 0.30f;
        
        if (prestacao <= porcSalario){
            System.out.println("Emprestimo concedido. O valor Mensal da sua parcela é: R$ " + prestacao);
        } else {
            System.out.println("Emprestimo NÃO concedido. Valor da parcela ultrapassa os 30% do seu Salário");
        }
        
        in.close();
        
    }
}