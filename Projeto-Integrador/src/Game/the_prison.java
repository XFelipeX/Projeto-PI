package Game;

import java.util.Random;
import java.util.Scanner;

public class the_prison {
	static boolean perdeu(boolean opcao) {
		opcao = false;
		return opcao;
	}
	static void game_over() {
		System.out.println("/////////////////////////////////////");
		System.out.println("||||||||||||| GAME OVER |||||||||||||");
		System.out.println("/////////////////////////////////////");
		System.out.println("\n");
		System.out.println("´´´¶¶¶¶´´´´´´´´´´s¶¶¶¶¶´´´´´´´´´´´s¶¶¶\r\n" + 
				"´´´´¶¶¶¶¢´´´´´7¶¶¶¶¶¶¶¶¶¶¶¶¶´´´´´´´¶¶¶¶\r\n" + 
				"´´´7¶¶¶¶¢´´´¢¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶´´´´s¶¶¶¶s\r\n" + 
				"´´¶¶¶¶¶¶¶¶´ø¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1´¶¶¶¶¶¶¶¶\r\n" + 
				"´´¢øs$¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶´¶¶¶¶¢¢$$\r\n" + 
				"´´´´´´´´7¢ø¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶s´ø\r\n" + 
				"´´´´´´´´´´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n" + 
				"´´´´´´´´´´1¶¶¶¶ø´´7¶¶¶¶¶1´ø¶¶¶¶¶s\r\n" + 
				"´´´´´´´´´´´¶¶´´´´´´´¶¶¶´´´´´´s¶¶\r\n" + 
				"´´´´´´´´´´1¶¶´´´´´´$¶¶¶1´´´´´´¶¶1\r\n" + 
				"´´´´´´´´´´´¶¶¶´´s¶¶¶´´ø¶¶s´´¶¶¶¶\r\n" + 
				"´´´´´´´´´´´7¶¶¶¶¶¶¶¶´´´¶¶¶¶¶¶¶¶1\r\n" + 
				"´´´´´´´´´´´´´¶¶¶¶¶¶¶s$s¶¶¶¶¶¶\r\n" + 
				"´´´´´´´´´´´ø¶´¶s¶¶¶¶¶¶¶¶¶¶¶´¶´¶s\r\n" + 
				"´´´´7´´´´$¶¶¶´¶´´´´´´´´´´´$´¶¶¶¶¶\r\n" + 
				"´1¶¶¶¶¶¶¶¶¶¶ø´¶´¶¶$¶¶$¶¶$¶7¶1´¶¶¶¶¶¶¶¶¶¶¶\r\n" + 
				"´´¶¶¶¶¶¶¶¶´´´´¶¶¶¶¶¶¶¶¶¶¶¶¶¶1´´´¶¶¶¶¶¶¶¶¶\r\n" + 
				"´´´ø¶¶¶¶¶´´´´´´1¶¶¶¶¶¶¶¶¶¶¢´´´´´´¶¶¶¶¶¶¶\r\n" + 
				"´´´´´s¶¶ø´´´´´´´´´$¶¶¶¶¶s´´´´´´´´1¶¶¶\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"");
		System.out.println("/////////////////////////////////////");
		System.out.println("||||||||||||| GAME OVER |||||||||||||");
		System.out.println("/////////////////////////////////////");
	}
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
		Random random = new Random();

		for (int i = 0; i < Vetor.length; i++) {
			int indice2 = random.nextInt(Vetor.length);
			String posicao = Vetor[i];
			Vetor[i] = Vetor[indice2];
			Vetor[indice2] = posicao;
		}

	}
	//FUNÇÃO DO FEEDBACK: FÁCIL
	static void facilQ1 () {
		System.out.println("FeedBack:\r\n"
				+ "Resposta Correta - Do/While.\r\n"
				+ "A principal diferença entre o while e o do é que o teste condicional no caso do while é\r\n" + 
				"feita antes de se executar o código interno ao loop. Desta forma, o que pode acontecer no\r\n" + 
				"while é que o loop pode não ser executado se a condição for false. Já no loop do o corpo do\r\n" + 
				"loop é executado pelo menos uma vez, pois o teste de permanência é executado no fim do\r\n" + 
				"loop.");
	}
	static void facilQ2 () {
		System.out.println("FeedBack:\r\n"
				+ "Resposta Correta - escreva e system.out.print\r\n"
				+ "O objeto SYSTEM.OUT é a saída padrão, que permite exibir as Strings no console (terminal)\r\n"
				+ "de comando quando o aplicativo de Java é executado. ESCREVA é a saida de pseudocodigo de\r\n"
				+ "algoritimo.");
	}
	static void facilQ3 () {
		System.out.println("FeedBack:\r\n"
				+ "Resposta Correta - package, import e class.\r\n"
				+ "É muito importante manter a ordem. Primeiro, aparece uma (ou nenhuma) vez o package; \r\n"
				+ "depois, pode aparecer um ou mais imports; e, por último, as declarações de classes.");
	}
	static void facilQ4 () {
		System.out.println("FeedBack:\r\n"
				+ "Resposta Correta - Variável.\r\n"
				+ "Variáveis são alocações de memória nas quais podemos guardar dados. Elas têm um\r\n" + 
				"nome, tipo e valor. Toda vez que necessite usar de uma variável você precisa declará-la e só\r\n" + 
				"então poderá atribuir valores a mesma.");
	}
	static void facilQ5 () {
		System.out.println("FeedBack:\r\n"
				+ "Resposta Correta - O resultado final será n3 = 38.\r\n"
				+ "sendo n1 = 10\r\n"
				+ "n2<-- n1*3;  (n2<-- 10*3;) sendo assim n2=30\r\n"
				+ "n3<-- n1-2+n2;  (n3<-- 10-2+30) sendo assim n3=38");
		
	}
	//FUNÇÃO DO FEEDBACK: NORMAL
	static void normalQ1 () {
		System.out.println("FeedBack\r\n" 
				+ "Resposta Correta - Double. \r\n" 
				+ "Uma variável é do tipo flutuante quando o valor usado não for um número inteiro.\r\n" 
				+ "Podendo conter casas decimais depois do ponto ou virgula, dando significado ao nome em si. \r\n");
		}
	static void normalQ2 () {
		System.out.println("FeedBack\r\n" 
				+ "Resposta Correta - boolean, double, float e byte. \r\n" 
				+ "Como tipos primitivos entendemos aqueles tipos de informação mais usuais e básicos. \r\n"
				+ "São os habituais de outras linguagens de programação.\r\n"); 
				
		}
	static void normalQ3 () {
		System.out.println("FeedBack\r\n" 
				+ "Resposta Correta - 50 \r\n" 
				+ "A classe math.pow efetua potência no java.\r\n"
				+ "No exercicio a variável A recebe 10 e B recebe 2.\r\n"
				+ "Ficando assim: math.pow(10,2)/2 \r\n"
				+ "10 elevado a 2 é igual a 100, dividindo por 2 resulta em 50. \r\n");
	}
	static void normalQ4 () {
		System.out.println("FeedBack\r\n" 
				+ "Resposta Correta - 15 \r\n" 
				+ "Se a variável valor1 recebe 10 e a variável valor2 recebe 20.\r\n"
				+ "Então valor2 é maior do que valor1.\r\n"
				+ "Executa-se o que está dentro de SE. \r\n"
				+ "valor1(10)+valor2(20) é igual a 30 e dividi por 2 resultando em 15. \r\n");
	}
	static void normalQ5 () {
		System.out.println("FeedBack\r\n" 
				+ "Resposta Correta - Sequência de passos lógicos \r\n" 
				+ "Algoritmo é simplesmente uma \"receita\" para executarmos uma tarefa ou resolver algum problema.\r\n"
				+ "E como toda receita, um algoritmo também deve ser finito.\r\n"
				+ "Se seguirmos uma receita de bolo corretamente, conseguiremos fazer o bolo. \r\n");
	}
	
