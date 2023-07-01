package Projetofinal_QuizCtF;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CollectionImplImpl<E> extends CollectionImpl<E> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return super.spliterator();
    }
}
