package main.java.models;

import java.util.ArrayList;
import java.util.List;

public class WordsList {

    private final List<String> wordsList;
    private final String STOP_WORD = "stop";
    private final int MIN_WORD_LENGTH = 5;


    public WordsList(){
        wordsList = new ArrayList<>();
    }
    public void fillInWordList() {
        System.out.println("Start entering words:\n");
        while (true){
            String line = Reader.readUserInput();
            if(line.equalsIgnoreCase(STOP_WORD)){
                break;
            }
            wordsList.add(line);
        }
    }
    public void printUserInput(){
        for (String word : wordsList) {
            System.out.println(word);
        }
        System.out.println("The end \n");
    }

    public void printWordsStartWithS() {
        System.out.println("These are words starting with -S- \n");
        boolean noWordsWithS = true;
        for (String word : wordsList) {
            if (word.startsWith("s")) {
                noWordsWithS = false;
                System.out.println(word);
            }
        }

        if (noWordsWithS) {
            System.out.println("no words found");
        }
    }

    public void printLongWords() {
        System.out.println("These are long words: \n");
        for (String word : wordsList) {
            if (word.length() > MIN_WORD_LENGTH) {
                System.out.println(word);
            }
        }
    }
}
