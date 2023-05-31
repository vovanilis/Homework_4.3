package com.example.spravochnik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mushroom4 extends AppCompatActivity {

    private String[] arraymushroom = {"Мухомор (лат. Amanita) — род грибов семейства Аманитовые (лат. Amanitaceae), входящего в порядок Агариковые (Agaricales).\n" +
            "\n" +
            "Русское, а также характерное для большинства славянских языков название «мухомор» возникло из-за массового использования мухомора красного в бытовой санитарии, в качестве инсектицида против мух. Первоначально оно относилось только к мухомору красному, а позже было распространено на весь род.\n" +
            "\n" +
            "Общее описание\n" +
            "Плодовые тела главным образом крупные, с центральной ножкой, в начале развития полностью заключены в общее покрывало. Тип развития бивелангиокарпный или пилеокарпный.\n" +
            "Шляпка толстомясистая, иногда более тонкая, может быть с бугорком, легко отделяется от ножки. Кожица различных оттенков белого, красного и зелёного цветов, обычно покрыта различными лоскутами или хлопьями, оставшимися от общего покрывала. Край шляпки гладкий или тонкомясистый, рубчатый.\n" +
            "Пластинки свободные или слабо приросшие, белого или слегка желтоватого цвета. Есть пластиночки, часто разной длины.\n" +
            "Ножка цилиндрическая, обычно прямая, часто расширенная в основании.\n" +
            "Мякоть белая, у некоторых видов окрашивается на срезе, с запахом или без."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mushroom4);
        ListView mushroomList = findViewById(R.id.mushroomList);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arraymushroom);
        mushroomList.setAdapter(adapter);
    }
}