	//FUNÇÃO DO FEEDBACK: DIFÍCIL
		static void dificilQ1 () {
		System.out.println("FeedBack\r\n" 
				+ "Resposta Correta - Um bloco é definido por ({}) e contém um grupo de outros blocos. \r\n" 
				+ "Quando um novo bloco é criado um novo escopo local é aberto e permite a definição de\r\n" 
				+ "variáveis locais. As variáveis definidas dentro de um bloco só podem ser vistas \r\n" 
				+ "internamente a este, e são terminadas ou extintas no final da execução deste(}).");
		}
		static void dificilQ2 () {
				System.out.println("FeedBack\r\n" 
				+ "Resposta Correta - ");
		}
		static void dificilQ3 () {
				System.out.println("FeedBack\r\n"
				+ "Resposta Correta - A instrução de seleção única if, também conhecida por if-then, possibilita a execução condicional de um bloco de instruções.\r\n" + 
				"\r\n" + 
				"if (expressaoBooleana) {\r\n" + 
				"    //instruções que serão executadas caso a expressaoBooleana resulte true.\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"Também conhecida como instrução if-then-else, a instrução de seleção dupla if...else tem função complementar \r\n" + 
				"à de if: executa instruções no caso da expressão booleana de if resultar em false.\r\n" + 
				"\r\n" + 
				"if (expressaoBooleana) {\r\n" + 
				"    //instruções que serão executadas caso a expressaoBooleana resulte true.\r\n" + 
				"} else {\r\n" + 
				"    //instruções que serão executadas caso a expressaoBooleana resulte false.\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"A instrução switch por vezes chamada de switch...case possibilita a execução condicional de instruções de acordo com a \r\n" + 
				"correspondência entre a expressão avaliada e a constante em case.\r\n" + 
				"\r\n" + 
				"switch (expressao) {\r\n" + 
				"    case constante1: \r\n" + 
				"        // Instruções\r\n" + 
				"        break;\r\n" + 
				"    case constante2: \r\n" + 
				"        // Instruções\r\n" + 
				"        break;\r\n" + 
				"    case default: \r\n" + 
				"        // Instruções\r\n" + 
				"}");
		}
		static void dificilQ4 () {
				System.out.println("FeedBack\r\n"
				+ "Resposta Correta - A variável do tipo 'int'armazena 32 bits, ou qualquer inteiro \r\n"
				+ "entre -2.147.483.648 e 2.147.483.647");
		}
		static void dificilQ5 () {
				System.out.println("FeedBack\r\n"
				+ "Resposta Correta - MULTIPLICAR um número por zero é o mesmo que subtrair dele mesmo. ");
		}
	
