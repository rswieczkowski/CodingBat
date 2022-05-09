package pl.ap_1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {

    public List wordsWithoutList(String[] words, int len) {

        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                wordList.add(words[i]);
            }
        }
        return wordList;
    }

}
