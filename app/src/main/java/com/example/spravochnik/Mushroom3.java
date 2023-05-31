package com.example.spravochnik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mushroom3 extends AppCompatActivity {

    private String[] arraymushroom = {"Подосиновик (оси́новик, красноголо́вик) — общее название для нескольких видов грибов рода Лекцинум (Обабок) (лат. Leccinum). Отличаются оранжево-красной (иногда белой) шляпкой и посинением мякоти гриба на срезе. От подберёзовиков также отличаются обычно более толстой, «коренастой» ножкой и плотной мякотью шляпки.\n" +
            "\n" +
            "Название «подосиновик» связывают не только с характерным местом произрастания этих грибов, но и с цветом шляпок, напоминающим осеннюю окраску осиновых листьев."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mushroom3);
        ListView mushroomList = findViewById(R.id.mushroomList);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arraymushroom);
        mushroomList.setAdapter(adapter);
    }
}