public class CacaMapa {

    private final short qtdLinha = 10;
    private final short qtdColuna = 5;
    private char mapa[][] = new char[qtdLinha][qtdColuna];

    public CacaMapa() {
        mapa = new char[qtdLinha][qtdColuna];
        mapaEntrada();
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

    private void mapaLinha() {
        for (int i = 0; i < qtdColuna; i++) {
            System.out.print("----");
        }
        System.out.print("-");
        System.out.println();
    }
    
    public void imprimir() {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("| " + mapa[i][j] + " "); 
            }
            System.out.println("|");
            mapaLinha();
        } 
    }

    public void pesquisa(String palavras[][]) {
        // for (short palavraAtual = 0; palavraAtual < palavras.length; palavraAtual++) {
        //     short caractere = 0;
        //     for (short a = 0; a < qtdColuna; a++) {
        //         for (short b = 0; b < qtdColuna; b++) {
        //             if (mapa[a][b] == palavras[palavraAtual][0].charAt(caractere)) {
        //                 caractere++;
        //                 if (caractere == palavras[palavraAtual][0].length()) {
        //                     palavras[palavraAtual][1] = "[" + a + ", " + (b - palavras[palavraAtual][0].length() + 1) + "]";
        //                     caractere = 0;
        //                 }
        //             } else {
        //                 caractere = 0;
        //             }
        //         }    
        //     }
        //     caractere = 0;
        //     for (short a = 0; a < qtdColuna; a++) {
        //         for (short b = 4; b < qtdColuna; b--) {
        //             if (mapa[a][b] == palavras[palavraAtual][0].charAt(caractere)) {
        //                 caractere++;
        //                 if (caractere == palavras[palavraAtual][0].length()) {
        //                     palavras[palavraAtual][1] = "[" + a + ", " + ( + palavras[palavraAtual][0].length() - 1) + "]";
        //                     caractere = 0;
        //                 }
        //             } else {
        //                 caractere = 0;
        //             }
        //         }    
        //     }

        //     caractere = 0;
        //     // short k;
        //     for (short k = 0; k < qtdColuna; k++) {
        //         for (short l = 0; l < qtdColuna; l++) {
        //             if (mapa[k][l] == palavras[palavraAtual][0].charAt(caractere)) {
        //                 caractere++;
        //                 if (caractere == palavras[palavraAtual][0].length()) {
        //                     palavras[palavraAtual][1] = "[" + (l - palavras[palavraAtual][0].length() + 1) + ", " + k + "]";
        //                     caractere = 0;
        //                 }
        //             } else {
        //                 caractere = 0;
        //             }
        //         }    
        //     }
        //     caractere = 0;
        //     for (short k = 0; k < qtdColuna; k++) {
        //         for (short l = 4; l < qtdColuna; l--) {
        //             if (mapa[k][l] == palavras[palavraAtual][0].charAt(caractere)) {
        //                 caractere++;
        //                 if (caractere == palavras[palavraAtual][0].length()) {
        //                     palavras[palavraAtual][1] = "[" + (l + palavras[palavraAtual][0].length() - 1) + ", " + k + "]";
        //                     caractere = 0;
        //                 }
        //             } else {
        //                 caractere = 0;
        //             }
        //         }    
        //     }
        // }
    }
}
