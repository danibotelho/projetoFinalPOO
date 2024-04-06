import java.util.Random;

public class Jogador {
    private int vida;
    private int ataque;
    private int defesa;

    public Jogador() {
        this.vida = 30;
    }

    private int gerarValoresAleatorios() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void atacar(Jogador jogador) {

        setAtaque(gerarValoresAleatorios());
        jogador.setDefesa(gerarValoresAleatorios());

        int defesaOponente = jogador.getDefesa();
        int vidaOponente = jogador.getVida();
        int ataqueJogador = getAtaque();

        int dano = ataqueJogador - defesaOponente;
        System.out.println("Ataque " + getClass().getSimpleName() + ": "  + ataqueJogador);
        System.out.println("Defesa " + jogador.getClass().getSimpleName() + ": " + defesaOponente);

        if (ataqueJogador > defesaOponente) {
            vidaOponente -= dano;
                      System.out.println("Você acertou o inimigo!");
            jogador.setVida(vidaOponente <= 0 ? 0 : vidaOponente);
        } else {
            System.out.println("Você errou o ataque!");
        }

    }

    public int estaVivo() {
        if (getVida() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
