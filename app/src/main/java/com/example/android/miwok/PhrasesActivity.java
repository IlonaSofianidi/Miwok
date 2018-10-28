package com.example.android.miwok;

import android.app.Activity;
import android.os.Bundle;

public class PhrasesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getFragmentManager().beginTransaction().replace(R.id.container, new PhrasesFragment()).commit();

    }
}
