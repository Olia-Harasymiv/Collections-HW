package main.java.models;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Set Task
        System.out.println("This is a 'Set' task: \n");
        User user1 = new User(27, "HarryP");
        User user2 = new User(22, "RonW");
        User user3 = new User(28, "HermioneG");

        Set<User> userSetHash = new HashSet<>();
        userSetHash.add(user1);
        userSetHash.add(user2);
        userSetHash.add(user3);
        System.out.println(userSetHash);

        Set<User> userSetTree = new TreeSet<>();
        userSetTree.add(user1);
        userSetTree.add(user2);
        userSetTree.add(user3);
        System.out.println(userSetTree);


        //Map task
        System.out.println("\n  \n This is a 'Map' task: \n");


        Person person1 = new Person(905, "harry@gmail.com");
        Person person2 = new Person(605, "ron@gmail.com");
        Person person3 = new Person(808, "hermione@gmail.com");
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, person1);
        map.put(2, person2);
        map.put(3, person3);
        System.out.println("All users:" + " "  + map);
        map.remove(2);
        System.out.println(map.get(2) + " - " + "User 2 is deleted");

        //Task a - List
        System.out.println("\n \n This is Task a -List");
        WordsList wordsList = new WordsList();
        wordsList.fillInWordList();
        wordsList.printUserInput();
        wordsList.printWordsStartWithS();
        wordsList.printLongWords();
        //wordsList.enterWordStartingFrom('s');
        //wordsList.enterMoreThan5letters(5);
    }
}
