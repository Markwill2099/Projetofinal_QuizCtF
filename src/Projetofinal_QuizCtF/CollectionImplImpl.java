package Projetofinal_QuizCtF;

import java.util.Iterator; // Essa classe fornece métodos para percorrer sequencialmente os elementos de uma coleção.
import java.util.Spliterator; // Essa interface define um iterador para percorrer elementos de uma coleção ou sequência de forma paralela.
import java.util.function.Consumer; // Essa interface representa uma operação que aceita um único argumento e não retorna nenhum resultado. É frequentemente utilizada para processar elementos de uma coleção.

    // A classe CollectionImplImpl herda e implementa métodos da classe CollectionImpl e fornece implementações vazias para alguns desses métodos.
public abstract class CollectionImplImpl<E> extends CollectionImpl<E> {

    // Método sobrescrito size(), que retorna o tamanho da coleção. Neste caso, a implementação está retornando sempre zero, indicando que a coleção está vazia.
    @Override
    public int size() {
        return 0;
    }

    // Método sobrescrito isEmpty(), que verifica se a coleção está vazia. Neste caso, a implementação está sempre retornando false, indicando que a coleção não está vazia.
    @Override
    public boolean isEmpty() {
        return false;
    }

    // Método sobrescrito iterator(), que retorna um objeto Iterator para iterar sobre a coleção. Neste caso, a implementação está sempre retornando null, indicando que não há implementação para iteração.
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    // Método sobrescrito forEach(), que executa a ação especificada para cada elemento da coleção. Neste caso, a implementação está repassando a chamada para a implementação da classe pai, CollectionImpl.
    @Override
    public void forEach(Consumer<? super E> action) {
        super.forEach(action);
    }

    // Método sobrescrito spliterator(), que retorna um objeto Spliterator para a coleção. Neste caso, a implementação está repassando a chamada para a implementação da classe pai, CollectionImpl.
    @Override
    public Spliterator<E> spliterator() {
        return super.spliterator();
    }
}
