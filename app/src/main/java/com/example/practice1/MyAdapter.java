package com.example.practice1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{
    String s = "";
    private int numberItems;
    RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"), RuleBasedNumberFormat.SPELLOUT);


    public MyAdapter(int numberOfItems)
    {
        numberItems = numberOfItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.even_element;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, viewGroup, false);

        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i)
    {
        s = "";
        if (i % 2 == 0)
        {
            myViewHolder.myEvenImageView.setImageResource(R.drawable.white4head100px);
            myViewHolder.itemView.setBackgroundResource(R.color.color4head);
            s = nf.format(i+1);
            String capitalized = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
            myViewHolder.myEvenTextView.setText(capitalized);
            //myViewHolder.myEvenTextView.setText(String.valueOf(i));
        }
        else
        {
            myViewHolder.myEvenImageView.setImageResource(R.drawable.greypogchamp100px);
            myViewHolder.itemView.setBackgroundResource(R.color.colorpogchamp);
            s = nf.format(i+1);
            String capitalized = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
            myViewHolder.myEvenTextView.setText(capitalized);
            //myViewHolder.myEvenTextView.setText(String.valueOf(i));

        }
        //myViewHolder.bind(i);
    }

    @Override
    public int getItemCount()
    {
        return numberItems;
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView myEvenTextView;
        ImageView myEvenImageView;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);

            myEvenTextView = itemView.findViewById(R.id.evenTextView);
            myEvenImageView = itemView.findViewById(R.id.evenImageView);
        }

        void bind(int listIndex)
        {
            myEvenTextView.setText(String.valueOf(listIndex+1));
        }
    }
}
