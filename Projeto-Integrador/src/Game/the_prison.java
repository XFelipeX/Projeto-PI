package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class the_prison {

	public static void main(String[] args) {
		/* CÓDIGO PRINCIPAL!
		 * pontoG == pontos ganhos pontoP == pontor perdidos testando, depois mudar
		 */
		Scanner imput = new Scanner(System.in);
		int ponto = 500, total = 0, pontoG = 100, pontoP = 50, opcao, navegacao = 1;
		String usuario = "";
		do {

			System.out.println(
					"----------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"| | | | | | | | | | | | | | | | | | | | | | | | |THE PRISON| | | | | | | | | | | | | | | | | | | | | | | | | | |");
			System.out.println(
					"| | | | | | | | | | | | | | | | | | | | | | | | | | | | |  | | | | | | | | | | | | | | | | | | | | | | | | | | |");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------");
			System.out.println("\n");

			System.out.println("----------------------------");
			System.out.println("|1 - Instruções do Jogo:   |");
			System.out.println("|2 - Começar o jogo:       |");
			System.out.println("|3 - Créditos do jogo:     |");
			System.out.println("|4 - Sair:                 |");
			System.out.println("|Escolha uma opção:        |");
			System.out.println("----------------------------");
			System.out.println("\n");
			opcao = imput.nextInt();

			switch (opcao) {

			case 1:
				do {
					System.out.println("-----------------------------INSTRUÇÕES----------------------------------");
					System.out.println("\r - Cada questão vale 100 pontos de respeito.                         |");
					System.out.println("\r");
					System.out.println("\r - É necessário atingir 500 pontos de respeito para concluir o jogo. |");
					System.out.println("\r");
					System.out.println("\r - Caso erre uma pergunta você perde 50 pontos.                 |");
					System.out.println("\r");
					System.out.println("\r - Caso acerte uma pergunta você ganha 100 pontos.                 |");
					System.out.println("\r");
					System.out.println("-------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Digite 0 para voltar.");
					navegacao = imput.nextInt();

				} while (navegacao != 0);

				break;

			case 2:

				// inicio do jogo
				do {
					System.out.println(
							"------------------------------------------HISTÓRIA DO PERSONAGEM-------------------------------------------------");
					System.out.println("\n");
					System.out.println(
							"Você é um estudante da área de TI e acaba de ser preso por hackear uma base militar situada em sua cidade, \r\n"
									+ "como consequência foi condenado a prisão e mandado para uma prisão de segurança máxima no estado do Arizona.\r\n"
									+ "\r\n" + "  Você tem algumas restrições no presídio;\r\n" + "\r\n"
									+ "- Proibido de acessar qualquer equipamento eletrônico;\r\n"
									+ "- Você está em uma área isolada dos outros detentos no nível 1 da prisão;\r\n"
									+ "- Você está em uma área de segurança máxima onde está isolado,\r\n"
									+ "  sem acesso a outros detentos e sem nenhuma regalia.\r\n" + "  \r\n"
									+ "  Objetivo do jogo;\r\n" + "\r\n"
									+ "O seu objetivo é obter informações para acessar os outros níveis da prisão,\r\n"
									+ "com isso você poderá ter acesso a outras pessoas e recursos para poder sair da prisão,\r\n"
									+ "caso não seja descoberto.\r\n" + "\r\n" + "Boa sorte, detento!");
					System.out.println("\n");
					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Digite 0 para voltar e 1 para começar o jogo.");
					navegacao = imput.nextInt();
					if (navegacao == 1) {
//1 questao
						System.out.println("Informe seu nome detento:");
						usuario = imput.next();
						boolean acertou = false;
						int contador = 0;

						List alternativa1 = new ArrayList();
						alternativa1.add("boolean.");
						alternativa1.add("byte.");
						alternativa1.add("short.");
						alternativa1.add("long.");
						alternativa1.add("double.");// correta

						System.out.println("\n");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");

						System.out.println(
								"(Guarda) Bill Gates está com dificuldades na faculdade, ajude ele a solucionar esse problema!");

						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");
						System.out.println("\n");

						do {
							Collections.shuffle(alternativa1);
							System.out.println("Em Java, uma variável de ponto flutuante é uma variável do tipo: ");
							System.out.println("\n");

							System.out.println("a) " + alternativa1.get(0));
							System.out.println("b) " + alternativa1.get(1));
							System.out.println("c) " + alternativa1.get(2));
							System.out.println("d) " + alternativa1.get(3));
							System.out.println("e) " + alternativa1.get(4));

							System.out.println("\n");
							System.out.print("Qual a alternativa certa?: ");
							String resposta = imput.next();

							System.out.println("\n");
							switch (resposta) {
							case "a":
							case "A":
								if (alternativa1.get(0).equals("double.")) {
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
								if (alternativa1.get(1).equals("double.")) {
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
								if (alternativa1.get(2).equals("double.")) {
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
								if (alternativa1.get(3).equals("double.")) {
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
								if (alternativa1.get(4).equals("double.")) {
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
								System.out.println("Escolha Invalida.");
								System.out.println("\n");
							}
							contador++;
						} while (!acertou && contador <= 2);
						if (acertou == false) {
							System.out.println("GAME OVER.");
							break;

						}

					}
					System.out.println("Parabéns voce passou do primeiro nível.");
					System.out.println("Digite 1 para continuar.");
					navegacao = imput.nextInt();
					if (navegacao == 1) {
//2 questao
						boolean acertou = false;
						int contador = 0;

						List alternativa2 = new ArrayList();
						alternativa2.add("int, string, long e real.");
						alternativa2.add("char, int, real e bit.");
						alternativa2.add("boolean, double, float e byte."); // resposta correta
						alternativa2.add("real, short, long e char.");
						alternativa2.add("string, long int, short int e float.");

						System.out.println("\n");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");

						System.out.println(
								"(Guarda)Mark Zuckerberg: Minha filha está tendo problemas para resolver um \r\n"
										+ "exercício da escola, me ajude com isto \r\n"
										+ "e posso conseguir com que você possa acessar outra ala da prisão.\r\n"
										+ "mas nada além disso detento!\r\n");

						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");
						System.out.println("\n");

						do {
							Collections.shuffle(alternativa2);
							System.out.println("São tipos primitivos da linguagem Java: ");
							System.out.println("\n");

							System.out.println("a) " + alternativa2.get(0));
							System.out.println("b) " + alternativa2.get(1));
							System.out.println("c) " + alternativa2.get(2));
							System.out.println("d) " + alternativa2.get(3));
							System.out.println("e) " + alternativa2.get(4));

							System.out.println("\n");
							System.out.print("Qual a alternativa certa?: ");
							String resposta = imput.next();

							System.out.println("\n");
							switch (resposta) {
							case "a":
							case "A":
								if (alternativa2.get(0).equals("boolean, double, float e byte.")) {
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
								if (alternativa2.get(1).equals("boolean, double, float e byte.")) {
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
								if (alternativa2.get(2).equals("boolean, double, float e byte.")) {
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
								if (alternativa2.get(3).equals("boolean, double, float e byte.")) {
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
								if (alternativa2.get(4).equals("boolean, double, float e byte.")) {
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
								System.out.println("Escolha Inválida.");
								System.out.println("\n");
							}
							contador++;
						} while (!acertou && contador <= 2);
						if (acertou == false) {
							System.out.println("GAME OVER.");
							break;

						}
						System.out.println("Parabéns voce passou do segundo nível.");
						System.out.println("Digite 1 para continuar.");
						navegacao = imput.nextInt();
						/* 3 questão */ if (navegacao == 1) {
							acertou = false;
							contador = 0;

							List alternativa3 = new ArrayList();
							alternativa3.add("100");
							alternativa3.add("120");
							alternativa3.add("50"); // resposta correta
							alternativa3.add("60");
							alternativa3.add("110");

							System.out.println("\n");
							System.out.println(
									"-----------------------------------------------------------------------------------------------------------------");

							System.out.println(
									"(Guarda)Alan Turing: Algoritmo? este nome me parece familiar... pode refrescar minha memória?");

							System.out.println(
									"-----------------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								Collections.shuffle(alternativa3);
								System.out.println("Um determinado algoritmo recebe dois valores e armazena\r\n"
										+ "nas variáveis A e B, em sequência faz o seguinte processamento \r\n"
										+ "math.pow(A, B)/2  supondo que A <- 10 e B <-2 \r\n"
										+ "qual seria a saída de dados? \r\n");
								System.out.println("\n");

								System.out.println("a) " + alternativa3.get(0));
								System.out.println("b) " + alternativa3.get(1));
								System.out.println("c) " + alternativa3.get(2));
								System.out.println("d) " + alternativa3.get(3));
								System.out.println("e) " + alternativa3.get(4));

								System.out.println("\n");
								System.out.print("Qual a alternativa certa?: ");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa3.get(0).equals("50")) {
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
									if (alternativa3.get(1).equals("50")) {
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
									if (alternativa3.get(2).equals("50")) {
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
									if (alternativa3.get(3).equals("50")) {
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
									if (alternativa3.get(4).equals("50")) {
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
						System.out.println("Parabéns você passou do terceiro nível.");
						System.out.println("Digite 1 para continuar.");
						navegacao = imput.nextInt();

//Questão 4	Marcus V.						
						if (navegacao == 1) {

							acertou = false;
							contador = 0;

							List alternativa4 = new ArrayList();
							alternativa4.add("10");
							alternativa4.add("15"); // resposta correta
							alternativa4.add("20");
							alternativa4.add("25"); 
							alternativa4.add("30");

							System.out.println("\n");
							System.out.println(
									"-----------------------------------------------------------------------------------------------------------------");

							System.out.println("O guarda Steve Jobs ...");

							System.out.println(
									"-----------------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								Collections.shuffle(alternativa4);

								System.out.println("Analise o trecho do algoritmo abaixo.\r\n" + "\r\n"
										+ "Algoritimo\r\n" + "Var\r\n" + "valor1, valor2 :inteiro\r\n" + "Inicio\r\n"
										+ "valor1 <- 10\r\n" + "valor2 <- 20\r\n" + "Se(valor2 > valor1)\r\n"
										+ "valor2 <- valor1+valor2/2\r\n" + "Fim-Se\r\n" + "Escreva valor2\r\n"
										+ "Fim");
								System.out.println("\n");
								System.out
										.println("Assinale a alternativa correta, em relação á saída do código acima.");
								System.out.println("\n");

								System.out.println("a) " + alternativa4.get(0));
								System.out.println("b) " + alternativa4.get(1));
								System.out.println("c) " + alternativa4.get(2));
								System.out.println("d) " + alternativa4.get(3));
								System.out.println("e) " + alternativa4.get(4));
								System.out.println("\n");
								System.out.println("Qual é a alternativa correta?");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa4.get(0).equals("15")) {
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
									if (alternativa4.get(1).equals("15")) {
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
									if (alternativa4.get(2).equals("15")) {
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
									if (alternativa4.get(3).equals("15")) {
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
									if (alternativa4.get(4).equals("15")) {
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
									System.out.println("Escolha Inválida.");
									System.out.println("\n");
								}
								contador++;
							} while ((!acertou) && (contador <= 2));

							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;
							}
		//Questão 05		
							if (navegacao==1) {
								acertou = false;
							    contador = 0;
								
								List alternativa5 = new ArrayList();
								alternativa5.add(" Linguagem de programação.");             
								alternativa5.add(" Estrutura sequencial.");                 
								alternativa5.add("Sequência de passos lógicos.");    //resposta correta      
								alternativa5.add(" IDE muito utilizada por programadores experientes.");
								alternativa5.add("Matemática aplicada a TI.");

								
								System.out.println("\n");
								System.out.println(
										"-----------------------------------------------------------------------------------------------------------------");

								System.out.println("O diretor Gavin Belson... ");

								System.out.println(
										"-----------------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									Collections.shuffle(alternativa5);
									System.out.println(" O que é um algoritmo?");
									System.out.println("\n");

									System.out.println("a) " + alternativa5.get(0));
									System.out.println("b) " + alternativa5.get(1));
									System.out.println("c) " + alternativa5.get(2));
									System.out.println("d) " + alternativa5.get(3));
									System.out.println("e) " + alternativa5.get(4));

									System.out.println("\n");
									
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5.get(0).equals("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta! ");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
											System.out.println("\r\n");// testando, para ver se roda certo.
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
											System.out.println("\r\n");// testando, para ver se raoda certo.
										}
										break;
									case "b":
									case "B":
										if (alternativa5.get(1).equals("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa5.get(2).equals("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa5.get(3).equals("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa5.get(4).equals("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => "+usuario);
											System.out.println("|"+total + " => pontos|");
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
								System.out.println("Parabéns voce ...!!");//planejando 
								System.out.println("Digite 1 para continuar.");
								navegacao = imput.nextInt();
								
							}
						}

						// Proxima Questão exemplo.
						// do {
						// Collections.shuffle(alternativa1);
						// São tipos primitivos da linguagem Java:

						// A) int, string, long e real.
						// B) char, int, real e bit.
						// C) boolean, double, float e byte.
						// D) real, short, long e char.
						// E) string, long int, short int e float.

						// contador++;
						// }while (!acertou));

					}
				} while (navegacao != 0);
				break;

			case 3:
				do {
					System.out.println("-------------------");
					System.out.println("|Desenvolvido por:|");
					System.out.println("|Felipe Dias      |");
					System.out.println("|Ji               |");
					System.out.println("|Marcus Vinicius  |");
					System.out.println("|Pedro            |");
					System.out.println("-------------------");
					System.out.println("\r\n");
					System.out.println("Digite 0 para voltar para o menu.");
					navegacao = imput.nextInt();
				} while (navegacao != 0);

				break;

			case 4:
				System.out.println("você está saindo do jogo...");
				break;

			default:
				System.out.println("Opção inválida.");

			}

		} while (opcao != 4);

	}

}
