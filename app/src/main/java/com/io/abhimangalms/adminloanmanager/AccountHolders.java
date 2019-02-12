package com.io.abhimangalms.adminloanmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class AccountHolders extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_holders);

        listView = findViewById(R.id.accountHoldersListView);

        initListView();

    }

    private void initListView() {

        String[] items = new String[] {"Jain", "Siri", "Lans", "Ramani", "Simi", "Rani", "Suruk", "Rajappan"};

        ArrayList<String> listItems = new ArrayList<>(Arrays.asList(items));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.listview_contents, R.id.textitem, listItems);
        listView.setAdapter(adapter);
    }
}
