import java.util.Random;

public class Jogador {
    private int vida;
    private int ataque;
    private int defesa;

    public Jogador() {
        this.vida = 10;
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

    public void atacar(Inimigo inimigo) {

        setAtaque(gerarValoresAleatorios());
        inimigo.setDefesa(gerarValoresAleatorios());

        int defesaInimigo = inimigo.getDefesa();
        int vidaInimigo = inimigo.getVida();
        int ataqueJogador = getAtaque();

        int dano = ataqueJogador - defesaInimigo;
        System.out.println("Ataque " + getClass().getSimpleName() + ": "  + ataqueJogador);
        System.out.println("Defesa Inimigo: " + defesaInimigo);

        if (ataqueJogador > defesaInimigo) {
            vidaInimigo -= dano;
                      System.out.println("Você acertou o inimigo!");
            inimigo.setVida(vidaInimigo <= 0 ? 0 : vidaInimigo);
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
