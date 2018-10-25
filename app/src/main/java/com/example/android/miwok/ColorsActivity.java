package com.example.android.miwok;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));

        WordsAdapter wordsAdapter = new WordsAdapter(this,R.layout.list_item,words);
        ListView listView = (ListView)findViewById(R.id.list_words);
        listView.setAdapter(wordsAdapter);

    }
}
