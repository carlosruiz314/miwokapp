package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


/**
 * Extend ArrayAdapter to take a <Word> object
 * Access a custom layout and set the values of the TextViews to the corresponding value of the Word object at a given position
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter, it is not going to use this second argument
        //
        super(context, 0, objects);
    }

    // This returns a list item with the desired layout and data
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        ((TextView) convertView.findViewById(R.id.miwok_text_view)).setText(getItem(position).getMiwokTranslation());
        ((TextView) convertView.findViewById(R.id.default_text_view)).setText(getItem(position).getDefaultTranslation());
        return convertView;
    }
}

/* Links to include in notes:

Sample code from Android Developers: https://developer.android.com/samples/CustomChoiceList/src/com.example.android.customchoicelist/MainActivity.html
Documentation on getView(): https://developer.android.com/reference/android/widget/ArrayAdapter.html#getView(int, android.view.View, android.view.ViewGroup)
ArrayAdapter docs: https://developer.android.com/reference/android/widget/ArrayAdapter.html
LayoutInflater docs: https://developer.android.com/reference/android/view/LayoutInflater.html

*/