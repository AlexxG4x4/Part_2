package Lesson_3;

import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "lemon", "banana", "lemon", "banana",
                "pepper", "garlic", "grape", "melon", "pineapple", "pumpkin", "lemon", "banana",
                "potato", "carrot", "cherry", "garlic", "grape"};

        System.out.println("Вывести спсисок уникальных слов");
        uniqueWords(words);
        System.out.println("Телефонный справочник");
        TelephoneBook();
    }


    public static void uniqueWords(String[] words) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i< words.length; i++){
            if (treeMap.containsKey(words[i])){
                treeMap.put(words[i], treeMap.get(words[i])+1);
            }else{
                treeMap.put(words[i], 1);
            }
        }

        System.out.println(treeMap);
    }

    public static void TelephoneBook() {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("Иван", "+79857855414");
        telephoneBook.add("Александр", "+79102589887");
        telephoneBook.add("Любимая", "+79652587415");
        telephoneBook.add("Тёща", "+79526589887");
        telephoneBook.add("Задолбал", "+79652569882");

        System.out.println(telephoneBook.get("Тёща"));
        System.out.println(telephoneBook.get("Александр"));
        System.out.println(telephoneBook.get("Любимая"));
        System.out.println(telephoneBook.get("Иван"));
        System.out.println(telephoneBook.get("Леша"));
    }
}