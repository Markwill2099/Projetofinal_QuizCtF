import Projetofinal_QuizCtF.LoginException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class main {
    public static void main(String[] args) {
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

        System.out.println(letterC + letterT + letterF);
        System.out.println("BEM-VINDO ao Capture the Flag - SKYNET, The Game\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade, jogador: ");
        try {
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade <= 18) {
                throw new InputMismatchException("Você deve ter mais de 18 anos para entrar na partida!");
            }

            login(scanner);
            System.out.println();

            System.out.println("\nDESAFIOS CtF - Capture the Flag");

            System.out.println("Que comecem os jogos!");

            // Interface Collection

            Collection<String> perguntas = new ArrayList<>();

            perguntas.add("O que significa a sigla VPN?");
            perguntas.add("Qual é o termo utilizado para descrever uma pessoa que tenta obter acesso não autorizado a sistemas computacionais?");
            perguntas.add("Qual é o protocolo mais comumente utilizado para enviar e receber e-mails?");
            perguntas.add("O que significa a sigla XSS em cibersegurança?");
            perguntas.add("Qual é o principal objetivo do ataque DDoS?");

            Collection<List<String>> alternativas = new ArrayList<>();
            List<String> alternativasPergunta1 = new ArrayList<>();
            alternativasPergunta1.add("Virtual Private Network");
            alternativasPergunta1.add("Virus Protection Network");
            alternativasPergunta1.add("Very Private Network");
            alternativasPergunta1.add("Visual Processing Node");
            alternativasPergunta1.add("Verified Public Node");
            alternativas.add(alternativasPergunta1);


            List<String> alternativasPergunta2 = new ArrayList<>();

            alternativasPergunta2.add("Hacker");
            alternativasPergunta2.add("Cracker");
            alternativasPergunta2.add("Phisher");
            alternativasPergunta2.add("Spyware");
            alternativasPergunta2.add("Programmer");
            alternativas.add(alternativasPergunta2);

            List<String> alternativasPergunta3 = new ArrayList<>();
            alternativasPergunta3.add("SMTP");
            alternativasPergunta3.add("HTTP");
            alternativasPergunta3.add("FTP");
            alternativasPergunta3.add("SSH");
            alternativasPergunta3.add("POP3");
            alternativas.add(alternativasPergunta3);


            List<String> alternativasPergunta4 = new ArrayList<>();

            alternativasPergunta4.add("Cross-Site Scripting");
            alternativasPergunta4.add("Secure Socket Layer");
            alternativasPergunta4.add("Extended Support System");
            alternativasPergunta4.add("External Security Scanner");
            alternativasPergunta4.add("System Services Switch");
            alternativas.add(alternativasPergunta4);

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

            Iterator<String> perguntasIterator = perguntas.iterator();
            Iterator<List<String>> alternativasIterator = alternativas.iterator();
            Iterator<String> respostasCorretasIterator = respostasCorretas.iterator();

            int pontuacao = 0;
            int perguntasRespondidasCorretamente = 0;

            List<String> codigos = new ArrayList<>();
            codigos.add("ABC123");
            codigos.add("DEF456");
            codigos.add("GHI789");
            codigos.add("JKL012");
            codigos.add("MNO345");

            List<String> paises = new ArrayList<>();
            paises.add("MISSÃO RÚSSIA:");
            paises.add("MISSÃO BRASIL:");
            paises.add("MISSÃO EUA:");
            paises.add("MISSÃO CHINA:");
            paises.add("MISSÃO JAPÃO:");

            List<String> flagsCapturadas = new ArrayList<>();

            while (perguntasIterator.hasNext() && alternativasIterator.hasNext() && respostasCorretasIterator.hasNext()) {
                String pais = gerarPais(paises);
                System.out.println(pais);

                String pergunta = perguntasIterator.next();
                List<String> alternativasPergunta = alternativasIterator.next();
                String respostaCorreta = respostasCorretasIterator.next();

                boolean respostaCerta = false;

                do {
                    System.out.println(pergunta);

                    Collections.shuffle(alternativasPergunta);

                    for (int i = 0; i < alternativasPergunta.size(); i++) {
                        System.out.println("[" + i + "] " + alternativasPergunta.get(i));
                    }

                    System.out.println("Digite a sua resposta: ");
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
                    }

                } while (!respostaCerta);

                System.out.println();

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

            System.out.println("Fim do jogo! Sua pontuação final: " + pontuacao);

            if (!flagsCapturadas.isEmpty()) {
                System.out.println("Parabéns! Você capturou as seguintes flags e evitou o detonamento das ogivas nucleares nestes países. Não pense que você me derrotou definitivamente. O servidor principal está bem escondido, John Connor:");

                for (String flag : flagsCapturadas) {
                    System.out.println(flag);
                }
                System.out.println("\nMensagem final: Parabéns, John Connor! Você venceu o jogo e evitou o detonamento das ogivas nucleares! Você é um verdadeiro herói da humanidade. Continue lutando contra a SKYNET e protegendo nosso mundo!\n");

                //lerArquivo();

            }



            if (perguntasRespondidasCorretamente > 0) {
                System.out.println("Você respondeu corretamente a " + perguntasRespondidasCorretamente + " pergunta(s)!");

                lerArquivo();
            }

        } catch (LoginException e) {
            System.out.println("Erro de login: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void login(Scanner scanner) throws LoginException {
        System.out.println("Digite seu usuário: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (!usuario.equals("admin") || !senha.equals("admin")) {
            throw new LoginException("Credenciais de login inválidas!");
        } else {
            System.out.println("\nOlá, John Connor! Bem-vindo aos servidores da SKYNET. Não pense que conseguirá me destruir tão facilmente. Vamos ver se você é capaz de decifrar as perguntas.\n");

            //lerArquivo();


        }

    }

    public static String gerarCodigo(List<String> codigos) {
        Random random = new Random();
        int index = random.nextInt(codigos.size());
        return codigos.remove(index);
    }

    public static String gerarPais(List<String> paises) {
        Random random = new Random();
        int index = random.nextInt(paises.size());
        return paises.get(index);
    }

    public static void lerArquivo() {
        Path arquivo = Paths.get("C:\\Projetofinal_QuizCtF\\Flag_Final.txt");

        try {
            List<String> conteudo = Files.readAllLines(arquivo);
            System.out.println("Conteúdo do arquivo:\n");
            for (String linha : conteudo) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
