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
        
        System.out.println("Bem vindo ao Jogo: \nO Objetivo e se mover pelo campo, Sem ultrapassar os extremos. \nNote que o inicio do jogo ja desafia você pois você ja começa no extremo SUPERIOR e tambem no extremo ESQUERDO ");
        
        for(int i = 0; i < Campo.length; i++){
            for(int j = 0; j < Campo[i].length; j++){
                System.out.print(Campo[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Bom agora vamos começar a jogar. \nAs teclas para se movimentar é: W(cima), S(baixo), A(Esquerda), D(Direita) e Tecle P(SAIR)");
        System.out.println();
        System.out.println("Note que voce esta em duas extremidades. Entao tecle (S) para sair da extremidade SUPERIOR, e depois a tecla (D) para sair da extremidade ESQUERDA. Ou vice versa.");
        
        while(true){
            
            for(int i = 0; i < Campo.length; i++){
                for(int j = 0; j < Campo[i].length; j++){
                    System.out.print(Campo[i][j]);
                }
                System.out.println();
            }
            
            System.out.println("Tecle o Seu Próximo Movimento");
            
            char Movimento = in.next().charAt(0);
            
            Campo[pLinha][pColuna] = '0';
            
            switch(Movimento){
                case 'W':
                    pLinha -= 1;
                    if(pLinha == 0){
                        System.out.println("Cuidado Voce esta na Extremidade SUPERIOR, saia imediatamente tecle (S)");
                    }
                    break;
                    
                case 'S':
                    pLinha += 1;
                    if(pLinha == 7){
                        System.out.println("Cuidado Voce esta na Extremidade INFERIOR, saia imediatamente tecle (W)");
                    }
                    break;
                    
                case 'A':
                    pColuna -= 1;
                    if(pColuna == 0){
                        System.out.println("Cuidado Voce esta na Extremidade ESQUERDA, saia imediatamente tecle (D)");
                    }
                    break;
                    
                case 'D':
                    pColuna += 1;
                    if(pColuna == 0){
                        System.out.println("Cuidado Voce esta na Extremidade DIREITA, saia imediatamente tecle (A)");
                    }
                    break;
                    
                case 'P':
                    System.out.println("Voce acaba de sair do jogo");
                    break;
                
            }
            
            Campo[pLinha][pColuna] = '-';
        }
    }
}