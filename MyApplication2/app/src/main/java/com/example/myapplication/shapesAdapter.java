package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.material.Shapes;

import java.sql.Array;
import java.util.List;

public class shapesAdapter extends ArrayAdapter<shapes> {
        List<shapes>shapeslist;
    public shapesAdapter(@NonNull Context context, int resource, @NonNull List<shapes> objects) {
        super(context, resource, objects);
        shapeslist = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item ,parent , false);

         shapes currentShape = shapeslist.get(position);
        TextView shapeName = view.findViewById(R.id.list_name);
        ImageView shapeImage = view.findViewById(R.id.item_image);

        shapeName.setText(currentShape.getShapesName());
        shapeImage.setImageResource(currentShape.getShapesImage());

        return view;
    }
}
