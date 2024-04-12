abstract class Jogador {
    protected char simbolo;

    public Jogador(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public abstract int[] melhorJogada(Tabuleiro tabuleiro);
    public abstract String getNome();
}
