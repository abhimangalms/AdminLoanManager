package com.io.abhimangalms.adminloanmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class LoanRequests extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_requests);

        listView = findViewById(R.id.loanRequestListView);

        initList();
    }


    public void initList() {

        String[] items = new String[]{"Jain", "Siri", "Lans", "Duen", "Ramani", "Simi", "Rani", "Suruk", "Rajappan"};
        ArrayList<String> listItems = new ArrayList<>(Arrays.asList(items));
//        ArrayList<String> listItems = new ArrayList<>(Arrays.asList(items));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.listview_contents, R.id.textitem, listItems);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //item click on listView

//                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(), DetailedLoanRequestActivity.class);
                    startActivity(intent);
//                }
            }
        });

    }
}
