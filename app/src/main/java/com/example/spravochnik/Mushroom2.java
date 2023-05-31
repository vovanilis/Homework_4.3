package com.example.spravochnik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mushroom2 extends AppCompatActivity {
    private String[] arraymushroom = {"Лисичка (лат. Cantharellus) — род грибов семейства Лисичковые (лат. Cantharellaceae), входящего в порядок Кантарелловые (Cantharellales).\n" +
            "\n" +
            "Общее описание\n" +
            "Плодовые тела шляпконожечные, небольшие или крупные, мясистые, более или менее воронковидной формы, у большинства видов жёлтого или красноватого цвета, реже беловатые.\n" +
            "Шляпка мясистая, с довольно толстым, тупым краем.\n" +
            "Гименофор у большинства видов складчатый, не отделяемый от шляпки и ножки. Складки толстые, у большинства видов разветвлённые, у некоторых видов образуют «сеточку». У некоторых видов гименофор гладкий, как и у видов близкородственного рода Вороночник (Craterellus). Складчатый или гладкий гименофор является характерной особенностью грибов рода.\n" +
            "Ножка довольно толстая, мясистая, короткая.\n" +
            "Мякоть белого или жёлтого цвета, на разрезе у многих видов синеет, реже — краснеет или остаётся неокрашенной.\n" +
            "Покрывало отсутствует.\n" +
            "Споровый порошок у всех видов белого цвета."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mushroom2);
        ListView mushroomList = findViewById(R.id.mushroomList);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arraymushroom);
        mushroomList.setAdapter(adapter);
    }
}