package org.example;

public interface IntegerList {

    Integer add(Integer item);

    // Добавление элемента
    // на определенную позицию списка.
    // Если выходит за пределы фактического
    // количества элементов или массива,
    // выбросить исключение.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    Integer add(int index, Integer item);

    Integer  set(int index, Integer item);


    Integer remove(Integer item);


    Integer remove(int index);


    boolean contains(Integer item);


    int indexOf(Integer item);


    int lastIndexOf(Integer item);

    // Получить элемент по индексу.
    // Вернуть элемент или исключение,
    // если выходит за рамки фактического
    // количества элементов.

    Integer get(int index);

    boolean equals(IntegerList otherList);


    int size();


    boolean isEmpty();


    void clear();

    Integer[] toArray();
}

