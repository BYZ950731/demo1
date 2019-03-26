package com.example.recycleviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 10; i++) {
            /*
            Fruit apple = new Fruit("Apple", R.drawable.if_apple_2003193);
            fruitList.add(apple);
            Fruit grapes = new Fruit("Grapes", R.drawable.if_grapes_2003194);
            fruitList.add(grapes);
            Fruit lemon = new Fruit("Lemon", R.drawable.if_lemon_2003191);
            fruitList.add(lemon);
            Fruit mango = new Fruit("Mango", R.drawable.if_mango_2003198);
            fruitList.add(mango);
            Fruit orange = new Fruit("Orange", R.drawable.if_orange_2003192);
            fruitList.add(orange);
            Fruit pear = new Fruit("Pear", R.drawable.if_pear_2003196);
            fruitList.add(pear);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.if_pineapple_2003197);
            fruitList.add(pineapple);
            Fruit pomegranate = new Fruit("Pomegranate", R.drawable.if_pomegranate_2003195);
            fruitList.add(pomegranate);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.if_strawberry_2003199);
            fruitList.add(strawberry);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.if_watermelon_2003190);
            fruitList.add(watermelon);
            */
            Fruit apple =new Fruit(getRandomLengthName("Apple"),R.drawable.if_apple_2003193);
            fruitList.add(apple);
            Fruit grapes = new Fruit(getRandomLengthName("Grapes"), R.drawable.if_grapes_2003194);
            fruitList.add(grapes);
            Fruit lemon = new Fruit(getRandomLengthName("Lemon"), R.drawable.if_lemon_2003191);
            fruitList.add(lemon);
            Fruit mango = new Fruit(getRandomLengthName("Mango"), R.drawable.if_mango_2003198);
            fruitList.add(mango);
            Fruit orange = new Fruit(getRandomLengthName("Orange"), R.drawable.if_orange_2003192);
            fruitList.add(orange);
            Fruit pear = new Fruit(getRandomLengthName("Pear"), R.drawable.if_pear_2003196);
            fruitList.add(pear);
            Fruit pineapple = new Fruit(getRandomLengthName("Pineapple"), R.drawable.if_pineapple_2003197);
            fruitList.add(pineapple);
            Fruit pomegranate = new Fruit(getRandomLengthName("Pomegranate"), R.drawable.if_pomegranate_2003195);
            fruitList.add(pomegranate);
            Fruit strawberry = new Fruit(getRandomLengthName("Strawberry"), R.drawable.if_strawberry_2003199);
            fruitList.add(strawberry);
            Fruit watermelon = new Fruit(getRandomLengthName("Watermelon"), R.drawable.if_watermelon_2003190);
            fruitList.add(watermelon);

        }
    }

    private String getRandomLengthName(String name) {
        Random random=new Random();
        int length =random.nextInt(20)+1;
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<length;i++)
        {
            builder.append(name);
        }
        return builder.toString();
    }
}
