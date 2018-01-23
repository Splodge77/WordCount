package example.codeclan.com.wordcount;

/**
 * Created by user on 23/01/2018.
 */

public class WordCounter {

    private String words;

    public WordCounter(String words){
        this.words = words;
    }

    private String[] splitWordsBySpace(){
        return this.words.split(" ");
    }

    public int getWordCount(){
        return splitWordsBySpace().length;
    }

}
