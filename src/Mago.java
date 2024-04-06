import java.util.Scanner;

public class Mago extends Jogador {
    Scanner scanner = new Scanner(System.in);

    public Mago() {

    }

    public void ataque(Inimigo inimigo) {
        int option = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Escolha seu ataque Mago:");
            System.out.println("1- Bola de Fogo");
            System.out.println("2- Raio Arcano");
            System.out.println("3- Explosão de Gelo");
            System.out.println("4- Míssil Mágico");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }
        System.out.println("");

        switch (option) {
            case 1:
                System.out.println("BOLA DE FOGO!");
                atacar(inimigo);
                break;
            case 2:
                System.out.println("RAIO ARCANO!");
                atacar(inimigo);
                break;
            case 3:
                System.out.println("EXPLOSÃO DE GELO!");
                atacar(inimigo);
                break;
            case 4:
                System.out.println("MISSIL MAGICO!");
                atacar(inimigo);
                break;
            default:
                System.out.println("Opção inválida!");
                ataque(inimigo);
                return;
        }
    }

    public void defesa(Inimigo inimigo) {
        System.out.println("Escolha sua defesa Mago:");
        System.out.println("1- Escudo Mágico");
        System.out.println("2- Teleporte");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Escudo Mágico ativado!");
                //defender(inimigo);
                break;
            case 2:
                System.out.println("Teleporte ativado!");
                //defender(inimigo);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
