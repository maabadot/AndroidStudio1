package com.example.practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener
{

    private RecyclerView recycler;
    private MyAdapter myAdapter;

    float x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycleView1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);

        recycler.setHasFixedSize(true);

        myAdapter = new MyAdapter(1000000);
        recycler.setAdapter(myAdapter);
        recycler.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event)
    {
        if (event.getAction() == MotionEvent.ACTION_DOWN)
        {
            x = event.getX();
            y = event.getY();
            if (x > 15 && x < 250)
            {
                finish();
            }
            return true;
        }


        return false;
    }

}
