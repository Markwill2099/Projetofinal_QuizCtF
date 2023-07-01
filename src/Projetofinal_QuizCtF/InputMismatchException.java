package Projetofinal_QuizCtF;

import java.util.NoSuchElementException;


    public class InputMismatchException extends NoSuchElementException {
        private static final long serialVersionUID = 8811230760997066428L;

        /**
         * Constructs an <code>InputMismatchException</code> with <tt>null</tt>
         * as its error message string.
         */
        public InputMismatchException() {
            super();
        }

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
    }

