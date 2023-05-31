package com.example.spravochnik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mushroom1 extends AppCompatActivity {
    private String[] arraymushroom = {"Белый гриб — общепринятое название для нескольких видов грибов, различающихся, в основном, местом роста: в светлых лиственных лесах, или берёзовых, или дубовых, или хвойных. И, конечно, у них есть некоторые отличия во внешнем виде.\n" +
            "\n" +
            "Белый гриб высоко ценится за прекрасные вкусовые качества. В кулинарных книгах разных народов можно найти множество рецептов блюд с белым грибом. Это первые и вторые люда, закуски и салаты. Белый гриб можно заготавливать впрок: сушить, солить, мариновать.\n" +
            "В разных регионах у него есть собственные местечковые названия, как, например, широко известное «Боровик»"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mushroom1);
        ListView mushroomList = findViewById(R.id.mushroomList);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arraymushroom);
        mushroomList.setAdapter(adapter);
    }
}