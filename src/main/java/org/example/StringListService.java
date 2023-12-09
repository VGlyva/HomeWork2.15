package org.example;

import java.util.Arrays;

public class StringListService implements StringList {
    private final String[] storage;
    private Integer size;

    public StringListService() {
        storage = new String[10];
    }

    public StringListService(Integer initSize) {
        storage = new String[initSize];
    }

    // Добавление элемента.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.

    @Override
    public String add(String item) {
        validateSize();
        validateItem(item);
        storage[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        validateSize();
        validateIndex(index);
        validateItem(item);
        if (index == size) {
            storage[size++] = item;
            return item;
        }
        System.arraycopy(
                storage, index, storage,
                index + 1, size - index
        );
        storage[index] = item;
        size++;
        return item;
    }

    // Установить элемент
    // на определенную позицию,
    // затерев существующий.
    // Выбросить исключение,
    // если индекс больше
    // фактического количества элементов
    // или выходит за пределы массива.

    @Override
    public String set(int index, String item) {
        validateIndex(index);
        validateItem(item);
        storage[index] = item;
        return item;
    }

    // Удаление элемента.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.

    @Override
    public String remove(String item) {
        validateItem(item);
        int index = indexOf(item);

        return remove(index);
    }

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.

    @Override
    public String remove(int index) {
        validateIndex(index);
        String item = storage[index];
        if (index != size) {
            System.arraycopy(
                    storage, index + 1,
                    storage, index, size - (index + 1)
            );
        }
        size--;
        return item;
    }

    // Проверка на существование элемента.
    // Вернуть true/false;

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    // Поиск элемента с конца.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    // Получить элемент по индексу.
    // Вернуть элемент или исключение,
    // если выходит за рамки фактического
    // количества элементов.

    @Override
    public String get(int index) {
        validateIndex(index);
        return storage[index];
    }

    // Сравнить текущий список с другим.
    // Вернуть true/false или исключение,
    // если передан null.

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    // Вернуть фактическое количество элементов.

    @Override
    public int size() {
        return size;
    }

    // Вернуть true,
    // если элементов в списке нет,
    // иначе false.

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Удалить все элементы из списка.

    @Override
    public void clear() {
        size = 0;
    }

    // Создать новый массив
    // из строк в списке
    // и вернуть его.

    @Override
    public String[] toArray() {
        return Arrays.copyOf(storage, size);
    }

    private void validateItem(String item) {
        if (item == null) {
            throw new NullItemException();
        }
    }

    private void validateSize() {
        if (size == storage.length) {
            throw new StringListIsFullException();
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidIndexException();
        }
    }
}
