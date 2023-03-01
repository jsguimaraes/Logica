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
            
        for(int i = 0; i < Campo.length; i++){
            for(int j = 0; j < Campo[i].length; j++){
                System.out.print(Campo[i][j] + " ");
            }
            System.out.println();
        }
            
        System.out.println("Bem vindo ao jogo \n O obajetivo e nao permanecer nas bordas do campo.\nUtilize as teclas W(cima), S(baixo), A(esquerda), D(direita> e P(sair)");
            
        while(true){
                
            System.out.println("Faça sua Jogada");
            String Jogada = in.next().toUpperCase();
                
            if(Jogada.equals ("P")){
                System.out.println("Voce acaba de SAIR do jogo");
                break;
            } else{
                
                Campo[pLinha][pColuna] = '0';
                
                switch(Jogada){
                        
                    case "W":
                        pLinha -= 1;
                        if(pLinha == -1){
                            pLinha = 0;
                        }
                        break;
                            
                    case "S":
                        pLinha += 1;
                        if(pLinha == 8){
                            pLinha = 7;
                        }
                        break;
                            
                    case "A":
                        pColuna -= 1;
                        if(pColuna == -1){
                            pColuna = 0;
                        }
                        break;
                            
                    case "D":
                        pColuna += 1;
                        if(pColuna == 8){
                            pColuna = 7;
                        }
                        break;
                }
                
                Campo[pLinha][pColuna] = '-';
                    
                for(int i = 0; i < Campo.length; i++){
                    for(int j = 0; j < Campo[i].length; j++){
                        System.out.print(Campo[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    
    }
}