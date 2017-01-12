package com.example.cipri.fitnesstracker.classes;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

/**
 * Created by Petruta Deac on 12/6/2016.
 */

public class AducereInformatii_JSON extends AsyncTask<String,Void,List<Aliment>> {

    List<Aliment> listaAlimente=new ArrayList<Aliment>();
    @Override
    protected List<Aliment> doInBackground(String... params) {
        try {
            URL url=new URL(params[0]);
            HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
            InputStream is=httpURLConnection.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(is);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuilder json=new StringBuilder();
            String linie=null;

            while ((linie=bufferedReader.readLine())!=null)
            {
                json.append(linie);
            }

            JSONObject jsonObject=new JSONObject(json.toString());
            JSONObject jsonObj=jsonObject.getJSONObject("alimente");

            JSONArray lista=jsonObj.getJSONArray("aliment");
            for (int i=0;i<lista.length();i++)
            {
                JSONObject element=lista.getJSONObject(i);
                Aliment aliment=new Aliment(element.getString("-denumire"),
                        Integer.parseInt(element.getString("-calorii")),
                       Double.parseDouble( element.getString("-cantitate")));

                listaAlimente.add(aliment);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listaAlimente;
    }
}
