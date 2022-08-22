package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ArrayList<shapes> shapesList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shapes circle = new shapes("circle" , R.drawable.th,"Red");
        shapes square = new shapes("square" , R.drawable.download,"white");
       shapes octagon = new shapes("octagon" , R.drawable.oip,"gray");


       shapesList.add(circle);
       shapesList.add(square);
       shapesList.add(octagon);



       shapesAdapter shapesAdapter = new shapesAdapter(this,0,shapesList);
        ListView listView = findViewById(R.id.ListView);

        listView.setAdapter(shapesAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               shapes currentShape = shapesList.get(i);
                Intent detailsIntent = new Intent(MainActivity.this,DetailsActivity.class);

                detailsIntent.putExtra("currentShape", currentShape);
                startActivity(detailsIntent);
            }
        });



    }
}