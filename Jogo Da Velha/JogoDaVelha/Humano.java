import java.util.Scanner;

class Humano extends Jogador {
    private String nome;
    private Scanner scanner;

    public Humano(char simbolo) {
        super(simbolo);
        scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome:");
        this.nome = scanner.nextLine();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int[] melhorJogada(Tabuleiro tabuleiro) {
        int linha, coluna;
        do {
            System.out.println(nome + ", digite a linha (0-2):");
            linha = scanner.nextInt();
            System.out.println(nome + ", digite a coluna (0-2):");
            coluna = scanner.nextInt();
        } while (!tabuleiro.realizarJogada(linha, coluna, this));

        return new int[]{linha, coluna};
    }
}
