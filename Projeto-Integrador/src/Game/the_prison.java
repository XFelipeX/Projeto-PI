package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class the_prison {

	public static void main(String[] args) {

		Scanner imput = new Scanner(System.in);
		int navegacao = 1;

		System.out.println("--------------------------------");
		System.out.println("| | | | | |THE PRISON| | | | | |");
		System.out.println("--------------------------------");

		int opcao;

		do {

			System.out.println("1 - Instruções do Jogo: ");
			System.out.println("2 - Começar o jogo: ");
			System.out.println("3 - Créditos do jogo: ");
			System.out.println("4 - Sair: ");
			System.out.println("Escolha uma opção: ");
			opcao = imput.nextInt();

			switch (opcao) {

			case 1:
				do {
					System.out.println("--------INSTRUÇÕES---------");
					System.out.println("1 - Cada questão vale 100 pontos de respeito.");
					System.out.println("2 - É necessário atingir 500 pontos de respeito para concluir o jogo.");
					System.out.println("3 - Caso erre uma pergunta você irá perder 50 pontos. ");
					System.out.println("----------------------------------------------------------------------");
					System.out.println("Digite 0 para voltar.");
					navegacao = imput.nextInt();

				} while (navegacao != 0);

				break;

			case 2:

				// inicio do jogo
				do {
					System.out.println("\r\n" + // Introdução e objetivo inicial do jogo

							"Você é um estudante da área de TI e acaba de ser preso por hackear uma base militar situada em sua cidade,\r\n"
							+ "como consequência foi condenado a prisão e mandado para uma prisão de segurança máxima no estado do Arizona.\r\n"
							+ "Você tem algumas restrições no presídio;\r\n"
							+ "-proibido de acessar qualquer equipamento eletrônico;\r\n"
							+ "-você está em uma área isolada dos outros detentos no nível 1 da prisão;\r\n"
							+ "-você está em uma área de segurança máxima onde está isolado, sem acesso a outros detentos e sem nenhuma regalia.\r\n"
							+ "objetivo do jogo;\r\n"
							+ "o seu objetivo é obter informações para acessar os outros níveis da prisão, com isso você poderá ter acesso \r\n"
							+ "a outras pessoas e recursos para poder sair da prisão caso não seja descoberto.\r\n"
							+ "Boa sorte, detento!");

					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------");
					System.out.println("Digite 0 para voltar e 1 para começar o jogo.");
					navegacao = imput.nextInt();
					if (navegacao == 1) {

						boolean acertou = false;
						int contador = 0;

						List alternativa1 = new ArrayList();
						alternativa1.add("boolean.");// correta
						alternativa1.add("byte.");
						alternativa1.add("short.");
						alternativa1.add("long.");
						alternativa1.add("double.");
						
						


						System.out.println("\n");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");
						
						System.out.println("O Guarda Bill Gates está com dificuldades na faculdade, ajude ele a solucionar esse problema!");
						
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");
						System.out.println("\n");
						
						
						do {
							Collections.shuffle(alternativa1);
							System.out.println("Em Java, uma variável de ponto flutuante é uma variável do tipo: ");
							System.out.println("a) " + alternativa1.get(0));
							System.out.println("b) " + alternativa1.get(1));
							System.out.println("c) " + alternativa1.get(2));
							System.out.println("d) " + alternativa1.get(3));
							System.out.println("e) " + alternativa1.get(4));

							System.out.println("Qual a alternativa certa?: ");
							String resposta = imput.next();

							switch (resposta) {
							case "a":
							case "A":
								if (alternativa1.get(0).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							case "b":
							case "B":
								if (alternativa1.get(1).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							case "c":
							case "C":
								if (alternativa1.get(2).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							case "d":
							case "D":
								if (alternativa1.get(3).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							case "e":
							case "E":
								if (alternativa1.get(4).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							default:
								System.out.println("Escolha Invalida.");
							}
							contador++;
						} while (!acertou && contador <= 2);
						if((acertou==false)&&(contador==2))System.out.println("GAME OVER.");
						break;

					}
				} while (navegacao != 0);
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