	public static void main(String[] args) {
		/*
		 * CÓDIGO PRINCIPAL!
		 * 
		 * pontoG == PONTOS GANHOS pontoP == PONTOS PERDIDOS TESTANDO, DEPOIS MUDAR
		 * 
		 */
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		// DECLARAÇÃO DE VARIAVÉIS
		int ponto = 100, total = 0, pontoG = 100, pontoP = 50, opcao, navegacao = 1;
		String usuario = "";
		boolean exit =true;

		boolean sair= true;
		do {
			menu();
			opcao = input.nextInt();

			switch (opcao) {

			case 1:
				do {
					System.out.println(
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
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Digite 0 para voltar.");
					navegacao = input.nextInt();

				} while (navegacao != 0);

				break;

			case 2:
				// INICIO DO JOGO
				do {
					System.out.println(
							"----------------------------------------HISTÓRIA DO PERSONAGEM-----------------------------------------");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
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
									+ "| | |                                                                                             | | |\r\n"
									+ "| | |     Boa sorte, detento!                                                                     | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Digite 0 para voltar e 1 para começar o jogo.");

					navegacao = input.nextInt();
					if (navegacao == 1) {
						dificuldade();
						opcao = input.nextInt();

						// DIFICULDADE: FÁCIL

						if (opcao == 1) { // DIFICULDADE: FÁCIL
							System.out.println("Informe seu nome detento:");
							usuario = input2.nextLine();

							boolean acertou = false;
							int contador = 0;
							String alternativa1[] = new String[5];
							alternativa1[0] = "do/while.";
							alternativa1[1] = "while.";
							alternativa1[2] = "for.";
							alternativa1[3] = "repeat.";
							alternativa1[4] = "for/while.";// RESPOSTA CORRETA

							System.out.println("\n");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | (Guarda) José Gates: Está com dificuldades na faculdade, ajude ele a solucionar             | | |\r\n"
											+ "| | |                      esse problema!                                                         | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								System.out.println(
										"Existe um laço de repetição que sempre é executado pelo menos uma vez: ");
								System.out.println("\n");
								embaralhar(alternativa1);
								System.out.println("a) " + alternativa1[0]);
								System.out.println("b) " + alternativa1[1]);
								System.out.println("c) " + alternativa1[2]);
								System.out.println("d) " + alternativa1[3]);
								System.out.println("e) " + alternativa1[4]);
								System.out.println("\n");
								System.out.print("Qual a alternativa certa?: ");
								String resposta = input.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa1[0] == ("do/while.")) {
										System.out.println("Resposta Correta.");
//funcao questao 1										
										facilQ1();
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
//funcao questao 1											
										facilQ1();
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
//funcao questao 1											
										facilQ1();
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
//funcao questao 1											
										facilQ1();
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
//funcao questao 1											
										facilQ1();
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
//funcao questao 1									
								facilQ1();
								game_over();
								sair= perdeu(sair);
								break;

							}
							System.out.println("Parabéns voce passou do primeiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();
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
										"| | | (Guarda) Márcio Zuckerberg: Minha filha está tendo problemas para resolver um               | | |\r\n"
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
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa2[0] == ("escreva e system.out.print")) {
											System.out.println("Resposta Correta.");
											facilQ2();
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
											facilQ2();
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
											facilQ2();
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
											facilQ2();
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
											facilQ2();
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
									facilQ2();
									game_over();
									sair= perdeu(sair);
									break;

								}
							}
							System.out.println("Parabéns voce passou do segundo nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();

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
										"| | | (Guarda) Erick Turing: Algoritmo? este nome me parece familiar...                             | | |\r\n"
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
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa3[0] == ("package, import e class.")) {
											System.out.println("Resposta Correta.");
											facilQ3();
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
											facilQ3();
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
											facilQ3();
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
											facilQ3();
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
											facilQ3();
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
									facilQ3();
									game_over();
									sair= perdeu(sair);
									break;

								}
							}
							System.out.println("Parabéns você passou do terceiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();

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
								System.out.println("| | | (Guarda) Alan Jobs ...");
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
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa4[0] == ("Variável.")) {
											System.out.println("Resposta Correta.");
											facilQ4();
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
											facilQ4();
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
											facilQ4();
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
											facilQ4();
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
											facilQ4();
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
									facilQ4();
									game_over();
									sair= perdeu(sair);
									break;

								}
							}
							System.out.println("Parabéns você passou do quarto nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();

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
								System.out.println("| | | (Diretor) João Belson... ");
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
									System.out.println("inicio\n" + "inteiro: n1,n2,n3;\n" + "leia (n1);\n"
											+ "n2<-n1*3;\n" + "n3<-n1-2+n2;\n"
											+ "imprima(\"O resultado final será n3=\",n3);\n" + "fim");
									System.out.println("\n");
									System.out.println("a) " + alternativa5[0]);
									System.out.println("b) " + alternativa5[1]);
									System.out.println("c) " + alternativa5[2]);
									System.out.println("d) " + alternativa5[3]);
									System.out.println("e) " + alternativa5[4]);

									System.out.println("\n");

									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("O resultado final será n3 = 38.")) {
											System.out.println("Resposta Correta! ");
											facilQ5();
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
											facilQ5();
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
											facilQ5();
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
											facilQ5();
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
											facilQ5();
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
									facilQ5();
									game_over();
									sair= perdeu(sair);
									break;

								}
								System.out.println("Parabéns você escapou da prisão!!");
								System.out.println("Digite 0 para voltar ao menu principal.");
								navegacao = input.nextInt();
							}

						}
						// DIFICULDADE: NORMAL

						if (opcao == 2) { // DIFICULDADE: NORMAL

							// QUESTÃO DE NÚMERO 1: NORMAL

							System.out.println("Informe seu nome detento:");
							usuario = input2.next();

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
									"| | | (Guarda) José Gates: Está com dificuldades na faculdade, ajude ele a solucionar             | | |\r\n"
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
								String resposta = input.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa1[0] == ("double.")) {
										System.out.println("Resposta Correta.");
										normalQ1();
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
										normalQ1();
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
										normalQ1();
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
										normalQ1();
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
										normalQ1();
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
								normalQ1();
								game_over();
								sair= perdeu(sair);
								break;

							}
							System.out.println("Parabéns voce passou do primeiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();

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
										"| | | (Guarda)Márcio Zuckerberg: Minha filha está tendo problemas para resolver um                  | | |\r\n"
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
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa2[0] == ("boolean, double, float e byte.")) {
											System.out.println("Resposta Correta.");
											normalQ2();
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
											normalQ2();
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
											normalQ2();
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
											normalQ2();
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
											normalQ2();
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
									normalQ2();
									game_over();
									sair= perdeu(sair);
									break;

								}
							}
							System.out.println("Parabéns voce passou do segundo nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();

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
										"| | | (Guarda)Erick Turing: Algoritmo? este nome me parece familiar...                             | | |\r\n"
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
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa3[0] == ("50")) {
											System.out.println("Resposta Correta.");
											normalQ3();
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
											normalQ3();
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
											normalQ3();
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
											normalQ3();
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
											normalQ3();
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
									normalQ3();
									game_over();
									sair= perdeu(sair);
									break;

								}
							}
							System.out.println("Parabéns você passou do terceiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();
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
										"| | | (Guarda) Alan Jobs está com duvidas em um determinado código; Detento me ajude "
												+ "e vou te liberar para o próximo nível  ...");
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
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa4[0] == ("15")) {
											System.out.println("Resposta Correta.");
											normalQ4();
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
											normalQ4();
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
											normalQ4();
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
											normalQ4();
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
											normalQ4();
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
									normalQ4();
									game_over();
									sair= perdeu(sair);
									break;
								}
							}
							System.out.println("Parabéns você passou do quarto nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();

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
								System.out.println("| | | (Diretor) João Belson: Um forasteiro! como ousa vir tão longe, achou mesmo \"\r\n" + 
										"+ \"que iria tão longe sem ser pego? não fique triste... lembre-se que todo fim tem um novo começo muahahaha!! ");
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

									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("Sequência de passos lógicos.")) {
											System.out.println("Resposta Correta! ");
											normalQ5();
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
											normalQ5();
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
											normalQ5();
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
											normalQ5();
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
											normalQ5();
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
									normalQ5();
									game_over();
									sair= perdeu(sair);
									break;

								}
							}
							System.out.println("Parabéns você escapou da prisão!!");
							System.out.println("Digite 0 para voltar ao menu principal.");
							navegacao = input.nextInt();
						}
						// DIFICULDADE: DIFÍCIL

						if (opcao == 3) { // DIFICULDADE: DIFÍCIL

							// QUESTÃO DE NÚMERO 1: DIFÍCIL

							System.out.println("Informe seu nome detento:");
							usuario = input2.next();

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
									"| | | (Guarda) José Gates: Está com dificuldades na faculdade, ajude ele a solucionar             | | |\r\n"
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
								String resposta = input.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa1[0] == (" “ { ” e “ } ” ")) {
										System.out.println("Resposta Correta.");
										
										
										dificilQ1();
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
										
										
										dificilQ1();
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
										
										
										dificilQ1();
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
										
										
										dificilQ1();
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
										
										
										dificilQ1();
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
								game_over();
								sair= perdeu(sair);
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
							navegacao = input.nextInt();

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
										"| | | (Guarda) Márcio Zuckerberg: Minha filha está tendo problemas para resolver um                  | | |\r\n"
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
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa2[0] == ("21")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ2();
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
											
											
											dificilQ2();
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
											
											
											dificilQ2();
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
											
											
											dificilQ2();
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
											
											
											dificilQ2();
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
									game_over();
									sair= perdeu(sair);
									break;
								}
							}
							System.out.println("Parabéns você passou do segundo nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();

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
								System.out.println("| | | (Guarda) Erick Turing: Algoritmo? este nome me parece familiar...                | | |\\r\\n\"\r\n" 
										          +"| | |                      pode refrescar minha memória?   ");
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
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa3[0] == ("if; if ... else; switch.")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ3();
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
											
											
											dificilQ3();
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
											
											
											dificilQ3();
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
											
											
											dificilQ3();
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
											
											
											dificilQ3();
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
									game_over();
									sair= perdeu(sair);
									break;
								}
							}
							System.out.println("Parabéns você passou do terceiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();

							// QUESTÃO NÚMERO 4: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa4[] = new String[5];
								alternativa4[0] = "-8388608 a 8388607. ";
								alternativa4[1] = "-128 a 127. "; 
								alternativa4[2] = "-32768 a 32767. ";
								alternativa4[3] = "-9223372036854775808 a 9223372036854775807. ";
								alternativa4[4] = "-2147483648 a 2147483647.";//RESPOSTA CORRETA

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Guarda) Alan Jobs: ZzzZzZZzZzzZzzZ   huur "
										+ "Verme insolente, me acordou e acha que vai sair desta tão fácil assim? ");
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
									System.out.println(" No Java,um tipo inteiro (int) utiliza quatro bytes para armazenamento.\r\n"
											+ "a faixa máxima possível de valores inteiros para se armazenar em uma variável do tipo \r\n"
											+ "primitivo int é de: \r\n");
									System.out.println("\n");
									
									System.out.println("\n");

									System.out.println("a) " + alternativa4[0]);
									System.out.println("b) " + alternativa4[1]);
									System.out.println("c) " + alternativa4[2]);
									System.out.println("d) " + alternativa4[3]);
									System.out.println("e) " + alternativa4[4]);
									System.out.println("\n");
									
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa4[0] == ("-2147483648 a 2147483647.")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ4();
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
										if (alternativa4[1] == ("-2147483648 a 2147483647.")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ4();
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
										if (alternativa4[2] == ("-2147483648 a 2147483647.")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ4();
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
										if (alternativa4[3] == ("-2147483648 a 2147483647.")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ4();
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
										if (alternativa4[4] == ("-2147483648 a 2147483647.")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ4();
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
									game_over();
									sair= perdeu(sair);
									break;
								}
							}
							System.out.println("Parabéns você passou do quarto nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = input.nextInt();

							// QUESTÃO NÚMERO 5: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa5[] = new String[5];
								alternativa5[0] = "2,8";
								alternativa5[1] = "0"; // RESPOSTA CORRETA
								alternativa5[2] = "5";
								alternativa5[3] = "1";
								alternativa5[4] = "0,3";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Diretor) João Belson: Um forasteiro! como ousa vir tão longe, achou mesmo\r\n "
										+ "que iria tão longe sem ser pego? não fique triste... lembre-se que todo fim tem um novo começo muahahaha!! ");
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
									System.out.println("Algoritmo blank_01"); 
									System.out.println("	Var cont, res, n, x : Inteiro"); 
									System.out.println("	Inicio"); 
									System.out.println("		cont <- n, res <- 0, x <- 2, n <- 4"); 
									System.out.println("		enquanto (cont>=n) faca"); 
									System.out.println("			res <- res * x"); 
									System.out.println("			cont <- cont + 1"); 
									System.out.println("		fimenquanto"); 
									System.out.println("	escreva(res)"); 
									System.out.println("	fimalgoritmo"); 
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
									String resposta = input.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("0")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ5();
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
										if (alternativa5[1] == ("0")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ5();
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
										if (alternativa5[2] == ("0")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ5();
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
										if (alternativa5[3] == ("0")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ5();
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
										if (alternativa5[4] == ("0")) {
											System.out.println("Resposta Correta.");
											
											
											dificilQ5();
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
									game_over();
									sair= perdeu(sair);
									break;
								}
								System.out.println("Parabéns você escapou da prisão!!");
								System.out.println("Digite 0 para voltar ao menu principal.");
								navegacao = input.nextInt();
							}
							
						}

					} else {
						System.out.println("Opção inválida!");
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
					navegacao = input.nextInt();

				} while (navegacao != 0 );

				break;

			case 4:
				System.out.println("Você está saindo do jogo...");
				break;

			default:
				System.out.println("Opção inválida.");

			}

			
		} while (opcao != 4 && sair==true);

	}

}
// THE AND