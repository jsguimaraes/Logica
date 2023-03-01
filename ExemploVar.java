public class ExemploVar{
    public static void main(String[] args){

        System.out.println("Isso funciona!!");
        
        //declarando uma variavel    
        //TIPO NOME:
        //TIPO => int, float, double, String, char, boolean, short, byte, lomg.....
        //NOME: escolhe quem esta programando
        int numero;

        //atribuição, colocar um valor no espaço de memoria. Notem que: o nome da variavel
        // o endereco neste caso tambem, o conteudo e que muda.
        numero = 2;
        
        //System => sistema
        //out => saida
        //print => escreva/ imprima
        //ln => uma nova linha no final
        System.out.println("O valor da variavel numero eh " +numero);
        System.out.println(numero);

        //A letra '+' fora das aspas JUNTA/CONCATENA o texto
        System.out.println("este e meu texto, e \n\t" + numero + "este é meu numero");
        

        //declarar e atribuir um unico comando
        int numero2 = 10;
        
    }
}