import java.util.Random;

public class Inimigo{

    private int vida;
    private int ataque;
    private int defesa;


    public Inimigo() {
        this.vida = 20;
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

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    private int gerarValoresAleatorios() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public void atacar(Jogador jogador) {

        setAtaque(gerarValoresAleatorios());
        jogador.setDefesa(gerarValoresAleatorios());

        int defesaJogador = jogador.getDefesa();
        int vidaJogador = jogador.getVida();
        int ataqueInimigo = getAtaque();

        int dano = ataqueInimigo - defesaJogador;
        System.out.println("Ataque Inimigo: " + ataqueInimigo);
        System.out.println("Defesa " + jogador.getClass().getSimpleName() +": " + defesaJogador);

        if (ataqueInimigo > defesaJogador) {
            vidaJogador -= dano;

            System.out.println("Inimigo acertou o " + jogador.getClass().getSimpleName());
            jogador.setVida(vidaJogador <= 0 ? 0 : vidaJogador);
        } else {
            System.out.println("Inimigo errou o ataque!");
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
