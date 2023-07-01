import Projetofinal_QuizCtF.LoginException;
// Importação da classe LoginException do pacote Projetofinal_QuizCtF.
// Isso permite usar a classe LoginException no código atual.

import java.io.IOException;
// Importação da classe IOException do pacote java.io.
// Isso permite lidar com exceções relacionadas a operações de entrada/saída.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// Importação das classes Files, Path e Paths do pacote java.nio.file.
// Isso permite trabalhar com arquivos e caminhos de arquivo no sistema de arquivos.

import java.util.*;
// Importação do pacote java.util.
// Isso permite usar várias classes e utilitários fornecidos pelo pacote java.util, como List, Random, Scanner, etc.
public class main {
    public static void main(String[] args) {

        // Declaração das variáveis para as letras C, T e F
        String letterC =
                "  ________   \n" +
                        " /  _____/ \n" +
                        "/  /       \n" +
                        "|  \\_____  \n" +
                        " \\_______/ \n";

        String letterT =
                " _________ \n" +
                        "|___   ___|\n" +
                        "    | |    \n" +
                        "    | |    \n" +
                        "    |_|     \n";
        String letterF =
                " _________ \n" +
                        "|  ______/ \n" +
                        "| |______  \n" +
                        "| _____/   \n" +
                        "|_|         \n";

        // Exibição das letras C, T e F
        System.out.println(letterC + letterT + letterF);
        System.out.println("BEM-VINDO ao Capture the Flag - SKYNET, The Game\n");

        // Solicitação da idade do jogador
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade, jogador: ");
        try {
            int idade = scanner.nextInt();
            scanner.nextLine();

            // Verificação da idade mínima para jogar
            if (idade <= 18) {
                throw new InputMismatchException("Você deve ter mais de 18 anos para entrar na partida!");
            }

            // Chamada do método de login
            login(scanner);
            System.out.println();

            System.out.println("\nDESAFIOS CtF - Capture the Flag");
            System.out.println();
            System.out.println("Que comecem os jogos!");
            System.out.println();


            // Interface Collection
            Collection<String> perguntas = new ArrayList<>();

            // Adição das perguntas à coleção
            perguntas.add("O que significa a sigla VPN?");
            perguntas.add("Qual é o termo utilizado para descrever uma pessoa que tenta obter acesso não autorizado a sistemas computacionais?");
            perguntas.add("Qual é o protocolo mais comumente utilizado para enviar e receber e-mails?");
            perguntas.add("O que significa a sigla XSS em cibersegurança?");
            perguntas.add("Qual é o principal objetivo do ataque DDoS?");

            Collection<List<String>> alternativas = new ArrayList<>();
            // Alternativas para a primeira pergunta
            List<String> alternativasPergunta1 = new ArrayList<>();

            alternativasPergunta1.add("Virtual Private Network");
            alternativasPergunta1.add("Virus Protection Network");
            alternativasPergunta1.add("Very Private Network");
            alternativasPergunta1.add("Visual Processing Node");
            alternativasPergunta1.add("Verified Public Node");
            alternativas.add(alternativasPergunta1);

            // Alternativas para a segunda pergunta
            List<String> alternativasPergunta2 = new ArrayList<>();

            alternativasPergunta2.add("Hacker");
            alternativasPergunta2.add("Cracker");
            alternativasPergunta2.add("Phisher");
            alternativasPergunta2.add("Spyware");
            alternativasPergunta2.add("Programmer");
            alternativas.add(alternativasPergunta2);

            // Alternativas para a terceira pergunta
            List<String> alternativasPergunta3 = new ArrayList<>();

            alternativasPergunta3.add("SMTP");
            alternativasPergunta3.add("HTTP");
            alternativasPergunta3.add("FTP");
            alternativasPergunta3.add("SSH");
            alternativasPergunta3.add("POP3");
            alternativas.add(alternativasPergunta3);

            // Alternativas para a quarta pergunta
            List<String> alternativasPergunta4 = new ArrayList<>();

            alternativasPergunta4.add("Cross-Site Scripting");
            alternativasPergunta4.add("Secure Socket Layer");
            alternativasPergunta4.add("Extended Support System");
            alternativasPergunta4.add("External Security Scanner");
            alternativasPergunta4.add("System Services Switch");
            alternativas.add(alternativasPergunta4);

            // Alternativas para a quinta pergunta
            List<String> alternativasPergunta5 = new ArrayList<>();
            alternativasPergunta5.add("Sobrecarregar um servidor com tráfego para torná-lo inacessível");
            alternativasPergunta5.add("Obter acesso não autorizado a informações confidenciais");
            alternativasPergunta5.add("Alterar o código-fonte de um software para incluir vulnerabilidades");
            alternativasPergunta5.add("Enviar um grande número de e-mails indesejados");
            alternativasPergunta5.add("Realizar ataques a sites específicos");
            alternativas.add(alternativasPergunta5);


            Collection<String> respostasCorretas = new ArrayList<>();

            respostasCorretas.add("Virtual Private Network");
            respostasCorretas.add("Hacker");
            respostasCorretas.add("SMTP");
            respostasCorretas.add("Cross-Site Scripting");
            respostasCorretas.add("Sobrecarregar um servidor com tráfego para torná-lo inacessível");

            // Cria iteradores para percorrer as listas de perguntas, alternativas e respostas corretas. Os iteradores serão usados para acessar os elementos das listas sequencialmente.
            Iterator<String> perguntasIterator = perguntas.iterator();
            Iterator<List<String>> alternativasIterator = alternativas.iterator();
            Iterator<String> respostasCorretasIterator = respostasCorretas.iterator();

            // Variáveis para armazenar a pontuação atual do jogador e o número de perguntas respondidas corretamente.
            int pontuacao = 0;
            int perguntasRespondidasCorretamente = 0;

            // Cria uma lista de códigos, preenchendo-a com os valores especificados.
            List<String> codigos = new ArrayList<>();
            codigos.add("ABC123");
            codigos.add("DEF456");
            codigos.add("GHI789");
            codigos.add("JKL012");
            codigos.add("MNO345");

            // Cria uma lista de países, preenchendo-a com os valores especificados.
            List<String> paises = new ArrayList<>();
            paises.add("MISSÃO RÚSSIA:");
            paises.add("MISSÃO BRASIL:");
            paises.add("MISSÃO EUA:");
            paises.add("MISSÃO CHINA:");
            paises.add("MISSÃO JAPÃO:");

            // Cria uma lista vazia para armazenar as flags capturadas pelo jogador durante o jogo.
            List<String> flagsCapturadas = new ArrayList<>();

            // Enquanto houver perguntas, alternativas e respostas corretas disponíveis para serem processadas:
            while (perguntasIterator.hasNext() && alternativasIterator.hasNext() && respostasCorretasIterator.hasNext()) {

                // Gera e exibe um país aleatório.
                String pais = gerarPais(paises);
                System.out.println(pais);

                // Obtém a próxima pergunta, lista de alternativas e resposta correta usando os iteradores.
                String pergunta = perguntasIterator.next();
                List<String> alternativasPergunta = alternativasIterator.next();
                String respostaCorreta = respostasCorretasIterator.next();

                // Variável que indica se a resposta do jogador está correta ou não.
                boolean respostaCerta = false;

                do {
                    // Exibe a pergunta.
                    System.out.println(pergunta);

                    // Embaralha a lista de alternativas.
                    Collections.shuffle(alternativasPergunta);


                    for (int i = 0; i < alternativasPergunta.size(); i++) {
                        // Exibe as alternativas numeradas.
                        System.out.println("[" + i + "] " + alternativasPergunta.get(i));
                    }

                    System.out.println("Digite a sua resposta: ");
                    // Solicita a resposta do jogador.
                    String resposta = scanner.nextLine();

                    if (resposta.matches("\\d+")) {
                        int respostaInt = Integer.parseInt(resposta);

                        if (respostaInt >= 0 && respostaInt < alternativasPergunta.size()) {
                            String valorResposta = alternativasPergunta.get(respostaInt);

                            if (valorResposta.equals(respostaCorreta)) {
                                System.out.println("Resposta correta! Parabéns!");
                                respostaCerta = true;
                                pontuacao++;
                                perguntasRespondidasCorretamente++;
                            } else {
                                System.out.println("Resposta incorreta! Tente novamente.");
                            }
                        } else {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    } else {
                        System.out.println("Opção inválida! Tente novamente.");
                        // Verifica se a resposta do jogador é um número válido e corresponde a uma das alternativas.
                        // Em caso afirmativo, verifica se a resposta está correta. Se sim, atualiza as variáveis e finaliza o loop.
                        // Caso contrário, exibe mensagens de erro apropriadas.
                    }

                    // Repete o processo até que a resposta do jogador esteja correta.
                } while (!respostaCerta);

                System.out.println();

                // Verifica se o jogador pode capturar uma flag neste país.
                // Se sim, solicita a confirmação do jogador e, em caso afirmativo, gera um código de flag, adiciona-o à lista de flags capturadas e exibe uma mensagem de sucesso.
                if (flagsCapturadas.size() < 5) {
                    System.out.println("Deseja capturar a flag neste país? (s/n)");
                    String capturarFlag = scanner.nextLine();

                    if (capturarFlag.equalsIgnoreCase("s")) {
                        String flagCapturada = gerarCodigo(codigos);
                        flagsCapturadas.add(flagCapturada);
                        System.out.println("Você capturou a flag! Código da flag: " + flagCapturada);
                        System.out.println();
                    }
                }
            }
            // Exibe a mensagem de fim do jogo, mostrando a pontuação final obtida pelo jogador.
            System.out.println("Fim do jogo! Sua pontuação final: " + pontuacao);


            if (!flagsCapturadas.isEmpty()) {
                // Exibe uma mensagem de parabéns caso o jogador tenha capturado algumas flags.
                System.out.println("Parabéns! Você capturou as seguintes flags e evitou o detonamento das ogivas nucleares nestes países. Não pense que você me derrotou definitivamente. O servidor principal está bem escondido, John Connor! - SKYNET");

                for (String flag : flagsCapturadas) {

                    // Exibe as flags capturadas pelo jogador, uma por linha.
                    System.out.println(flag);
                }

                // Exibe uma mensagem final parabenizando o jogador pela vitória e incentivando-o a continuar lutando contra a SKYNET.
                System.out.println("\nMensagem final: Parabéns, John Connor! Você venceu o jogo e evitou o detonamento das ogivas nucleares! Você é um verdadeiro herói da humanidade. Continue lutando contra a SKYNET e protegendo nosso mundo!\n");

            }


            if (perguntasRespondidasCorretamente > 0) {
                System.out.println("Você respondeu corretamente a " + perguntasRespondidasCorretamente + " pergunta(s)!");

                // Chama o método "lerArquivo()" para exibir o conteúdo do arquivo contendo a mensagem final da resistência.
                lerArquivo();
            }

        } catch (LoginException e) {
            // Captura e trata a exceção "LoginException", exibindo uma mensagem de erro de login.

            System.out.println("Erro de login: " + e.getMessage());
        } catch (InputMismatchException e) {

            // Captura e trata a exceção "InputMismatchException", exibindo uma mensagem de erro de entrada de dados.
            System.out.println("Erro de entrada: " + e.getMessage());

        } finally {
            // Fecha o objeto Scanner no bloco "finally" para garantir que ele seja fechado independentemente de qualquer exceção.
            scanner.close();
        }
    }

    public static void login(Scanner scanner) throws LoginException {
        // Solicitação do usuário
        System.out.println("Digite seu usuário: ");
        String usuario = scanner.nextLine();
        // Solicitação da senha
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        // Verificação das credenciais de login
        if (!usuario.equals("Shodan2099") || !senha.equals("h4ck3r")) {
            // Lançamento de uma exceção de LoginException se as credenciais forem inválidas
            throw new LoginException("Credenciais de login inválidas!");
        } else {
            // Mensagem de boas-vindas se as credenciais forem válidas
            System.out.println("\nOlá, John Connor! Bem-vindo aos servidores da SKYNET. Não pense que conseguirá me destruir tão facilmente. Vamos ver se você é capaz de decifrar as perguntas.");
        }

    }

    public static String gerarCodigo(List<String> codigos) {
        // Criação de um objeto Random para gerar um índice aleatório
        Random random = new Random();
        // Geração do índice aleatório dentro do tamanho da lista de códigos
        int index = random.nextInt(codigos.size());
        // Remoção do código selecionado da lista de códigos
        return codigos.remove(index);
    }

    public static String gerarPais(List<String> paises) {
        // Criação de um objeto Random para gerar um índice aleatório
        Random random = new Random();
        // Criação de um objeto Random para gerar um índice aleatório
        int index = random.nextInt(paises.size());
        // Retorna o país correspondente ao índice gerado
        return paises.get(index);
    }

    public static void lerArquivo() {
        // Definição do caminho do arquivo
        Path arquivo = Paths.get("C:\\Projetofinal_QuizCtF\\Flag_Final.txt");

        try {
            // Leitura de todas as linhas do arquivo
            List<String> conteudo = Files.readAllLines(arquivo);

            // Exibição do conteúdo do arquivo
            System.out.println();
            System.out.println("Conteúdo da mensagem final da resistência encontrada na última missão:\n");
            System.out.println();
            for (String linha : conteudo) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            // Tratamento de exceção caso ocorra um erro na leitura do arquivo
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
