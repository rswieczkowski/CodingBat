package pl.string_2;


public class CatDog {
    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;

        java.util.regex.Pattern dog = java.util.regex.Pattern.compile("dog");
        java.util.regex.Pattern cat = java.util.regex.Pattern.compile("cat");
        java.util.regex.Matcher dogMatcher = dog.matcher(str);
        java.util.regex.Matcher  catMatcher = cat.matcher(str);

        while (dogMatcher.find()) {
            countDog++;
        }
        while (catMatcher.find()) {
            countCat++;
        }

        return countCat == countDog;

    }

}
