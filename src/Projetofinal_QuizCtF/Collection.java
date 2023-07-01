package Projetofinal_QuizCtF;
// Declaração do pacote do código fonte.
// Pacote Projetofinal_QuizCtF, que é o pacote onde a classe está localizada.

// Abstração que define um conjunto de assinaturas de métodos que uma classe concreta deve implementar.
//
// É um contrato que especifica o comportamento esperado de uma classe que implementa essa interface.

public interface Collection<E> extends Iterable<E> {
    //A classe CollectionImplImpl é declarada como abstrata e estende a classe CollectionImpl. Ela é parametrizada com o tipo genérico podendo lidar com qualquer tipo de objeto.
// Declaração da interface Collection que estende a interface Iterable.
// Isso significa que Collection é uma interface que define um contrato para coleções de elementos genéricos do tipo E.

    int size();
    // Método size() retorna o número de elementos na coleção.

    boolean isEmpty();
    // Método isEmpty() verifica se a coleção está vazia.

    boolean contains(Object element);
    // Método contains(Object element) verifica se a coleção contém o elemento especificado.

    boolean add(E element);
    // Método add(E element) adiciona o elemento especificado à coleção.

    boolean remove(Object element);
    // Método remove(Object element) remove o elemento especificado da coleção.

    void clear();
    // Método clear() remove todos os elementos da coleção, deixando-a vazia.
}



