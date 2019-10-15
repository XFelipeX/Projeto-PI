package Game;
import java.util.Scanner;
public class the_prison {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		    System.out.println("------------------------------");
		    System.out.println("| | | | | |THE PRISON| | | | |");
		    System.out.println("------------------------------");
        int opcao;
        do {
            System.out.println("1 - Instruções do Jogo: ");
            System.out.println("2 - Começar o jogo: ");
            System.out.println("3 - Créditos do jogo: ");
            System.out.println("4 - Sair: ");
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escrecer as instrucoes do jogo");
                    break;
                case 2:
                	// inicio do jogo
                    System.out.println("\r\n" +  // Introdução e objetivo inicial do jogo
                    		"Você é um estudante da área de TI e acaba de ser preso por hackear uma base militar situada em sua cidade,\r\n"+
                    		"como consequência foi condenado a prisão e mandado para uma prisão de segurança máxima no estado do Arizona.\r\n" + 
                    		"Você tem algumas restrições no presídio;\r\n" + 
                    		"-proibido de acessar qualquer equipamento eletrônico;\r\n" + 
                    		"-você está em uma área isolada dos outros detentos no nível 1 da prisão;\r\n" + 
                    		"-você está em uma área de segurança máxima onde está isolado, sem acesso a outros detentos e sem nenhuma regalia.\r\n" + 
                    		"objetivo do jogo;\r\n" + 
                    		"o seu objetivo é obter informações para acessar os outros níveis da prisão, com isso você poderá ter acesso a outras pessoas e recursos para poder sair da prisão caso não seja descoberto.\r\n" + 
                    		"Boa sorte, detento!");
                    break;
                case 3:
                    System.out.println("Colocar os créditos do jogo");
                    break;
                case 4:
                    System.out.println("você está saindo do jogo.");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

        } while (opcao != 4);

    }
}
