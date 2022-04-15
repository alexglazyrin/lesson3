package ru.gb;

import java.util.*;

import static ru.gb.Words.words;

public class Main {
    public static void main(String[] args) {
        words();

        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.add("Петров", "+7934567324");
        phoneBook1.add("Петров","+79112345677");
        phoneBook1.add("Иванов", "+79210010023");
        phoneBook1.add("Сидоров", "+79647833334");

        System.out.println(phoneBook1.get("Петров"));


    }
}
