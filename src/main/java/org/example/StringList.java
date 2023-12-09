package org.example;

public interface StringList {

    String add(String item);

    // Добавление элемента
    // на определенную позицию списка.
    // Если выходит за пределы фактического
    // количества элементов или массива,
    // выбросить исключение.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    String add(int index, String item);

    String  set(int index, String item);


    String remove(String item);


    String remove(int index);


    boolean contains(String item);


    int indexOf(String item);


    int lastIndexOf(String item);

    // Получить элемент по индексу.
    // Вернуть элемент или исключение,
    // если выходит за рамки фактического
    // количества элементов.

    String get(int index);

    boolean equals(StringList otherList);


    int size();


    boolean isEmpty();


    void clear();

    String[] toArray();
}

