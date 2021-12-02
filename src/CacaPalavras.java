public class CacaPalavras {

    private short qtdLinha;
    private short qtdColuna;
    private String palavras[][];

    public CacaPalavras() {
        qtdLinha = 5;
        qtdColuna = 5;
        palavras = new String[qtdLinha][qtdColuna];

        palavrasEntrada();
    }

    public void imprimir() {
        for (int i = 0; i < qtdLinha; i++) {
                System.out.println(palavras[i][0]);
        }
    }

    private void palavrasEntrada() {
        palavras[0][0] = "IFELSE";
        palavras[1][0] = "FORA";
        palavras[2][0] = "WHILE";
        palavras[3][0] = "OBJETO";
        palavras[4][0] = "VETOR";
        }

}
