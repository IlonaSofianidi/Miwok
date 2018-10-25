package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class WordsAdapter extends ArrayAdapter<Word> {
    private Context context;
    private int resource;
    private List<Word> words_list;

    public WordsAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.words_list = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        WordHolder holder = null;
        if (listItemView == null) {
            LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
            listItemView = layoutInflater.inflate(resource, parent, false);

            holder = new WordHolder();
            holder.english_textView = (TextView) listItemView.findViewById(R.id.english_textView);
            holder.mivok_textView = (TextView) listItemView.findViewById(R.id.miwok_translation);

            listItemView.setTag(holder);
        } else {
            holder = (WordHolder) listItemView.getTag();
        }
        Word word = words_list.get(position);
        holder.english_textView.setText(word.getEnglish_translation());
        holder.mivok_textView.setText(word.getMiwok_translation());


        return listItemView;
    }

    static class WordHolder {
        TextView english_textView;
        TextView mivok_textView;
    }
}
