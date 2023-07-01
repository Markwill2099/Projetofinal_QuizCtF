package Projetofinal_QuizCtF;
// Declaração do pacote do código fonte.

public class LoginException extends Throwable {
// Declaração da classe LoginException que estende a classe Throwable.
// Isso significa que LoginException é uma classe de exceção que pode ser lançada e capturada durante a execução do programa.

    public LoginException(String ignoredS) {
        // Construtor da classe LoginException que recebe uma String ignorada como parâmetro.
        // Neste caso, o parâmetro não é utilizado no corpo do construtor.

    }

    public String getMessage() {
        // Método getMessage() sobrescrito da classe Throwable.
        // Retorna uma String que representa a mensagem de erro associada à exceção.
        // Neste caso, o método sempre retorna o valor String "false".

        return String.valueOf(false);
    }
}
