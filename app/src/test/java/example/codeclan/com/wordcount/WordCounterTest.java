package example.codeclan.com.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/01/2018.
 */

public class WordCounterTest {

    private WordCounter wordCounter;

    @Before
    public void before(){
        String words = "A block of text";
        wordCounter = new WordCounter(words);
    }

    @Test
    public void canGetWOrdCount(){
        assertEquals(4, wordCounter.getWordCount());
    }


}
