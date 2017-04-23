package com.example.negibabu.jsonparse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DisplayListView extends AppCompatActivity {

    String json_string;
    JSONObject jsonObject;
    JSONArray jsonArray;
    ContactAdapter contactAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_listview_layout);
        listView = (ListView)findViewById(R.id.listview);

        contactAdapter= new ContactAdapter(this,R.layout.row_layout);
        listView.setAdapter(contactAdapter);
        json_string= getIntent().getExtras().getString("json_data");
        try {
            jsonObject= new JSONObject(json_string);
            //array name in JSON file

            jsonArray = new JSONObject(json_string).getJSONArray("server_response");
            int count=0;
            String item,price;
            while(count<jsonArray.length())
            {
                JSONObject JO= jsonArray.getJSONObject(count);
                // names in json file

                item=JO.getString("Item");
                price=JO.getString("Price");

                Contacts contacts = new Contacts(item,price);
                contactAdapter.add(contacts);
                count++;

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
