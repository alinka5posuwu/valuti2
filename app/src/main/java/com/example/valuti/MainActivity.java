package com.example.valuti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим ListView в разметке активити
        ListView listView = (ListView) this.findViewById(R.id.listViews);

        // Создаём ListView, в котором будут храниться данные для списка
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        /* Наполняем List данным. В данном случае данные передаются Объектом,
         * в котором хранятся id, указывающие на флаги в ресурсах, а также
         * на Строки, в которых прописаны названия валют стран и аббревиатуры этих валют */
        list.add(new DataFlags(R.drawable.russia, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.usa, R.string.africa, R.string.africaZAR));
        list.add(new DataFlags(R.drawable.nigeria, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.korea, R.string.turkish, R.string.turkishTRY));
        list.add(new DataFlags(R.drawable.brazil, R.string.brazilian, R.string.brazilianBRL));
        list.add(new DataFlags(R.drawable.german, R.string.german, R.string.germanEUR));
        list.add(new DataFlags(R.drawable.canada, R.string.canadian, R.string.canadianCAD));

        /* Создаём адаптер, который будет передавать данные из List`а в
         * элемент ListView и подключаем его непосредственно к ListView`у
         */
        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }

}
