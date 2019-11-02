package Game;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
import java.util.Random;
import java.util.Scanner;

public class the_prison {
<<<<<<< HEAD
	static void dificuldade() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | 1 - Fácil   | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | 2 - Normal  | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | 3 - Difícil | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("Escolha uma opção:");
	}

	static void menu() {

		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | | | | THE  PRISON | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  1 - Instruções do Jogo:  | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  2 - Começar o jogo:      | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  3 - Créditos do jogo:    | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  4 - Sair:                | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  Escolha uma opção:       | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
	}

	static void embaralhar(String Vetor[]) { // FUNÇÃO QUE EMBARALHA AS ALTERNATIVAS CONTIDAS NO VETOR
=======
	static void menu() {

		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | | | | THE  PRISON | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  1 - Instru��es do Jogo:  | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  2 - Come�ar o jogo:      | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  3 - Cr�ditos do jogo:    | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  4 - Sair:                | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  Escolha uma op��o:       | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
	}

	static void embaralhar(String Vetor[]) { // funcao que embaralha as alternativas contidas no vetor
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI

		Random random = new Random();

		for (int i = 0; i < Vetor.length; i++) {
			int indice2 = random.nextInt(Vetor.length);
			String posicao = Vetor[i];
			Vetor[i] = Vetor[indice2];
			Vetor[indice2] = posicao;
		}

	}

	public static void main(String[] args) {
		/*
<<<<<<< HEAD
		 * CÓDIGO PRINCIPAL!
		 * 
		 * pontoG == PONTOS GANHOS pontoP == PONTOS PERDIDOS TESTANDO, DEPOIS MUDAR
=======
		 * C�DIGO PRINCIPAL!
		 * 
		 * pontoG == pontos ganhos pontoP == pontor perdidos testando, depois mudar
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
		 * 
		 */
		Scanner imput = new Scanner(System.in);
		Scanner imput2 = new Scanner(System.in);
<<<<<<< HEAD

		// DECLARAÇÃO DE VARIAVÉIS
		int ponto = 100, total = 0, pontoG = 100, pontoP = 50, opcao, navegacao = 1;
		String usuario = "";

=======
		int ponto = 500, total = 0, pontoG = 100, pontoP = 50, opcao, navegacao = 1;
		String usuario = "";
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
		do {
			menu();
			opcao = imput.nextInt();

			switch (opcao) {

			case 1:
				do {
					System.out.println(
<<<<<<< HEAD
							"----------------------------------------------INSTRUÇÕES-----------------------------------------------");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"| | | | |             - O jogador começa com 100 pontos iniciais.                             | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - Cada questão vale 100 pontos de respeito.                             | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - É necessário atingir 500 pontos de respeito para concluir o jogo.     | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - Caso erre uma pergunta você perde 50 pontos.                          | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - Caso acerte uma pergunta você ganha 100 pontos.                       | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - O jogador tem 3 tentativas para acertar todas as perguntas.           | | | | |");
=======
							"----------------------------------------------INSTRU��ES-----------------------------------------------");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - Cada quest�o vale 100 pontos de respeito.                             | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - � necess�rio atingir 500 pontos de respeito para concluir o jogo.     | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - Caso erre uma pergunta voc� perde 50 pontos.                          | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - Caso acerte uma pergunta voc� ganha 100 pontos.                       | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Digite 0 para voltar.");
					navegacao = imput.nextInt();

				} while (navegacao != 0);

				break;

			case 2:
<<<<<<< HEAD
				// INICIO DO JOGO
=======
				// inicio do jogo
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
				do {
					System.out.println(
<<<<<<< HEAD
							"----------------------------------------HISTÓRIA DO PERSONAGEM-----------------------------------------");
=======
							"----------------------------------------HIST�RIA DO PERSONAGEM-----------------------------------------");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
<<<<<<< HEAD
							"| | | Você é um estudante da área de TI e acaba de ser preso por hackear uma base militar situada | | |  \r\n"
									+ "| | | em sua cidade, como consequência foi condenado a prisão e mandado para uma prisão de        | | |\r\n"
									+ "| | | segurança máxima no estado do Arizona.                                                      | | |\r\n"
									+ "| | |                                                                                             | | |\r\n"
									+ "| | |   * Você tem algumas restrições no presídio;                                                | | |\r\n"
									+ "| | |     - Proibido de acessar qualquer equipamento eletrônico;                                  | | |\r\n"
									+ "| | |     - Você está em uma área isolada dos outros detentos no nível 1 da prisão;               | | |\r\n"
									+ "| | |     - Você está em uma área de segurança máxima onde está isolado,sem acesso a              | | |\r\n"
									+ "| | |     outros detentos e sem nenhuma regalia.                                                  | | |\r\n"
									+ "| | |                                                                                             | | |\r\n"
									+ "| | |   * Objetivo do jogo;                                                                       | | |\r\n"
									+ "| | |     O seu objetivo é obter informações para acessar os outros níveis da prisão,             | | |\r\n"
									+ "| | |     com isso você poderá ter acesso a outras pessoas e recursos para poder sair da prisão,  | | |\r\n"
									+ "| | |     caso não seja descoberto.                                                               | | |\r\n"
=======
							"| | | Voc� � um estudante da �rea de TI e acaba de ser preso por hackear uma base militar situada | | |  \r\n"
									+ "| | | em sua cidade, como consequ�ncia foi condenado a pris�o e mandado para uma pris�o de        | | |\r\n"
									+ "| | | seguran�a m�xima no estado do Arizona.                                                      | | |\r\n"
									+ "| | |                                                                                             | | |\r\n"
									+ "| | |   * Voc� tem algumas restri��es no pres�dio;                                                | | |\r\n"
									+ "| | |     - Proibido de acessar qualquer equipamento eletr�nico;                                  | | |\r\n"
									+ "| | |     - Voc� est� em uma �rea isolada dos outros detentos no n�vel 1 da pris�o;               | | |\r\n"
									+ "| | |     - Voc� est� em uma �rea de seguran�a m�xima onde est� isolado,sem acesso a              | | |\r\n"
									+ "| | |     outros detentos e sem nenhuma regalia.                                                  | | |\r\n"
									+ "| | |                                                                                             | | |\r\n"
									+ "| | |   * Objetivo do jogo;                                                                       | | |\r\n"
									+ "| | |     O seu objetivo � obter informa��es para acessar os outros n�veis da pris�o,             | | |\r\n"
									+ "| | |     com isso voc� poder� ter acesso a outras pessoas e recursos para poder sair da pris�o,  | | |\r\n"
									+ "| | |     caso n�o seja descoberto.                                                               | | |\r\n"
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
									+ "| | |                                                                                             | | |\r\n"
									+ "| | |     Boa sorte, detento!                                                                     | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
<<<<<<< HEAD
					System.out.println("Digite 0 para voltar e 1 para começar o jogo.");
=======
					System.out.println("Digite 0 para voltar e 1 para come�ar o jogo.");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI

					navegacao = imput.nextInt();
					if (navegacao == 1) {
<<<<<<< HEAD
						dificuldade();
						opcao = imput.nextInt();

						// DIFICULDADE: FÁCIL

						if (opcao == 1) { // DIFICULDADE: FÁCIL
							System.out.println("Informe seu nome detento:");
							usuario = imput2.nextLine();

							boolean acertou = false;
							int contador = 0;
							String alternativa1[] = new String[5];
							alternativa1[0] = "do/while.";
							alternativa1[1] = "while.";
							alternativa1[2] = "for.";
							alternativa1[3] = "repeat.";
							alternativa1[4] = "for/while.";// RESPOSTA CORRETA

=======
//1 questao
						System.out.println("Informe seu nome detento:");
						usuario = imput2.next();
						boolean acertou = false;
						int contador = 0;
						String alternativa1[] = new String[5];
						alternativa1[0] = "boolean.";
						alternativa1[1] = "byte.";
						alternativa1[2] = "short.";
						alternativa1[3] = "long.";
						alternativa1[4] = "double.";// correta

						System.out.println("\n");
						System.out.println(
								"-------------------------------------------------------------------------------------------------------");
						System.out.println(
								"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
						System.out.println(
								"| | |                                                                                             | | |");
						System.out.println(
								"| | | (Guarda) Bill Gates: Est� com dificuldades na faculdade, ajude ele a solucionar             | | |\r\n"
								+"| | |                      esse problema!                                                         | | |");
						System.out.println(
								"| | |                                                                                             | | |");
						System.out.println(
								"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
						System.out.println(
								"-------------------------------------------------------------------------------------------------------");
						System.out.println("\n");

						do {
							System.out.println("Em Java, uma vari�vel de ponto flutuante � uma vari�vel do tipo: ");
							System.out.println("\n");
							embaralhar(alternativa1);
							System.out.println("a) " + alternativa1[0]);
							System.out.println("b) " + alternativa1[1]);
							System.out.println("c) " + alternativa1[2]);
							System.out.println("d) " + alternativa1[3]);
							System.out.println("e) " + alternativa1[4]);
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
							System.out.println("\n");
<<<<<<< HEAD
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | (Guarda) Bill Gates: Está com dificuldades na faculdade, ajude ele a solucionar             | | |\r\n"
											+ "| | |                      esse problema!                                                         | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
=======
							System.out.print("Qual a alternativa certa?: ");
							String resposta = imput.next();

>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
							System.out.println("\n");
<<<<<<< HEAD

							do {
								System.out.println(
										"Existe um laço de repetição que sempre é executado pelo menos uma vez: ");
=======
							switch (resposta) {
							case "a":
							case "A":
								if (alternativa1[0] == ("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n"); // testando, para ver se roda certo.
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n"); // testando, para ver se raoda certo.
								}
								break;
							case "b":
							case "B":
								if (alternativa1[1].equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "c":
							case "C":
								if (alternativa1[2].equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "d":
							case "D":
								if (alternativa1[3].equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "e":
							case "E":
								if (alternativa1[4].equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							default:
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
								System.out.println("\n");
								embaralhar(alternativa1);
								System.out.println("a) " + alternativa1[0]);
								System.out.println("b) " + alternativa1[1]);
								System.out.println("c) " + alternativa1[2]);
								System.out.println("d) " + alternativa1[3]);
								System.out.println("e) " + alternativa1[4]);
								System.out.println("\n");
								System.out.print("Qual a alternativa certa?: ");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa1[0] == ("do/while.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "b":
								case "B":
									if (alternativa1[1] == ("do/while.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa1[2] == ("do/while.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa1[3] == ("do/while.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa1[4] == ("do/while.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Invalida.");
									System.out.println("\n");
								}
								contador++;
							} while (!acertou && contador <= 2);
							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;

							}
<<<<<<< HEAD
							System.out.println("Parabéns voce passou do primeiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();
							if (navegacao == 1) {

								// QUESTÃO DE NÚMERO 2: FÁCIL
								acertou = false;
								contador = 0;
								String alternativa2[] = new String[5];
								alternativa2[0] = "enquanto e system.out.print";
								alternativa2[1] = "escreva e write";
								alternativa2[2] = "enquanto e while";
								alternativa2[3] = "escreva e system.out.print"; // RESPOSTA CORRETA
								alternativa2[4] = "leia e scanner (system.in)";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | (Guarda)Mark Zuckerberg: Minha filha está tendo problemas para resolver um                  | | |\r\n"
												+ "| | |                          exercício da escola, me ajude com isto e posso                     | | |\r\n"
												+ "| | |                          conseguir com que você possa acessar outra ala da prisão,          | | |\r\n"
												+ "| | |                          mas nada além disso detento!                                       | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");
								do {
									System.out.println(
											"Em relação as funções de saída nos algoritmos e JAVA respectivamente,\n"
													+ " marque a alternativa CORRETA: ");
									System.out.println("\n");
									embaralhar(alternativa2);
									System.out.println("a) " + alternativa2[0]);
									System.out.println("b) " + alternativa2[1]);
									System.out.println("c) " + alternativa2[2]);
									System.out.println("d) " + alternativa2[3]);
									System.out.println("e) " + alternativa2[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa2[0] == ("escreva e system.out.print")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa2[1] == ("escreva e system.out.print")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa2[2] == ("escreva e system.out.print")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa2[3] == ("escreva e system.out.print")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa2[4] == ("escreva e system.out.print")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns voce passou do segundo nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO DE NÚMERO 3: FÁCIL
							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa3[] = new String[5];
								alternativa3[0] = "import, package e class.";
								alternativa3[1] = "class, package e import.";
								alternativa3[2] = "class, import e package.";
								alternativa3[3] = "package, class e import.";
								alternativa3[4] = "package, import e class.";// RESPOSTA CORRETA

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | (Guarda)Alan Turing: Algoritmo? este nome me parece familiar...                             | | |\r\n"
												+ "| | |                      pode refrescar minha memória?                                          | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa3);
									System.out.println(
											"Os três elementos básicos quando contidos num arquivo fonte Java\n"
													+ " devem obrigatoriamente se apresentar na seguinte ordem:");
									System.out.println("\n");

									System.out.println("a) " + alternativa3[0]);
									System.out.println("b) " + alternativa3[1]);
									System.out.println("c) " + alternativa3[2]);
									System.out.println("d) " + alternativa3[3]);
									System.out.println("e) " + alternativa3[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa3[0] == ("package, import e class.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa3[1] == ("package, import e class.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa3[2] == ("package, import e class.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa3[3] == ("package, import e class.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa3[4] == ("package, import e class.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns você passou do terceiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// 4 questao facil
							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa4[] = new String[5];
								alternativa4[0] = "Comando de saída.";
								alternativa4[1] = "Estrutura de decisão.";
								alternativa4[2] = "Variável."; // resposta correta
								alternativa4[3] = "Fluxograma.";
								alternativa4[4] = "Comando de entrada.";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Guarda) Steve Jobs ...");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa4);
									System.out.println(
											"Para realizar o armazenamento de um determinado valor na memória do computador \n"
													+ " é necessária a declaração de:");
									System.out.println("\n");

									System.out.println("a) " + alternativa4[0]);
									System.out.println("b) " + alternativa4[1]);
									System.out.println("c) " + alternativa4[2]);
									System.out.println("d) " + alternativa4[3]);
									System.out.println("e) " + alternativa4[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa4[0] == ("Variável.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");// testando, para ver se roda certo.
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");// testando, para ver se roda certo.
										}
										break;
									case "b":
									case "B":
										if (alternativa4[1] == ("Variável.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa4[2] == ("Variável.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa4[3] == ("Variável.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa4[4] == ("Variável.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns você passou do quarto nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

//05 Questão facil
							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa5[] = new String[5];
								alternativa5[0] = "O resultado final será n3 = 9.";
								alternativa5[1] = "O resultado final será n3 = 29.";
								alternativa5[2] = "O resultado final será n3 = 18.";
								alternativa5[3] = "O resultado final será n3 = 28.";
								alternativa5[4] = "O resultado final será n3 = 38."; // resposta correta

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Diretor) Gavin Belson... ");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa5);
									System.out.println(
											" Assinale a alternativa que mostra exatamente o que será impresso de acordo com o \n"
													+ "pseudocódigo abaixo, caso o usuário insira o valor 10 para n1.");
									System.out.println("inicio\n" + "inteiro: n1,n2,n3;\n" + "leia (n1);\n"
											+ "n2<-n1*3;\n" + "n3<-n1-2+n2;\n"
											+ "imprima(\"O resultado final será n3=\",n3);\n" + "fim");
									System.out.println("\n");
									System.out.println("a) " + alternativa5[0]);
									System.out.println("b) " + alternativa5[1]);
									System.out.println("c) " + alternativa5[2]);
									System.out.println("d) " + alternativa5[3]);
									System.out.println("e) " + alternativa5[4]);

									System.out.println("\n");

									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("O resultado final será n3 = 38.")) {
											System.out.println("Resposta Correta! ");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa5[1] == ("O resultado final será n3 = 38.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa5[2] == ("O resultado final será n3 = 38.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa5[3] == ("O resultado final será n3 = 38.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa5[4] == ("O resultado final será n3 = 38.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
								System.out.println("Parabéns você escapou da prisão!!");
								System.out.println("Digite 0 para voltar ao menu principal.");
								navegacao = imput.nextInt();
							}

						}
						// DIFICULDADE: NORMAL

						if (opcao == 2) { // DIFICULDADE: NORMAL

							// QUESTÃO DE NÚMERO 1: NORMAL

							System.out.println("Informe seu nome detento:");
							usuario = imput2.next();

							boolean acertou = false;
							int contador = 0;
							String alternativa1[] = new String[5];
							alternativa1[0] = "boolean.";
							alternativa1[1] = "byte.";
							alternativa1[2] = "short.";
							alternativa1[3] = "long.";
							alternativa1[4] = "double.";// RESPOSTA CORRETA

							System.out.println("\n");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | (Guarda) Bill Gates: Está com dificuldades na faculdade, ajude ele a solucionar             | | |\r\n"
											+ "| | |                      esse problema!                                                         | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								System.out.println("Em Java, uma variável de ponto flutuante é uma variável do tipo: ");
								System.out.println("\n");
								embaralhar(alternativa1);
								System.out.println("a) " + alternativa1[0]);
								System.out.println("b) " + alternativa1[1]);
								System.out.println("c) " + alternativa1[2]);
								System.out.println("d) " + alternativa1[3]);
								System.out.println("e) " + alternativa1[4]);
								System.out.println("\n");
								System.out.print("Qual a alternativa certa?: ");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa1[0] == ("double.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "b":
								case "B":
									if (alternativa1[1].equals("double.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa1[2].equals("double.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa1[3].equals("double.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa1[4].equals("double.")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Invalida.");
									System.out.println("\n");
								}
								contador++;
							} while (!acertou && contador <= 2);
							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;

							}
							System.out.println("Parabéns voce passou do primeiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							if (navegacao == 1) {
								// QUESTÃO DE NÚMERO 2: NORMAL

								acertou = false;
								contador = 0;
								String alternativa2[] = new String[5];
								alternativa2[0] = "int, string, long e real.";
								alternativa2[1] = "char, int, real e bit.";
								alternativa2[2] = "boolean, double, float e byte."; // RESPOSTA CORRETA
								alternativa2[3] = "real, short, long e char.";
								alternativa2[4] = "string, long int, short int e float.";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | (Guarda)Mark Zuckerberg: Minha filha está tendo problemas para resolver um                  | | |\r\n"
												+ "| | |                          exercício da escola, me ajude com isto e posso                     | | |\r\n"
												+ "| | |                          conseguir com que você possa acessar outra ala da prisão,          | | |\r\n"
												+ "| | |                          mas nada além disso, detento!                                      | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									System.out.println("São tipos primitivos da linguagem Java: ");
									System.out.println("\n");
									embaralhar(alternativa2);
									System.out.println("a) " + alternativa2[0]);
									System.out.println("b) " + alternativa2[1]);
									System.out.println("c) " + alternativa2[2]);
									System.out.println("d) " + alternativa2[3]);
									System.out.println("e) " + alternativa2[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa2[0] == ("boolean, double, float e byte.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa2[1] == ("boolean, double, float e byte.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa2[2] == ("boolean, double, float e byte.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa2[3] == ("boolean, double, float e byte.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa2[4] == ("boolean, double, float e byte.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns voce passou do segundo nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO DE NÚMERO 3: NORMAL

							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa3[] = new String[5];
								alternativa3[0] = "100";
								alternativa3[1] = "120";
								alternativa3[2] = "50"; // RESPOSTA CORRETA
								alternativa3[3] = "60";
								alternativa3[4] = "110";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | (Guarda)Alan Turing: Algoritmo? este nome me parece familiar...                             | | |\r\n"
												+ "| | |                      pode refrescar minha memória?                                          | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa3);
									System.out.println("Um determinado algoritmo recebe dois valores e armazena\r\n"
											+ "nas variáveis A e B, em sequência faz o seguinte processamento \r\n"
											+ "math.pow(A, B)/2  supondo que A <- 10 e B <-2 \r\n"
											+ "qual seria a saída de dados? \r\n");
									System.out.println("\n");

									System.out.println("a) " + alternativa3[0]);
									System.out.println("b) " + alternativa3[1]);
									System.out.println("c) " + alternativa3[2]);
									System.out.println("d) " + alternativa3[3]);
									System.out.println("e) " + alternativa3[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa3[0] == ("50")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa3[1] == ("50")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa3[2] == ("50")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa3[3] == ("50")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa3[4] == ("50")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns você passou do terceiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();
							// QUESTÃO DE NÚMERO 4: NORMAL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa4[] = new String[5];
								alternativa4[0] = "10";
								alternativa4[1] = "15"; // RESPOSTA CORRETA
								alternativa4[2] = "20";
								alternativa4[3] = "25";
								alternativa4[4] = "30";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | (Guarda) Steve está com duvidas sobre uma código. Detento me ajude "
												+ "e vou te liberar para próximo nível  ...");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa4);

									System.out.println("Analise o trecho do algoritmo abaixo.\r\n" + "\r\n"
											+ "Algoritimo\r\n" + "Var\r\n" + "valor1, valor2 :inteiro\r\n"
											+ "Inicio\r\n" + "valor1 <- 10\r\n" + "valor2 <- 20\r\n"
											+ "Se(valor2 > valor1)\r\n" + "valor2 <- valor1+valor2/2\r\n" + "Fim-Se\r\n"
											+ "Escreva valor2\r\n" + "Fim");
									System.out.println("\n");
									System.out.println(
											"Assinale a alternativa correta, em relação á saída do código acima.");
									System.out.println("\n");

									System.out.println("a) " + alternativa4[0]);
									System.out.println("b) " + alternativa4[1]);
									System.out.println("c) " + alternativa4[2]);
									System.out.println("d) " + alternativa4[3]);
									System.out.println("e) " + alternativa4[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa4[0] == ("15")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa4[1] == ("15")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa4[2] == ("15")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa4[3] == ("15")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa4[4] == ("15")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você passou do quarto nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO DE NÚMERO 5: NORMAL

							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa5[] = new String[5];
								alternativa5[0] = "Linguagem de programação.";
								alternativa5[1] = "Estrutura sequencial.";
								alternativa5[2] = "Sequência de passos lógicos."; // RESPOSTA CORRETA
								alternativa5[3] = "IDE muito utilizada por programadores experientes.";
								alternativa5[4] = "Matemática aplicada a TI.";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Diretor) Gavin Belson... ");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa5);
									System.out.println(" O que é um algoritmo?");
									System.out.println("\n");
									System.out.println("a) " + alternativa5[0]);
									System.out.println("b) " + alternativa5[1]);
									System.out.println("c) " + alternativa5[2]);
									System.out.println("d) " + alternativa5[3]);
									System.out.println("e) " + alternativa5[4]);

									System.out.println("\n");

									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta! ");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa5[1] == ("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa5[2] == ("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa5[3] == ("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa5[4] == ("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");

										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns você escapou da prisão!!");
							System.out.println("Digite 0 para voltar ao menu principal.");
							navegacao = imput.nextInt();
						}
						// DIFICULDADE: DIFÍCIL

						if (opcao == 3) { // DIFICULDADE: DIFÍCIL

							// QUESTÃO DE NÚMERO 1: DIFÍCIL

							System.out.println("Informe seu nome detento:");
							usuario = imput2.next();

							boolean acertou = false;
							int contador = 0;
							String alternativa1[] = new String[5];
							alternativa1[0] = " “ [ e ] ” ";
							alternativa1[1] = " “ { ” e “ } ” "; // RESPOSTA CORRETA
							alternativa1[2] = " “ [ ” e “ ] ” ";
							alternativa1[3] = " “Início” e “Fim” ";
							alternativa1[4] = " “ ( ” e “ ) ” ";

							System.out.println("\n");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | (Guarda) Bill Gates: Está com dificuldades na faculdade, ajude ele a solucionar             | | |\r\n"
											+ "| | |                      esse problema!                                                         | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								embaralhar(alternativa1);
								// ALTERNATIVA NO SYSTEM ABAIXO
								System.out.println(
										"Em relação aos delimitadores de blocos em JAVA, marque a alternativa VERDADEIRA: ");
								System.out.println("\n");
								System.out
										.println("Assinale a alternativa correta, em relação á saída do código acima.");
								System.out.println("\n");

								System.out.println("a) " + alternativa1[0]);
								System.out.println("b) " + alternativa1[1]);
								System.out.println("c) " + alternativa1[2]);
								System.out.println("d) " + alternativa1[3]);
								System.out.println("e) " + alternativa1[4]);
								System.out.println("\n");
								System.out.println("Qual é a alternativa correta?");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa1[0] == (" “ { ” e “ } ” ")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								case "b":
								case "B":
									if (alternativa1[1] == (" “ { ” e “ } ” ")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa1[2] == (" “ { ” e “ } ” ")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa1[3] == (" “ { ” e “ } ” ")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa1[4] == (" “ { ” e “ } ” ")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Inválida.");
									System.out.println("\n");
								}
								contador++;
							} while ((!acertou) && (contador <= 2));

							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;
							}

							// feedback
							// Um bloco é definido por ({}) e contém um grupo de outros blocos. Quando um
							// novo
							// bloco é criado um novo escopo local é aberto e permite a definição de
							// variáveis locais. As
							// variáveis definidas dentro de um bloco só podem ser vistas internamente a
							// este, e são
							// terminadas ou extintas no final da execução deste(}).

							System.out.println("Parabéns você passou do primeiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO DE NÚMERO 2: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa2[] = new String[5];
								alternativa2[0] = "18";
								alternativa2[1] = "21"; // RESPOSTA CORRETA
								alternativa2[2] = "19";
								alternativa2[3] = "20";
								alternativa2[4] = "22";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | (Guarda)Mark Zuckerberg: Minha filha está tendo problemas para resolver um                  | | |\r\n"
												+ "| | |                          exercício da escola, me ajude com isto e posso                     | | |\r\n"
												+ "| | |                          conseguir com que você possa acessar outra ala da prisão,          | | |\r\n"
												+ "| | |                          mas nada além disso, detento!                                      | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa2);
									// ALTERNATIVA NO SYSTEM ABAIXO
									System.out.println(
											" Com relação a funções e procedimentos na linguagem JAVA, analise o programa abaixo desenvolvido no ambiente Netbeans 7.3:\r\n"
													+ "\r\n" + "public class Fibonacci {\r\n"
													+ "        static long f (int n) {\r\n"
													+ "              if (n < 2) {\r\n"
													+ "                   return n;\r\n" + "              }else {\r\n"
													+ "                  return f(n - 1) + f {n - 2);\r\n"
													+ "              }\r\n" + "        }\r\n"
													+ "        public static void main(String[ ] args) {\r\n"
													+ "        int i ;\r\n"
													+ "        for  ( i = 0; i < 8; i++) { }\r\n"
													+ "              System.out.println (f (i)) ;\r\n" + "        }\r\n"
													+ "}\r\n" + "\r\n"
													+ "Assinale a opção que apresenta o valor que será impresso pelo programa acima. ");
									System.out.println("\n");
									System.out.println(
											"Assinale a alternativa correta, em relação á saída do código acima.");
									System.out.println("\n");

									System.out.println("a) " + alternativa2[0]);
									System.out.println("b) " + alternativa2[1]);
									System.out.println("c) " + alternativa2[2]);
									System.out.println("d) " + alternativa2[3]);
									System.out.println("e) " + alternativa2[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa2[0] == ("21")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa2[1] == ("21")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa2[2] == ("21")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa2[3] == ("21")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa2[4] == ("21")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você passou do segundo nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO NÚMERO 3: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa3[] = new String[5];
								alternativa3[0] = "if; for; while.";
								alternativa3[1] = "if; if ... else; switch."; // RESPOSTA CORRETA
								alternativa3[2] = "while; switch; else.";
								alternativa3[3] = "if; while; do while.";
								alternativa3[4] = "if...else; for; printf;";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Guarda)  ...");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa3);
									// ALTERNATIVA NO SYSTEM ABAIXO
									System.out.println(
											" Acerca da programação orientada a objetos, usando Java, analise a seguinte assertiva:"
													+ " “O Java contém três tipos de instruções de seleção\". ");
									System.out.println("\n");
									System.out.println(
											"Assinale a alternativa correta, em relação á saída do código acima.");
									System.out.println("\n");

									System.out.println("a) " + alternativa3[0]);
									System.out.println("b) " + alternativa3[1]);
									System.out.println("c) " + alternativa3[2]);
									System.out.println("d) " + alternativa3[3]);
									System.out.println("e) " + alternativa3[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa3[0] == ("if; if ... else; switch.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa3[1] == ("if; if ... else; switch.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa3[2] == ("if; if ... else; switch.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa3[3] == ("if; if ... else; switch.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa3[4] == ("if; if ... else; switch.")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você passou do terceiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO NÚMERO 4: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa4[] = new String[5];
								alternativa4[0] = " ";
								alternativa4[1] = " "; // RESPOSTA CORRETA
								alternativa4[2] = " ";
								alternativa4[3] = " ";
								alternativa4[4] = " ";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Guarda)  ...");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa4);
									// ALTERNATIVA NO SYSTEM ABAIXO
									System.out.println(" *** ");
									System.out.println("\n");
									System.out.println(
											"Assinale a alternativa correta, em relação á saída do código acima.");
									System.out.println("\n");

									System.out.println("a) " + alternativa4[0]);
									System.out.println("b) " + alternativa4[1]);
									System.out.println("c) " + alternativa4[2]);
									System.out.println("d) " + alternativa4[3]);
									System.out.println("e) " + alternativa4[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa4[0] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa4[1] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa4[2] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa4[3] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa4[4] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você passou do quarto nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO NÚMERO 5: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa5[] = new String[5];
								alternativa5[0] = " ";
								alternativa5[1] = " "; // RESPOSTA CORRETA
								alternativa5[2] = " ";
								alternativa5[3] = " ";
								alternativa5[4] = " ";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Diretor) Gavin Belson... ");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa5);
									// ALTERNATIVA NO SYSTEM ABAIXO
									System.out.println(" *** ");
									System.out.println("\n");
									System.out.println(
											"Assinale a alternativa correta, em relação á saída do código acima.");
									System.out.println("\n");

									System.out.println("a) " + alternativa5[0]);
									System.out.println("b) " + alternativa5[1]);
									System.out.println("c) " + alternativa5[2]);
									System.out.println("d) " + alternativa5[3]);
									System.out.println("e) " + alternativa5[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa5[1] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa5[2] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa5[3] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa5[4] == (" ")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você escapou da prisão!!");
							System.out.println("Digite 0 para voltar ao menu principal.");
							navegacao = imput.nextInt();
						}

					} else {
						System.out.println("Opção inválida!");
=======
							contador++;
						} while (!acertou && contador <= 2);
						if (acertou == false) {
							System.out.println("GAME OVER.");
							break;

						}

					}
					System.out.println("Parab�ns voce passou do primeiro n�vel.");
					System.out.println("Digite 1 para continuar.");
					navegacao = imput.nextInt();
					if (navegacao == 1) {
//2 questao
						boolean acertou = false;
						int contador = 0;
						String alternativa2[] = new String[5];
						alternativa2[0] = "int, string, long e real.";
						alternativa2[1] = "char, int, real e bit.";
						alternativa2[2] = "boolean, double, float e byte."; // resposta correta
						alternativa2[3] = "real, short, long e char.";
						alternativa2[4] = "string, long int, short int e float.";

						System.out.println("\n");
						System.out.println(
								"-------------------------------------------------------------------------------------------------------");
						System.out.println(
								"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
						System.out.println(
								"| | |                                                                                             | | |");
						System.out.println(
								"| | | (Guarda)Mark Zuckerberg: Minha filha est� tendo problemas para resolver um                  | | |\r\n"
										+ "| | |                          exerc�cio da escola, me ajude com isto e posso                     | | |\r\n"
										+ "| | |                          conseguir com que voc� possa acessar outra ala da pris�o,          | | |\r\n"
										+ "| | |                          mas nada al�m disso detento!                                       | | |");
						System.out.println(
								"| | |                                                                                             | | |");
						System.out.println(
								"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
						System.out.println(
								"-------------------------------------------------------------------------------------------------------");
						System.out.println("\n");

						do {
							System.out.println("S�o tipos primitivos da linguagem Java: ");
							System.out.println("\n");
							embaralhar(alternativa2);
							System.out.println("a) " + alternativa2[0]);
							System.out.println("b) " + alternativa2[1]);
							System.out.println("c) " + alternativa2[2]);
							System.out.println("d) " + alternativa2[3]);
							System.out.println("e) " + alternativa2[4]);

							System.out.println("\n");
							System.out.print("Qual a alternativa certa?: ");
							String resposta = imput.next();

							System.out.println("\n");
							switch (resposta) {
							case "a":
							case "A":
								if (alternativa2[0]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG; //
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");// testando, para ver se roda certo.
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");// testando, para ver se raoda certo.
								}
								break;
							case "b":
							case "B":
								if (alternativa2[1]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "c":
							case "C":
								if (alternativa2[2]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "d":
							case "D":
								if (alternativa2[3]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "e":
							case "E":
								if (alternativa2[4]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							default:
								System.out.println("\n");
								System.out.println("Escolha Inv�lida.");
								System.out.println("\n");
							}
							contador++;
						} while (!acertou && contador <= 2);
						if (acertou == false) {
							System.out.println("GAME OVER.");
							break;

						}
						System.out.println("Parab�ns voce passou do segundo n�vel.");
						System.out.println("Digite 1 para continuar.");
						navegacao = imput.nextInt();
//3 questao	
						if (navegacao == 1) {
							acertou = false;
							contador = 0;

							String alternativa3[] = new String[5];
							alternativa3[0] = "100";
							alternativa3[1] = "120";
							alternativa3[2] = "50"; // resposta correta
							alternativa3[3] = "60";
							alternativa3[4] = "110";

							System.out.println("\n");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | (Guarda)Alan Turing: Algoritmo? este nome me parece familiar...                             | | |\r\n"
									+"| | |                      pode refrescar minha mem�ria?                                          | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								embaralhar(alternativa3);
								System.out.println("Um determinado algoritmo recebe dois valores e armazena\r\n"
										+ "nas vari�veis A e B, em sequ�ncia faz o seguinte processamento \r\n"
										+ "math.pow(A, B)/2  supondo que A <- 10 e B <-2 \r\n"
										+ "qual seria a sa�da de dados? \r\n");
								System.out.println("\n");

								System.out.println("a) " + alternativa3[0]);
								System.out.println("b) " + alternativa3[1]);
								System.out.println("c) " + alternativa3[2]);
								System.out.println("d) " + alternativa3[3]);
								System.out.println("e) " + alternativa3[4]);

								System.out.println("\n");
								System.out.print("Qual a alternativa certa?: ");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa3[0] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG; //
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");// testando, para ver se roda certo.
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");// testando, para ver se roda certo.
									}
									break;
								case "b":
								case "B":
									if (alternativa3[1] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa3[2] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa3[3] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa3[4] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Inv�lida.");
									System.out.println("\n");
								}
								contador++;
							} while (!acertou && contador <= 2);
							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;

							}
						}
						System.out.println("Parab�ns voc� passou do terceiro n�vel.");
						System.out.println("Digite 1 para continuar.");
						navegacao = imput.nextInt();
//Quest�o 4	Marcus V.						
						if (navegacao == 1) {

							acertou = false;
							contador = 0;

							String alternativa4[] = new String[5];
							alternativa4[0] = "10";
							alternativa4[1] = "15"; // resposta correta
							alternativa4[2] = "20";
							alternativa4[3] = "25";
							alternativa4[4] = "30";

							System.out.println("\n");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println("| | | (Guarda) Steve Jobs ...");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								embaralhar(alternativa4);

								System.out.println("Analise o trecho do algoritmo abaixo.\r\n" + "\r\n"
										+ "Algoritimo\r\n" + "Var\r\n" + "valor1, valor2 :inteiro\r\n" + "Inicio\r\n"
										+ "valor1 <- 10\r\n" + "valor2 <- 20\r\n" + "Se(valor2 > valor1)\r\n"
										+ "valor2 <- valor1+valor2/2\r\n" + "Fim-Se\r\n" + "Escreva valor2\r\n"
										+ "Fim");
								System.out.println("\n");
								System.out
										.println("Assinale a alternativa correta, em rela��o � sa�da do c�digo acima.");
								System.out.println("\n");

								System.out.println("a) " + alternativa4[0]);
								System.out.println("b) " + alternativa4[1]);
								System.out.println("c) " + alternativa4[2]);
								System.out.println("d) " + alternativa4[3]);
								System.out.println("e) " + alternativa4[4]);
								System.out.println("\n");
								System.out.println("Qual � a alternativa correta?");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa4[0] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "b":
								case "B":
									if (alternativa4[1] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa4[2] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa4[3] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa4[4] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Inv�lida.");
									System.out.println("\n");
								}
								contador++;
							} while ((!acertou) && (contador <= 2));

							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;
							}
// Quest�o 05
							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa5[] = new String[5];
								alternativa5[0] = "Linguagem de programa��o.";
								alternativa5[1] = "Estrutura sequencial.";
								alternativa5[2] = "Sequ�ncia de passos l�gicos."; // resposta correta
								alternativa5[3] = "IDE muito utilizada por programadores experientes.";
								alternativa5[4] = "Matem�tica aplicada a TI.";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Diretor) Gavin Belson... ");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa5);
									System.out.println(" O que � um algoritmo?");
									System.out.println("\n");
									System.out.println("a) " + alternativa5[0]);
									System.out.println("b) " + alternativa5[1]);
									System.out.println("c) " + alternativa5[2]);
									System.out.println("d) " + alternativa5[3]);
									System.out.println("e) " + alternativa5[4]);

									System.out.println("\n");

									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta! ");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa5[1] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa5[2] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa5[3] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa5[4] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inv�lida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
								System.out.println("Parab�ns voc� escapou da pris�o!!");
								System.out.println("Digite 0 para continuar.");
								navegacao = imput.nextInt();

							}
						}

						// Proxima Quest�o exemplo.
						// do {
						// Collections.shuffle(alternativa1);
						// S�o tipos primitivos da linguagem Java:

						// A) int, string, long e real.
						// B) char, int, real e bit.
						// C) boolean, double, float e byte.
						// D) real, short, long e char.
						// E) string, long int, short int e float.

						// contador++;
						// }while (!acertou));

>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
					}

				} while (navegacao != 0);
				break;

			case 3:
				do {
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
							"| | |                                      Desenvolvido por:                                      | | |");
					System.out.println(
							"| | |                                      Felipe Dias                                            | | |");
					System.out.println(
							"| | |                                      Ji Hye Koo                                             | | |");
					System.out.println(
							"| | |                                      Marcus Vinicius                                        | | |");
					System.out.println(
							"| | |                                      Pedro Henrique                                         | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println("\r\n");
					System.out.println("Digite 0 para voltar para o menu.");
					navegacao = imput.nextInt();
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
				} while (navegacao != 0);

				break;

			case 4:
<<<<<<< HEAD
				System.out.println("Você está saindo do jogo...");
=======
				System.out.println("voc� est� saindo do jogo...");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI
				break;

			default:
				System.out.println("Opção inválida.");

			}

		} while (opcao != 4);

	}

}