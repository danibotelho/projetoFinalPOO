import java.util.Scanner;

class Jogo {
    private Jogador jogador;
    private Inimigo inimigo;

    public Jogo(Inimigo inimigo, Jogador jogador) {
        this.inimigo = inimigo;
        this.jogador = jogador;
    }

    private void pontosDeVida(Inimigo inimigo , Jogador jogador){
        System.out.println("\nPontos de vida Inimigo: " + inimigo.getVida());
        System.out.println("Pontos de vida" + jogador.getClass().getSimpleName() +": " + jogador.getVida());
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao RPG!");
        System.out.println("Escolha sua classe: ");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Seja bem-vindo GUERREIRO, vamos iniciar sua batalha ");
                break;
            case 2:
                System.out.println("Seja bem-vindo MAGO, vamos iniciar sua batalha ");
                break;
            default:
                System.out.println("Escolha inválida. Por favor, tente novamente.");
                iniciarJogo();
                return;
        }

        System.out.println("Iniciando batalha...");
        iniciarBatalha(escolha);
    }

    private void iniciarBatalha(int escolha) {
        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();

        while (inimigo.estaVivo() != 0 && (guerreiro.estaVivo() != 0 || mago.estaVivo() != 0)) {
            System.out.println("\n=========================");
            if (escolha == 1) {
                System.out.println("\nRodada do Jogador");
                guerreiro.ataque(inimigo);

                if (inimigo.estaVivo() <= 0) {
                    System.out.println("\nVocê derrotou o inimigo!");
                    pontosDeVida(inimigo, guerreiro);
                    return;
                }

                System.out.println("\nRodada do Inimigo");
                inimigo.atacar(guerreiro);

                if (guerreiro.estaVivo() <= 0) {
                    System.out.println("\nGuerreiro foi derrotado");

                    pontosDeVida(inimigo, guerreiro);
                    return;
                }

                pontosDeVida(inimigo, guerreiro);

            } else {
                System.out.println("\nRodada do Jogador");
                mago.ataque(inimigo);

                if (inimigo.estaVivo() == 0) {
                    System.out.println("\nVocê derrotou o inimigo!");
                    pontosDeVida(inimigo, mago);
                    return;
                }

                System.out.println("\nRodada do Inimigo");
                inimigo.atacar(mago);

                if (guerreiro.estaVivo() <= 0) {
                    System.out.println("\nMago foi derrotado");
                    pontosDeVida(inimigo, mago);
                    return;
                }

                pontosDeVida(inimigo, mago);

            }

        }
    }
}