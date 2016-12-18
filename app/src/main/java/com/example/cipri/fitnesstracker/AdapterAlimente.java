package com.example.cipri.fitnesstracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cipri.fitnesstracker.classes.Aliment;

import java.util.List;

/**
 * Created by Petruta Deac on 11/28/2016.
 */

public class AdapterAlimente extends BaseAdapter{

    Context context;
    private LayoutInflater inflater=null;
    private List<String> denumiri;
    private List<Integer> calorii;

    public AdapterAlimente(Alimente alimente, List<String> denumiri,List<Integer> calorii)
    {
        context=alimente;
        denumiri=denumiri;
        calorii=calorii;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;
        rowView=inflater.inflate(R.layout.lista_alimente,null);
        holder.iv=(ImageView)rowView.findViewById(R.id.imgAliment);
        holder.tvDenumire=(TextView)rowView.findViewById(R.id.etAlimentDenumire);
        holder.tvCalorii=(TextView)rowView.findViewById(R.id.etAlimentCalorii);

        holder.tvDenumire.setText(denumiri.get(position).toString());
        holder.tvCalorii.setText(calorii.get(position).toString());
        return rowView;
    }

    public class Holder
    {
        ImageView iv;
        TextView tvDenumire;
        TextView tvCalorii;

    }
}
