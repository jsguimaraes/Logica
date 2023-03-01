import java.util.Scanner;

public class Ex6 {

    static Scanner in = new Scanner(System.in);

    private static int[] iniciarVetor(int tamanho) {

        int[] vetor = new int[tamanho];

        System.out.println("Informe o gabarito da loteria esportiva:");
        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = in.nextInt();

        }

        return vetor;
    }

    private static int[][] iniciarMatriz(int linhas, int colunas) {

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Informe as apostas do jogador:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = in.nextInt();

            }
        }

        return matriz;
    }

    private static void mostrarResultadoDaAposta(int[][] matriz, int[] vetor) {

        int apostaSimples = 0;
        int apostaDupla = 0;
        int apostaTripla = 0;
        int pontosFeitos = 0;

        for (int i = 0; i < matriz.length; i++) {

            int somaLinhas = 0;

            if (matriz[i][vetor[i] - 1] == 1) {

                pontosFeitos++;

            }

            for (int j = 0; j < matriz[i].length; j++) {

                somaLinhas += matriz[i][j];

            }

            switch (somaLinhas) {

                case 1:
                    apostaSimples++;
                    break;
                case 2:
                    apostaDupla++;
                    break;
                case 3:
                    apostaTripla++;
                    break;
            }
        }

        System.out.printf("%d (pontos)\n%d (simples)\n%d (duplas)\n%d (triplas)\n", pontosFeitos, apostaSimples,
                apostaDupla, apostaTripla);
    }

    public static void main(String[] args) {

        int tamanhoGabarito = 13;
        int numMaximoDeApostas = 3;
        int linhas = tamanhoGabarito;
        int colunas = numMaximoDeApostas;

        int[] gabaritoLoteriaEsportiva = iniciarVetor(tamanhoGabarito);
        int[][] apostaJogador = iniciarMatriz(linhas, colunas);
        mostrarResultadoDaAposta(apostaJogador, gabaritoLoteriaEsportiva);

    }
}