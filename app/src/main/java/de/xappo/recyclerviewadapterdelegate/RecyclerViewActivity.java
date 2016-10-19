package de.xappo.recyclerviewadapterdelegate;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.xappo.recyclerviewadapterdelegate.adapter.NewsTeaser;
import de.xappo.recyclerviewadapterdelegate.adapter.NewsTipAdapter;
import de.xappo.recyclerviewadapterdelegate.adapter.PetFoodTip;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        List<Object> items = new ArrayList<>();

        items.add(new NewsTeaser("first", "my first text"));
        items.add(new NewsTeaser("second", "my second teaser"));
        items.add(new NewsTeaser("third", "my third trailer?"));
        items.add(new PetFoodTip(1, "tip1"));
        items.add(new NewsTeaser("fourth", "Einstein the IV."));
        items.add(new PetFoodTip(2, "tip2"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        NewsTipAdapter newsTipAdapter = new NewsTipAdapter(this);
        newsTipAdapter.items = items;

        recyclerView.setAdapter(newsTipAdapter);


    }
}
