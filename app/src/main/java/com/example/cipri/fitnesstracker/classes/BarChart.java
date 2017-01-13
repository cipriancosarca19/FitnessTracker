package com.example.cipri.fitnesstracker.classes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Cipri on 12.01.2017.
 */

public class BarChart extends View {

    private ArrayList<Integer> values = new ArrayList<>();

    public BarChart(Context context) {
        super(context);
    }

    public BarChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void addValue(int value) {
        if(value >= 0) {
            values.add(value);
        }
    }

    public void clearValues() {
        values.clear();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(values.size() > 0)
        {
            int barWidth = canvas.getWidth() / values.size();
            int max = 0;
            for(int x : values)
            {
                if(x >  max)
                {
                    max = x;
                }
            }
            if(max > 0) {
                for(int i=0; i<values.size(); i++)
                {
                    int barHeight = canvas.getHeight() * values.get(i) / max;
                    Rect rectangle = new Rect(i * barWidth, canvas.getHeight() - barHeight,
                            (i+1) * barWidth, canvas.getHeight());
                    Paint p = new Paint();
                    p.setColor(Color.GREEN);
                    canvas.drawRect(rectangle, p);
                    p.setStyle(Paint.Style.STROKE);
                    p.setStrokeWidth(2);
                    p.setColor(Color.WHITE);
                    canvas.drawRect(rectangle, p);
                    p.setTextSize(60);
                    canvas.drawText(values.get(i).toString(),
                            rectangle.centerX() - p.measureText(values.get(i).toString())/ 2, rectangle.centerY(), p);
                }
            }
        }
    }
}


