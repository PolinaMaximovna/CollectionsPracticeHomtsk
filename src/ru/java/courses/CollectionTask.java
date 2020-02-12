package ru.java.courses;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionTask {


 public static void main(String...arcs){

     System.out.println("Task 1:");
     List simpleList = Arrays.asList(1,5,4,5,1,0,8,7,2,6);

     simpleList.forEach(x->System.out.print(x+","));
     List result = task1(simpleList);

     System.out.println();
     result.forEach(x->System.out.print(x+","));

     Integer[] array = {1,5,4,5,1,0,8,7,2,6};

     System.out.println();
     System.out.println("Task 2:");

     Arrays.asList(array).forEach(x->System.out.print(x+","));
     System.out.println();

     result = task2(array);
     result.forEach(x->System.out.print(x+","));
 }
   /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем список чисел
     * 2. Удаляем все дубли
     * 3. Сортируем список по возрастанию
     * 4. Преобразуем числа в строки
     * <p>
     * Подсказки:
     * Collections.sort() - сортировка
     * Удалять элементы из итерируемого списка нельзя - выпадет исключение
     */

    public static List<String> task1(List<Integer> source) {

        Set<Integer> mySet = new TreeSet<>(source);
        List<String> strings = mySet.stream().map(Object::toString).collect(Collectors.toList());

        return strings;
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем на входе массив чисел
     * 2. Преобразовываем его к списку
     * 4. Все четные числа увеличиваем на единицу
     * 5. Возвращаем кусок списка с 3-го по 7-й элемент
     * <p>
     * Подсказка: на входе может быть любое количество чисел
     */
    public static List<Integer> task2(Integer... array) {
        List<Integer> listNumbers = Arrays.asList(array);
        List<Integer> result = listNumbers.stream().map(x->x+((x+1)%2)).collect(Collectors.toList());
        return result.subList(2,6);

    }
}
