package Projetofinal_QuizCtF;

import java.util.NoSuchElementException; // A classe NoSuchElementException é uma exceção que é lançada quando um elemento solicitado não pode ser encontrado.


    public class InputMismatchException extends NoSuchElementException {
        // A classe InputMismatchException que estende a classe NoSuchElementException. Isso significa que InputMismatchException herda todos os métodos e comportamentos da classe NoSuchElementException.

        // A constante estática serialVersionUID do tipo long é usada para controlar a serialização da classe InputMismatchException.
        private static final long serialVersionUID = 8811230760997066428L;



        /**
         * Constructs an <code>InputMismatchException</code> with <tt>null</tt>
         * as its error message string.
         */
        public InputMismatchException() {
            super();
        }
        // Construtor padrão da classe InputMismatchException. Ele chama o construtor da classe pai (NoSuchElementException) para inicializar a exceção sem uma mensagem de erro específica.

        /**
         * Constructs an <code>InputMismatchException</code>, saving a reference
         * to the error message string <tt>s</tt> for later retrieval by the
         * <tt>getMessage</tt> method.
         *
         * @param   s   the detail message.
         */
        public InputMismatchException(String s) {
            super(s);
        }
        // Construtor adicional da classe InputMismatchException. Ele recebe uma mensagem de erro como argumento e chama o construtor da classe pai (NoSuchElementException) passando essa mensagem para inicializar a exceção com uma mensagem específica.
    }

