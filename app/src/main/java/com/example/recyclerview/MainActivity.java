package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerItem> recyclerItems = new ArrayList<>();
        recyclerItems.add(new RecyclerItem
                (R.drawable.ic_baseline_sentiment_dissatisfied_24, "Sad", "Sad emoji"));
        recyclerItems.add(new RecyclerItem
                (R.drawable.ic_baseline_sentiment_satisfied_alt_24, "Happy", "Happy emoji"));
        recyclerItems.add(new RecyclerItem
                (R.drawable.ic_baseline_sentiment_very_dissatisfied_24, "Very sad", "Very sad emoji"));
        recyclerItems.add(new RecyclerItem
                (R.drawable.ic_baseline_sentiment_dissatisfied_24, "Sad", "Sad emoji"));
        recyclerItems.add(new RecyclerItem
                (R.drawable.ic_baseline_sentiment_satisfied_alt_24, "Happy", "Happy emoji"));
        recyclerItems.add(new RecyclerItem
                (R.drawable.ic_baseline_sentiment_very_dissatisfied_24, "Very sad", "Very sad emoji"));
        recyclerItems.add(new RecyclerItem
                (R.drawable.ic_baseline_sentiment_dissatisfied_24, "Sad", "Sad emoji"));
        recyclerItems.add(new RecyclerItem
                (R.drawable.ic_baseline_sentiment_satisfied_alt_24, "Happy", "Happy emoji"));
        recyclerItems.add(new RecyclerItem
                (R.drawable.ic_baseline_sentiment_very_dissatisfied_24, "Very sad", "Very sad emoji"));

        RecyclerView recyclerItem = findViewById(R.id.recycler_view); // клєпає розмітку з кодом
        recyclerItem.setHasFixedSize(true);

        RecyclerView.Adapter adapter = new RecyclerViewAdapter(recyclerItems); // міст з даними; заповнює RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this); // керує розташуванням RecyclerView

        recyclerItem.setAdapter(adapter);
        recyclerItem.setLayoutManager(layoutManager);
    }
}
