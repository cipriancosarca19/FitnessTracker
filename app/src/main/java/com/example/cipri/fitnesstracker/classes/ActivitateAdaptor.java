package com.example.cipri.fitnesstracker.classes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.cipri.fitnesstracker.R;

import org.w3c.dom.Text;

import java.util.List;

import static com.example.cipri.fitnesstracker.R.layout.template_activitate;

/**
 * Created by Cipri on 02.12.2016.
 */

public class ActivitateAdaptor extends ArrayAdapter<Activitate> {
    public ActivitateAdaptor(Context context, int resource) {
        super(context, resource);
    }
    public ActivitateAdaptor(Context context,int resource,List<Activitate> objects)
    {
        super(context,resource,objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.template_activitate,null);}

            Activitate a=getItem(position);
            TextView textdescriere=(TextView)convertView.findViewById(R.id.textDescriere);
            TextView textcalorii=(TextView)convertView.findViewById(R.id.textCalorii);
            TextView textdurata=(TextView)convertView.findViewById(R.id.textDurata);

            textdescriere.setText("    "+a.getDenumire());
            textcalorii.setText("    "+a.getCalorii()+"  ");
            textdurata.setText("     "+a.getDurata()+"");

            return convertView;


        }
    }



