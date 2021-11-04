package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> { // обов'язкове створення додаткового класу в середині

    private ArrayList<RecyclerItem> arrayList;

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder { // додатковий клас; зберігає всі елементи, кожного елементу RecyclerView

        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;

        public RecyclerViewHolder(@NonNull View itemView) { // параметр itemView - це окремий елемент RecyclerView
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerItem> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        RecyclerItem recyclerItem = arrayList.get(position);

        holder.imageView.setImageResource(recyclerItem.getImage());
        holder.textView1.setText(recyclerItem.getText1());
        holder.textView2.setText(recyclerItem.getText2());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
