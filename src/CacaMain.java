import java.util.Scanner;

public class CacaMain {

    private CacaPalavras palavras;
    private CacaMapa mapa;

    private CacaMain() {

        palavras = new CacaPalavras();
        mapa = new CacaMapa();
        mapa.pesquisa(palavras.palavrasMatriz());

        Scanner teclado = new Scanner(System.in);
        System.out.println("\n____ Menu: Caça Palavras ____\n1. listar palavras" +
            "\n2. listar mapa\n3. listar respostas\n4. sair\n  __ opção:");
        int opcao = teclado.nextInt();

        do {
            switch (opcao) {
                case 1 : palavras.imprimir() ;  break;
                case 2 : mapa.imprimir()     ;  break;
                case 3 : palavras.respostas();  break;   
                default:
                    System.out.println("opção errada!");
                    break;
            }
            System.out.println("____ Menu: Caça Palavras ____\n1. listar palavras" +
            "\n2. listar mapa\n3. listar respostas\n4. sair\n  __ opção:");
            opcao = teclado.nextInt();
        } while (opcao != 4);
        teclado.close();
    }

    public static void main(String[] args) {
        new CacaMain();
    }
}
