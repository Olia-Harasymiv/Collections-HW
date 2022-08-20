package main.java.models;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Set Task
        System.out.println("This is a 'Set' task: \n");
        UserSet userSet1 = new UserSet(27, "HarryP");
        UserSet userSet2 = new UserSet(22, "RonW");
        UserSet userSet3 = new UserSet(28, "HermioneG");

        Set<UserSet> userSetHashSet = new HashSet<>();
        userSetHashSet.add(userSet1);
        userSetHashSet.add(userSet2);
        userSetHashSet.add(userSet3);
        System.out.println(userSetHashSet);

        Set<UserSet> userSetTreeSet = new TreeSet<>();
        userSetTreeSet.add(userSet1);
        userSetTreeSet.add(userSet2);
        userSetTreeSet.add(userSet3);
        System.out.println(userSetTreeSet);


        //Map task
        System.out.println("\n  \n This is a 'Map' task: \n");
        MapPerson mapPerson1 = new MapPerson(905, "harry@gmail.com");
        MapPerson mapPerson2 = new MapPerson(605, "ron@gmail.com");
        MapPerson mapPerson3 = new MapPerson(808, "hermione@gmail.com");
        Map<Integer, MapPerson> map = new HashMap<>();
        map.put(1, mapPerson1);
        map.put(2, mapPerson2);
        map.put(3, mapPerson3);
        System.out.println(map);

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
