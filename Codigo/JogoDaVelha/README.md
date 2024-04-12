#O "Jogo da Velha" :
Classes:
1.Jogador:
Representa um jogador genérico.
Possui atributos como nome e símbolo (X ou O).
Métodos para obter e definir esses atributos.

1.1Humano:
Subclasse de Jogador.
Solicita ao usuário seu nome e seu símbolo.
Possui um método para escolher a melhor jogada.

2. Computador:
Subclasse de Jogador.
Escolhe a jogada de forma estratégica para tentar vencer o jogo.

3.Tabuleiro:
Representa o tabuleiro do jogo com 3x3 posições.
Métodos para limpar o tabuleiro, realizar uma jogada, verificar o fim do jogo, verificar se o tabuleiro está cheio e imprimir o tabuleiro.

4.JogoDaVelha:
Classe principal que controla o fluxo do jogo.
Possui métodos para iniciar o jogo, alternar entre jogadores, verificar o fim do jogo e imprimir o tabuleiro.

Funcionalidades:
Início do Jogo:
O jogo começa solicitando o nome e o símbolo do jogador humano.
Fluxo do Jogo:
O jogo alterna entre as jogadas do jogador humano e do computador.
Cada jogador faz sua jogada, e o tabuleiro é atualizado.
Verificação do Fim do Jogo:
Após cada jogada, o programa verifica se há um vencedor ou se houve empate (velha).
Finalização do Jogo:
O jogo continua até que o usuário decida encerrar.
Ao final, é exibido um placar com o número de vitórias de cada jogador.