package pl.ap_1;

public class WordsWithout {

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;

        for (String word : words) {
            if (!word.equals(target)) {
                count++;
            }

        }
        String[] newArr = new String[count];

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                newArr[newArr.length - count] = words[i];
                count--;
            }
        }
        return newArr;
    }

}
