package com.example.appliancesapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ApplianceCategoryActivity extends ListActivity {


    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        ListView listAppliances = getListView();

        ArrayAdapter<Appliances> listAdapter = new ArrayAdapter<  > (
                this,
                android.R.layout.simple_list_item_1,


                Appliances.appliances

        );
        listAppliances.setAdapter(listAdapter);

    }

    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(ApplianceCategoryActivity.this, AppliancesActivity.class);

        // intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);

        startActivity(intent);
    }


}