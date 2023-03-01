import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        char [][] Campo = new char[8][8];
        
        for(int i = 0; i < Campo.length; i++){
            for(int j = 0; j < Campo[i].length; j++){
                Campo[i][j] = '0';
            }
        }
        
        Campo[0][0] = '-';
        int pLinha = 0;
        int pColuna = 0;
        
        System.out.println("Utilize as teclas W(Cima), S(Baixo), A(Esquerda), D(Direita) e P(Sair) \nO objetivo é percorrer o campo sem Ultrapassar os limites do campo.");
        
        boolean ContinuaJogo = true;
        while(ContinuaJogo){
            
            for(int i = 0; i < Campo.length; i++){
                for(int j = 0; j < Campo[i].length; j++){
                    System.out.print(Campo[i][j]);
                }
                System.out.println();
            }
            
            System.out.println("Observe seu campo e caso esteja em alguma EXTREMIDADE tecle para se afastar da mesma. \nFaça seu Próximo Movimento:");
            String Movimento = in.next().toUpperCase();
            
            Campo[pLinha][pColuna] = '0';
            
            switch(Movimento){
                case "W":
                    pLinha -= 1;
                    break;
                
                case "S":
                    pLinha += 1;
                    break;
                
                case "A":
                    pColuna -= 1;
                    break;
                    
                case "D":
                    pColuna += 1;
                    break;
            }
            
            if(Movimento == "P"){
                System.out.println("Voce Acaba de Sair do JOGO...");
                ContinuaJogo = false;
            }
            
            Campo[pLinha][pColuna] = '-';
            
            
        }
    }
}