package ru.gb;

import java.util.*;

public class Words {
    public static void words() {
        String[] words = {"январь", "февраль", "март", "апрель",
                "май", "январь", "июнь", "июль",
                "август", "июнь", "июнь", "сентябрь",
                "октябрь", "ноябрь", "февраль", "декабрь" };

        System.out.println("Исходный массив: " + Arrays.asList(words));

        Map<String, Integer> mapWords = new HashMap<>();
        for (String word : words) {
            mapWords.put(word, mapWords.getOrDefault(word, 0) + 1);
        }
        System.out.println("Количество упоминаний каждого слова: " + mapWords);

        Set<String> uniqWord = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные значения: " + uniqWord);
    }
}

