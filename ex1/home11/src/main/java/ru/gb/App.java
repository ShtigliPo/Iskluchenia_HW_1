package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
 * Метод должен пройтись по каждому элементу и проверить что он не равен null.
 * А теперь реализуйте следующую логику:
 * Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
 * Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer[] array = new Integer[] { 0, null, 2, 3, 4, null };
        checkArray(array);
    }

    private static void checkArray(Integer[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.add(i);
                System.out.printf("Элемент с индексом %d имеет значение null", i);
                System.out.println();
            }
        }
        if (result.size() > 0) {
            System.out.println("Значение null на позициях с индексами =>" + result);
        } else {
            System.out.println("Значения null отсутствуют");
        }
    }
}
