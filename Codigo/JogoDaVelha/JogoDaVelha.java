public class JogoDaVelha {

    private Tabuleiro tabuleiro;
    private Jogador jogador1, jogador2;
    private int jogadas;

    public JogoDaVelha() {
        tabuleiro = new Tabuleiro();
        jogador1 = new Humano('X');
        jogador2 = new Computador('O');
        jogadas = 0;
    }

    public void jogar() {
        System.out.println("Iniciando jogo da velha!");

        while (!tabuleiro.verificarFimDeJogo() && !tabuleiro.isTabuleiroCheio()) {
            if (jogadas % 2 == 0) {
                realizarJogada(jogador1);
            } else {
                realizarJogada(jogador2);
            }
            jogadas++;
        }

        tabuleiro.imprimir();

        if (tabuleiro.verificarFimDeJogo()) {
            if (jogadas % 2 == 0) {
                System.out.println(jogador1.getNome() + " venceu!");
            } else {
                System.out.println(jogador2.getSimbolo() == 'O' ? "Computador venceu!" : "Jogador 2 venceu!");
            }
        } else {
            System.out.println("Deu velha!");
        }
    }

    private void realizarJogada(Jogador jogador) {
        System.out.println(jogador.getSimbolo() == 'X' ? "Vez do jogador " + ((Humano) jogador).getNome() : "Vez do computador");
         jogador.melhorJogada(tabuleiro);
        //tabuleiro.realizarJogada(jogada[0], jogada[1], jogador);
        tabuleiro.imprimir();
    }

    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.jogar();
    }
}
