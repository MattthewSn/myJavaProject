package Lesson_8;

import java.util.*;

class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Telegram", "Signal", "Viber",
                "ICQ", "Signal", "Viber",
                "WhatsApp", "Skype", "Telegram",
                "WhatsApp", "ICQ", "Skype",
                "Signal", "Viber", "Telegram",
                "Skype", "Telegram", "ICQ", "Signal"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Stepanov", "111111111");
        directory.add("Petrov", "222222222");
        directory.add("Sidorov", "333333333");
        directory.add("Petrov", "44444444");
        directory.add("Golubev", "55555555");
        directory.add("Ivanov", "666666666");
        directory.add("Volkov", "777777777");
        directory.add("Ivanov", "888888888");
        directory.add("Stepanov", "999999999");

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Petrov"));
        System.out.println(directory.get("Sidorov"));
        System.out.println(directory.get("Stepanov"));
        System.out.println(directory.get("Golubev"));
        System.out.println(directory.get("Volkov"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
