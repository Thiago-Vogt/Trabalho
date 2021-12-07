public class CacaMapa {

    private final int qtdLinha = 10;
    private final int qtdColuna = 5;
    private char mapa[][] = new char[qtdLinha][qtdColuna];

    public CacaMapa() {
        mapa = new char[qtdLinha][qtdColuna];
        mapaEntrada();
    }

    private void mapaLinha() {
        for (int i = 0; i < qtdColuna; i++) {
            System.out.print("----");
        }
        System.out.println("-");
    }

    public void imprimir() {
        mapaLinha();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("| " + mapa[i][j] + " ");
            }
            System.out.println("|");
            mapaLinha();
        }
    }

    public void pesquisa(String palavras[][]) {
        for (int palavra = 0; palavra < palavras.length; palavra++) {
            char caractere = 0;
            for (int a = 0; a < qtdLinha; a++) {
                for (int b = 0; b < qtdColuna; b++) {
                    if (mapa[a][b] == palavras[palavra][0].charAt(caractere)) {
                        caractere++;
                        if (caractere == palavras[palavra][0].length()) {
                            palavras[palavra][1] = "[" + a + ", " + (b - palavras[palavra][0].length() + 1) + "]";
                            caractere = 0;
                        }   
                    } else {
                        caractere = 0;
                    }
                }    
            }
            caractere = 0;
            for (int a = 0; a < qtdColuna; a++) {
                for (int b = 4; b > -1; b--) {
                    if (mapa[a][b] == palavras[palavra][0].charAt(caractere)) {
                        caractere++;
                        if (caractere == palavras[palavra][0].length()) {
                            palavras[palavra][1] = "[" + a + ", " + ( + palavras[palavra][0].length() - 1) + "]";
                            caractere = 0;
                        }
                    } else {
                        caractere = 0;
                    }
                }    
            }
            short c;
            caractere = 0;
            for (c = 0; c < qtdColuna; c++) {
                for (short d = 0; d < 10; d++) {
                    if (mapa[d][c] == palavras[palavra][0].charAt(caractere)) {
                            caractere++;
                        if (caractere == palavras[palavra][0].length()) {
                            palavras[palavra][1] = "[" + (d - palavras[palavra][0].length() + 1) + ", " + c + "]";
                            caractere = 0;
                        }
                    } else {
                      caractere = 0;
                    }
                }
            }
            caractere = 0;
            for (c = 0; c < 5; c++) {
                for (short d = 9; d >= 0; d--) {
                    if (mapa[d][c] == palavras[palavra][0].charAt(caractere)) {
                        caractere++;
                        if (caractere == palavras[palavra][0].length()) {
                            palavras[palavra][1] = "[" + (d + palavras[palavra][0].length() - 1) + ", " + c + "]";
                            caractere = 0;
                        } 
                    } else {
                        caractere = 0;
                    } 
                } 
            } 
    
        }
    }

    private void mapaEntrada() {
        mapa[ 0][ 0]='C'; mapa[ 0][ 1]='C'; mapa[ 0][ 2]='Q'; mapa[ 0][ 3]='W'; mapa[ 0][ 4]='E';
        mapa[ 1][ 0]='I'; mapa[ 1][ 1]='X'; mapa[ 1][ 2]='F'; mapa[ 1][ 3]='O'; mapa[ 1][ 4]='R';
        mapa[ 2][ 0]='F'; mapa[ 2][ 1]='F'; mapa[ 2][ 2]='R'; mapa[ 2][ 3]='G'; mapa[ 2][ 4]='F';
        mapa[ 3][ 0]='E'; mapa[ 3][ 1]='L'; mapa[ 3][ 2]='I'; mapa[ 3][ 3]='H'; mapa[ 3][ 4]='W';
        mapa[ 4][ 0]='L'; mapa[ 4][ 1]='S'; mapa[ 4][ 2]='F'; mapa[ 4][ 3]='O'; mapa[ 4][ 4]='U';
        mapa[ 5][ 0]='S'; mapa[ 5][ 1]='D'; mapa[ 5][ 2]='G'; mapa[ 5][ 3]='T'; mapa[ 5][ 4]='S';
        mapa[ 6][ 0]='E'; mapa[ 6][ 1]='J'; mapa[ 6][ 2]='H'; mapa[ 6][ 3]='E'; mapa[ 6][ 4]='T';
        mapa[ 7][ 0]='I'; mapa[ 7][ 1]='I'; mapa[ 7][ 2]='I'; mapa[ 7][ 3]='J'; mapa[ 7][ 4]='M';
        mapa[ 8][ 0]='X'; mapa[ 8][ 1]='C'; mapa[ 8][ 2]='K'; mapa[ 8][ 3]='B'; mapa[ 8][ 4]='G';
        mapa[ 9][ 0]='V'; mapa[ 9][ 1]='E'; mapa[ 9][ 2]='T'; mapa[ 9][ 3]='O'; mapa[ 9][ 4]='R';
    }
}
