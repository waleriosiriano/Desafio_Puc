import java.util.Random;

class Computador extends Jogador {
    private Random random;

    public Computador(char simbolo) {
        super(simbolo);
        random = new Random();
    }

    @Override
    public String getNome() {
        return "Computador";
    }

    @Override
    public int[] melhorJogada(Tabuleiro tabuleiro) {
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (!tabuleiro.realizarJogada(linha, coluna, this));

        System.out.println("Computador jogou na linha " + linha + ", coluna " + coluna);
        return new int[]{linha, coluna};
    }
}
