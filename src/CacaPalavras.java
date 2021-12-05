public class CacaPalavras {

    private final short qtdLinha = 5;
    private final short qtdColuna = 2;
    private String palavras[][] = new String[qtdLinha][qtdColuna];

    public CacaPalavras() {
        
        palavras = new String[qtdLinha][qtdColuna];

        palavrasEntrada();
        palavrasMatriz();
    }

    public String[][] palavrasMatriz() {
        return palavras;
    }

    private void palavrasEntrada() {
        palavras[0][0] = "IFELSE";
        palavras[1][0] = "FORA";
        palavras[2][0] = "WHILE";
        palavras[3][0] = "OBJETO";
        palavras[4][0] = "VETOR";
    }

    public void imprimir() {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i][0]);
        }
    }

    public void respostas() {
        System.out.println("nao achou");
    }
}
