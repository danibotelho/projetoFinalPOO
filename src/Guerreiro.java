import java.util.Scanner;
import java.util.Random;

public class Guerreiro extends Jogador {
  
    Scanner scanner = new Scanner(System.in);

    public Guerreiro() { }

    public void ataque(Inimigo inimigo) {
        int option = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Escolha seu ataque Mago:");
            System.out.println("1- Soco devastador");
            System.out.println("2- Ataque do trovão");
            System.out.println("3- Ataque Giratório");
            System.out.println("4- Golpe de Espada");

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
                System.out.println("SOCO DEVASTADOOOR!!");
                atacar(inimigo);
                break;
            case 2:
                System.out.println("ATAQUE DE TROVÃO!!");
                atacar(inimigo);
                break;
            case 3:
                System.out.println("ATAQUE GIRATÓRIO!!");
                atacar(inimigo);
                break;
            case 4:
                System.out.println("GOLPE DE ESPADA!!");
                atacar(inimigo);
                break;
            default:
                System.out.println("Opção inválida!!");
                ataque(inimigo);
                return;

        }
    }


}
