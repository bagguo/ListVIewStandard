package com.example.bagguo.uicustomviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null) {
            actionBar.hide();
        }
        ListView listView = (ListView) findViewById(R.id.listView);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initFruits(){
        for (int i = 0; i <5; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.hai);
            fruitList.add(apple);
            Fruit heart = new Fruit("heart", R.drawable.heart);
            fruitList.add(heart);
            Fruit man = new Fruit("man", R.drawable.man);
            fruitList.add(man);
            Fruit message = new Fruit("message", R.drawable.message);
            fruitList.add(message);
            Fruit music = new Fruit("music", R.drawable.music);
            fruitList.add(music);
            Fruit niu = new Fruit("niu", R.drawable.niu);
            fruitList.add(niu);
            Fruit apple1 = new Fruit("hai", R.drawable.hai);
            fruitList.add(apple1);

        }
    }
}
