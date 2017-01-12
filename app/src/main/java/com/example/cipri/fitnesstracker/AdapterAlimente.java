package com.example.cipri.fitnesstracker;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cipri.fitnesstracker.classes.AducereInformatii_JSON;
import com.example.cipri.fitnesstracker.classes.Aliment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Petruta Deac on 11/28/2016.
 */

public class AdapterAlimente extends ArrayAdapter<Aliment> {


    public AdapterAlimente(Context context, List<Aliment> alimente) {
        super(context, 0, alimente);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.lista_alimente, parent, false);
        }




        Aliment alimentCurent = getItem(position);
        TextView textView=(TextView)listItemView.findViewById(R.id.tvAlimentCalorii);
        textView.setText(alimentCurent.getDenumire());
        CheckBox checkBox=(CheckBox)listItemView.findViewById(R.id.checkbox_alimente);
        checkBox.setChecked(false);
        return listItemView;
    }
}