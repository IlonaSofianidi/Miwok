package com.example.android.miwok;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        List<Word> words_list = new ArrayList<>();
        String[] english_words = getResources().getStringArray(R.array.numbers_array);
        String[] miwok_words = getResources().getStringArray(R.array.numbers_array_translation);
                for(int i =0;i<english_words.length;i++){
                    words_list.add(new Word(english_words[i],miwok_words[i]));
                }
        ListView listView = (ListView)findViewById(R.id.list_words);
        WordsAdapter wordsAdapter = new WordsAdapter(this,R.layout.list_item,words_list);
listView.setAdapter(wordsAdapter);

    }
}
