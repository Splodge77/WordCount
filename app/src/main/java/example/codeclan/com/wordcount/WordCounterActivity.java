package example.codeclan.com.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText sentenceEditText;
    Button countButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        sentenceEditText = findViewById(R.id.sentence);
        countButton = findViewById(R.id.count);
        answerText = findViewById(R.id.answer);
    }

    public void onCountButtonClicked(View view){
        String sentence = sentenceEditText.getText().toString();
        WordCounter wordCounter = new WordCounter(sentence);
        String wordCount = String.valueOf(wordCounter.getWordCount());
        answerText.setText(wordCount);
    }
}
