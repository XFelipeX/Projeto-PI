package Game;
import java.util.Scanner;
public class the_prison {

	public static void main(String[] args) {
	Scanner imput = new Scanner(System.in);

        System.out.println("BEM VINDO AO JOGO 'THE PRISON'.");
        int opcao;
        do {
            System.out.println("1 - Instrução do Jogo: ");
            System.out.println("2 - Começar o jogo: ");
            System.out.println("3 - Créditos do jogo: ");
            System.out.println("4 - Sair: ");
            System.out.println("Escolha uma opção: ");
            opcao = imput.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escrecer as instrucoes do jogo");
                    break;
                case 2:
                    System.out.println("Iniciar o jogo");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Colocar os dreditos do jogo");
                    break;
                case 4:
                    System.out.println("Você está saindo do jogo.");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

        } while (opcao != 4);

    }
}
