package com.example.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   private List<Fruit> fruitList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter =new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit =fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private  void initFruits(){
        for(int i=0;i<10;i++){
            Fruit apple=new Fruit("Apple",R.drawable.if_apple_2003193);
            fruitList.add(apple);
            Fruit grapes=new Fruit("Grapes",R.drawable.if_grapes_2003194);
            fruitList.add(grapes);
            Fruit lemon=new Fruit("Lemon",R.drawable.if_lemon_2003191);
            fruitList.add(lemon);
            Fruit mango=new Fruit("Mango",R.drawable.if_mango_2003198);
            fruitList.add(mango);
            Fruit orange=new Fruit("Orange",R.drawable.if_orange_2003192);
            fruitList.add(orange);
            Fruit pear=new Fruit("Pear",R.drawable.if_pear_2003196);
            fruitList.add(pear);
            Fruit pineapple=new Fruit("Pineapple",R.drawable.if_pineapple_2003197);
            fruitList.add(pineapple);
            Fruit pomegranate=new Fruit("Pomegranate",R.drawable.if_pomegranate_2003195);
            fruitList.add(pomegranate);
            Fruit strawberry=new Fruit("Strawberry",R.drawable.if_strawberry_2003199);
            fruitList.add(strawberry);
            Fruit watermelon=new Fruit("Watermelon",R.drawable.if_watermelon_2003190);
            fruitList.add(watermelon);


        }


    }

}
